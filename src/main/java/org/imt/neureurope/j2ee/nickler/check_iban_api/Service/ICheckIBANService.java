package org.imt.neureurope.j2ee.nickler.check_iban_api.Service;

import org.iban4j.Iban;
import org.imt.neureurope.j2ee.nickler.check_iban_api.Model.IbanValidation;

public interface ICheckIBANService {

    public IbanValidation getIBAN();

}
