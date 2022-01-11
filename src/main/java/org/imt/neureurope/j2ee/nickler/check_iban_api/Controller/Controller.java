package org.imt.neureurope.j2ee.nickler.check_iban_api.Controller;


import com.fasterxml.jackson.annotation.JacksonInject;
import org.iban4j.Iban;
import org.iban4j.IbanUtil;
import org.imt.neureurope.j2ee.nickler.check_iban_api.Model.IbanValidation;
import org.imt.neureurope.j2ee.nickler.check_iban_api.Service.CheckIBANService;
import org.imt.neureurope.j2ee.nickler.check_iban_api.Service.ICheckIBANService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.*; 

import javax.inject.Inject;

@RestController
public class Controller {

    @Inject
    ICheckIBANService checkIBANService;

    @GetMapping(value = {"/checkIBAN"},produces = "application/json")
    public ResponseEntity checkIBAN(Model model) {
        return new ResponseEntity(checkIBANService.getIBAN(), HttpStatus.OK);
    }

}
