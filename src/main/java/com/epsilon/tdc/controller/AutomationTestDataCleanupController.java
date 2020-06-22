package com.epsilon.tdc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.tdc.service.DataCleanupService;

/**
 * This controller is called when we submit the form to perform cleanup. This calls the AutomationTestDataCleanup application
 *
 */

@RestController
public class AutomationTestDataCleanupController {

    @Autowired DataCleanupService dateCleanupService;

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/components/{component}")
    public ResponseEntity<Map<String, Object>> deleteHarmonyAutomationTestData(@RequestBody Object cleanupModel,
            @PathVariable final String component) {
        Map<String, Object> responseObject = dateCleanupService.cleanUpData(cleanupModel, component);
        ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String, Object>>(responseObject,
                HttpStatus.OK);
        return responseEntity;
    }

}
