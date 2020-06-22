package com.epsilon.tdc.enums;

public enum RequestTypesEnum {
    
    HQE("com.espilon.tdc.model.HQECleanupModel");

    private String componentName;

    private RequestTypesEnum(String componentName) {
        this.componentName = componentName;
    }
    
    public String returnClassName() {
        return this.componentName;
    }
}
