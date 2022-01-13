package org.imt.nordeurope.j2ee.nickler.check_iban_api.Controller;


import org.imt.nordeurope.j2ee.nickler.check_iban_api.Service.ICheckIBANService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class Controller {

    @Inject
    ICheckIBANService checkIBANService;

    @GetMapping(value = {"/checkIBAN"},produces = "application/json")
    public ResponseEntity checkIBAN(Model model, @RequestParam String IBAN) {
        return new ResponseEntity(checkIBANService.getIBAN(IBAN), HttpStatus.OK);
    }

}
