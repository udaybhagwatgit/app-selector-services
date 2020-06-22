package com.espilon.tdc.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HQECleanupResponse {

    private String componentName;
    private int numberOfDocumentsCleaned;
    private int totalNumberOfDocuments;
    private String operationMessage;
    private Map<String, String> individualResults;
    private String exceptionMessage;
    private String exceptionStackTrace;
}
