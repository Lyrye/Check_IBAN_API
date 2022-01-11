package org.imt.neureurope.j2ee.nickler.check_iban_api.Service;


import org.iban4j.Iban;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CheckIBANService implements ICheckIBANService{

    static final String URL_FRONTEND = "http://localhost:8080/";

    @Override
    public String getIBAN() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL_FRONTEND, String.class);
    }
}
