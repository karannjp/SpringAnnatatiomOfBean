package com.karan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext con=new ClassPathXmlApplicationContext
                ("application-comfig.xml");
        Emp e=con.getBean("emp",Emp.class);
        Emp e1=con.getBean("emp",Emp.class);
        e.setEname("karan");
        e.display();
        boolean result=e==e1;
        System.out.println(result);
        System.out.println(e +"    "+e1);
System.out.println(e.getCompany());
System.out.println(e.getEname());



    }
}
