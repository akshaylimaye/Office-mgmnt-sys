package com.itview.Office_management_sys.concepts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {

    @Override
    public String makeSound() {
        return ("Meow");
    }
}
