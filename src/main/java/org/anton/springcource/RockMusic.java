package org.anton.springcource;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Time");
    }
}
