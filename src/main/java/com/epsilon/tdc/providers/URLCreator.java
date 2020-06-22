package com.epsilon.tdc.providers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epsilon.tdc.mongorepositories.CommonPropertiesRepository;
import com.espilon.tdc.model.CommonProperties;

@Component
public class URLCreator {

    @Autowired CommonPropertiesRepository commonProperties;

    public URI createRequestURI(String componentToDelete) throws URISyntaxException {
        CommonProperties allProperties = commonProperties.getCommonProperties();
        Map<String, String> cleanUpURLMap = allProperties.getCleanupURLMap();
        String hqeCleanUpURL = cleanUpURLMap.get(componentToDelete);
        StringBuilder urlBuilder = new StringBuilder(allProperties.getApiURL());
        urlBuilder.append(hqeCleanUpURL);
        String fullURL = urlBuilder.toString();
        URI cleanUpURI = null;
        try {
            cleanUpURI = new URI(fullURL);
        } catch (URISyntaxException e) {
            throw new URISyntaxException("A problem has occured while creating the URL",e.getMessage());
        }
        return cleanUpURI;
    }
}
