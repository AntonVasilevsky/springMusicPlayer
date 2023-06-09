package org.anton.springcource;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private RockMusic(){};
    @Bean
    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
    @Override
    public void getSong() {
        System.out.println("Time");
    }
}
