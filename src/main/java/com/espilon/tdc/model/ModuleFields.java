package com.espilon.tdc.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ModuleFields {
    
    private String _id;
    private String component;
    private List<Field> fields;
    private Map<String, Boolean> groupValidators;
    
}
