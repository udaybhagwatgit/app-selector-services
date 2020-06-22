package com.espilon.tdc.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonProperties {
    
    private String _id;
    private String jenkinsUserName;
    private String jenkinsPassword;
    private String jenkinsJobURL;
    private String apiURL;
    private Map<String, String> cleanupURLMap;

}
