package com.epsilon.tdc.providers;

import org.springframework.stereotype.Component;

import com.epsilon.tdc.enums.ResponseTypesEnum;

@Component
public class ResponseFactory {

    public Class<?> returnResponseObject(String componentName) {
        Class<?> clazz = null;
        String responseClassName = ResponseTypesEnum.valueOf(componentName).returnClassName();
        try {
            clazz = Class.forName(responseClassName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clazz;
    }

}
