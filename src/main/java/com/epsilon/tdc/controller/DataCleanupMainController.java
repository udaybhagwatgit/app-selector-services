package com.epsilon.tdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.tdc.service.ModulesLoaderService;
import com.espilon.tdc.model.ModuleFields;

/**
 * This the main controller, and responsible for loading the DC components on the screen.
 * This returns the list of components to be painted on the DC drop down.
 *
 */

@RestController
public class DataCleanupMainController {

  @Autowired ModulesLoaderService modulesLoaderService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/components")
    public ResponseEntity<ModuleFields> deleteHarmonyAutomationTestData() {
        ModuleFields responseObject = modulesLoaderService.getModuleFieldsForComponent("main");
        ResponseEntity<ModuleFields> responseEntity = new ResponseEntity<ModuleFields>(responseObject, HttpStatus.OK);
        return responseEntity;
    }
    
    
}
