package com.company;

import com.company.app.Application;
import com.company.factories.IGUIFactory;
import com.company.factories.UbuntuFactory;
import com.company.factories.WindowsFactory;

public class Main {

    public static Application test(){
        Application application;
        IGUIFactory factory;

        String nomSysteme = System.getProperty("os.name").toLowerCase();
       // System.out.println("SYSTEME " + nomSysteme);
        if (nomSysteme.contains("windows"))
        {
            factory = new WindowsFactory();
            application = new Application(factory);
        }
        else
        {
            factory = new UbuntuFactory();
            application = new Application(factory);
        }
        return application;
    }

    public static void main(String[] args) {

        Application application = test();
        application.afficher();

    }
}
