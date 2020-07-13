package com.karan;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private  String comapny;


     public Company(){
        System.out.println("Company Object is created ");
    }

    public void companyName(){
        System.out.println("ISG");

    }


}
