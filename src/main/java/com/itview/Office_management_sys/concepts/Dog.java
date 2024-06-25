package com.itview.Office_management_sys.concepts;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    @Override
    public String makeSound() {
        return ("Bark");
    }
}
