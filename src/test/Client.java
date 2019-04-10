package test;

import beans.Mobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        //Now no object will be created.
        //Because if a bean is defined in prototype scope, then object will be created for each call of getBean method


        Mobile r1 = (Mobile) context.getBean("redminote7pro");
        //Now the Mobile bean class will be loaded and one object will be created
        Mobile r2 = (Mobile) context.getBean("redminote7pro");
        //Already class loaded, so another object will be created

        Mobile h1 = (Mobile) context.getBean("honor8lite");
        //Another object will be created
        Mobile h2 = (Mobile) context.getBean("honor8lite");
        //Another object will be created

        System.out.println("Printing objects...");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("Printing object data...");
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s","Brand", "Model", "Year", "OS", "RAM", "Internal"));
        r1.getMobileDetails();
        r2.getMobileDetails();
        h1.getMobileDetails();
        h2.getMobileDetails();

    }
}
