package com.company.factories;

import com.company.buttons.IButton;
import com.company.buttons.WindowsButton;

public class WindowsFactory implements IGUIFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
