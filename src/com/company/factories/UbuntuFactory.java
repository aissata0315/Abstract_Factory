package com.company.factories;

import com.company.buttons.IButton;
import com.company.buttons.UbuntuButton;

public class UbuntuFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new UbuntuButton();
    }
}
