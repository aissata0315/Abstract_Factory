package com.company.app;


import com.company.buttons.IButton;
import com.company.factories.IGUIFactory;

public class Application {
    private IButton button;

    public Application(IGUIFactory factory) {
        button = factory.createButton();
    }
    public void afficher(){
        button.afficher();

    }
}
