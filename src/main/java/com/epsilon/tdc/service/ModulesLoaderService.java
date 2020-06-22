package com.epsilon.tdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.tdc.mongorepositories.ModuleFieldsRepository;
import com.espilon.tdc.model.ModuleFields;

@Service
public class ModulesLoaderService {

    @Autowired ModuleFieldsRepository moduleFieldsRepository;

    public ModuleFields getModuleFieldsForComponent(String component) {
        ModuleFields moduleField = moduleFieldsRepository.getModuleFields(component);
        return moduleField;
    }

}
