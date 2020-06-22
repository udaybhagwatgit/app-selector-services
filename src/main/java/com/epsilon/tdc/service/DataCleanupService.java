package com.epsilon.tdc.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.epsilon.tdc.providers.ResponseFactory;
import com.epsilon.tdc.providers.URLCreator;

@Component
public class DataCleanupService {

    @Autowired URLCreator urlCreator;
    @Autowired ResponseFactory responseFactory;

    public Map<String, Object> cleanUpData(Object cleanUpModel, String component) {
        Map<String, Object> responseMap = new HashMap<>();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<?> responseEntity = null;
        URI requestURI = null;
        try {
            requestURI = urlCreator.createRequestURI(component);
        } catch (URISyntaxException e) {
            responseMap.put("statusCode", "404");
            responseMap.put("responseBody", "An error occured while processing the request URL");
            return responseMap;
        }

        responseEntity = restTemplate.postForEntity(requestURI,
                cleanUpModel, responseFactory.returnResponseObject(component));

        responseMap.put("statusCode", responseEntity.getStatusCode());
        responseMap.put("responseBody", responseEntity.getBody());
        return responseMap;
    }

}
