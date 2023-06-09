package org.anton.springcource;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic(){};
    @Bean
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }


    @Override
    public void getSong() {
        System.out.println("Hungarian rhapsody");
    }


}
