package com.efa3lyservices.edfa3lysevices.controllerBsl.PaymentBsl;

import com.efa3lyservices.edfa3lysevices.models.User;
import org.springframework.stereotype.Service;
import com.efa3lyservices.edfa3lysevices.Entity.Payment;

@Service
public class CreditCard implements Payment{

    @Override
    public String pay(User u, double money,String destination) {
        return "1 done with money "+money+" to "+destination;
    }
}
