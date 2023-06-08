package org.anton.springcource;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {


    @Override
    public void getSong() {
        System.out.println("Hungarian rhapsody");
    }


}
