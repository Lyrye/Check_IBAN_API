package org.imt.nordeurope.j2ee.nickler.check_iban_api.Model;

import org.iban4j.IbanUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class IbanValidation {

    private String IBAN;
    private Boolean isValid;

    public String getIBAN() {
        return  IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
        isValid();
    }

    private void isValid() {
        try{
            IbanUtil.validate(this.IBAN);
            isValid = true;

        } catch (Throwable t){

            isValid = false;

        }
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }
}
