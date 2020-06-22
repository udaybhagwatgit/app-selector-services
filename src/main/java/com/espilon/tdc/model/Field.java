package com.espilon.tdc.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Field {

    private String labelName;
    private String fieldType;
    private List<Map<String, String>> fieldValues;
    private Map<String, Boolean> validation;
    private String controlName;
}
