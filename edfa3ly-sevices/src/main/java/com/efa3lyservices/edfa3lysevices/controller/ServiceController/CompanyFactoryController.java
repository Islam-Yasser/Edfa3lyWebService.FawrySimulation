package com.efa3lyservices.edfa3lysevices.controller.ServiceController;

import com.efa3lyservices.edfa3lysevices.Entity.Companies;
import com.efa3lyservices.edfa3lysevices.controllerBsl.CompaniesBsl.etisalat;
import com.efa3lyservices.edfa3lysevices.controllerBsl.CompaniesBsl.orange;
import com.efa3lyservices.edfa3lysevices.controllerBsl.CompaniesBsl.vodafone;
import com.efa3lyservices.edfa3lysevices.controllerBsl.CompaniesBsl.we;
public class CompanyFactoryController {

    public Companies create(String companyName){
        if (companyName.equalsIgnoreCase("Vodafone")) {
            return new vodafone();
        } else if (companyName.equalsIgnoreCase("Etisalat")) {
            return new etisalat();
        } else if (companyName.equalsIgnoreCase("We")) {
            return new we();
        } else if (companyName.equalsIgnoreCase("Orange")) {
            return new orange();
        }
        return null;
    }
}
