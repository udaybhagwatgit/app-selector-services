package com.epsilon.tdc.providers;

import com.espilon.tdc.model.HQECleanupResponse;

abstract public class DataCleanupType {
    
    abstract Object getResponseType(String componentType);
    
}

class HQECleanupResponseType extends DataCleanupType {

    @Override
    public HQECleanupResponse getResponseType(String componentType) {
        return new HQECleanupResponse();
    }
    
}