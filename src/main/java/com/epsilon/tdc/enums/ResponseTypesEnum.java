package com.epsilon.tdc.enums;

public enum ResponseTypesEnum {

    HQE("com.espilon.tdc.model.HQECleanupResponse");

    private String componentName;

    private ResponseTypesEnum(String componentName) {
        this.componentName = componentName;
    }
    
    public String returnClassName() {
        return this.componentName;
    }

}
