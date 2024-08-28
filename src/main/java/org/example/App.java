package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("appConfig.xml");
//        Greet greet= (Greet)context.getBean("greet");
//        greet.getMessage();

      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appConfig.xml");
      Vehicle vehicle=context.getBean("myVehicle",Vehicle.class);
        System.out.println(vehicle.getDiscountMessage());
        System.out.println(vehicle.getMileage());
        System.out.println(vehicle.getBrandName());
        System.out.println(vehicle.getPrice());}
}



