package org.imt.nordeurope.j2ee.nickler.check_iban_api.Service;

import org.imt.nordeurope.j2ee.nickler.check_iban_api.Model.IbanValidation;

public interface ICheckIBANService {

    public IbanValidation getIBAN(String IBAN);

}
