package org.imt.nordeurope.j2ee.nickler.check_iban_api.Service;


import org.imt.nordeurope.j2ee.nickler.check_iban_api.Model.IbanValidation;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CheckIBANService implements ICheckIBANService{

    @Override
    public IbanValidation getIBAN(String IBAN) {
        IbanValidation ibanValidation = new IbanValidation();
        ibanValidation.setIBAN(IBAN);
        return ibanValidation ;
    }
}
