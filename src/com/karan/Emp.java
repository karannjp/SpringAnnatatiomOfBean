package com.karan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Emp {
    private  String ename;
    private Company company;

    public Emp(){

        System.out.println("Emp Object is created ");
    }
    @Autowired
    public void setCompany(Company company) {
        System.out.println("Setter Method Call Company");
        this.company = company;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Company getCompany() {
        return company;
    }

    public String getEname() {
        return ename;
    }
    public void display(){
        company.companyName();
    }
@PostConstruct
    public  void  dostuff(){
        System.out.println("init Method Call");

    }
    @PreDestroy
    public  void  dodestroy(){
        System.out.println("Destroy the method");

    }

}
