package com.epsilon.tdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.tdc.service.ModulesLoaderService;
import com.espilon.tdc.model.ModuleFields;

/**
 * This controller is called when a Component is selected from the DC tool. 
 * This component returns the various fields to be painted in the UI.
 *
 */

@RestController
public class CleanupComponentController {

   @Autowired ModulesLoaderService modulesLoaderService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/components/{component}")
    public ResponseEntity<ModuleFields> deleteHarmonyAutomationTestData(@PathVariable final String component) {
        ModuleFields responseObject = modulesLoaderService.getModuleFieldsForComponent(component);
        ResponseEntity<ModuleFields> responseEntity = new ResponseEntity<ModuleFields>(responseObject, HttpStatus.OK);
        return responseEntity;
    }
}
