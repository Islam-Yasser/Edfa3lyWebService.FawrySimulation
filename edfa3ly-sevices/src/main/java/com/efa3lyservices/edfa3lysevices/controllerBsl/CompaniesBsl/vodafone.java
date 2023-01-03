package com.efa3lyservices.edfa3lysevices.controllerBsl.CompaniesBsl;

import com.efa3lyservices.edfa3lysevices.Entity.Companies;

import java.util.Scanner;
public class vodafone implements Companies {
    public double off=0.0;
    double money=0;
    double CompanyProfits=0;

    public vodafone(){
        getcompanyName();
    }
    @Override
    public void PrintService(double money) {
        System.out.println("Welcome To Vodafone");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter phone number:");
        String number=in.next();
        System.out.println("Also controllerBsl.we have offer which is "+this.off*100+"% \n");
        System.out.println("Enter ur amount of money: ");

        setMoney(money);
    }


    public void setMoney(double money) {
        this.money = money;
    }



    @Override
    public double calcBills(double money)
    {
        double val= this.money-(this.money*off);
        this.CompanyProfits+=val;
        return val;
    }
    
    @Override
    public String printTransaction() {
    	return "U have been Recharged by "+this.money+ "U got Offer"+this.off*100+"% \n"
                + "Ur new balance is : "+this.money+"Transaction Done Successefully Thank u !";

    }

    @Override
    public void addDiscount(double discount) {
        this.off=discount;
    }
    public double getOffer() {
    	return this.off;
    }
	@Override
	public String getcompanyName() {
		// TODO Auto- method stub
		return "Vodafone";
	}
}
