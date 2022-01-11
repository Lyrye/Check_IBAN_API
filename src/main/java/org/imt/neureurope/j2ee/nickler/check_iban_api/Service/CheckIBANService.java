package org.imt.neureurope.j2ee.nickler.check_iban_api.Service;


import org.iban4j.Iban;
import org.imt.neureurope.j2ee.nickler.check_iban_api.Model.IbanValidation;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CheckIBANService implements ICheckIBANService{

    static final String URL_FRONTEND = "http://localhost:8080/";

    @Override
    public IbanValidation getIBAN() {
        RestTemplate restTemplate = new RestTemplate();
        String ibanToCheck =restTemplate.getForObject(URL_FRONTEND, String.class);
        IbanValidation ibanValidation = new IbanValidation();
        ibanValidation.setIBAN(ibanToCheck);
        return ibanValidation ;
    }
}
