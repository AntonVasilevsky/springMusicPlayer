package org.anton.springcource;

import org.anton.springcource.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer mp = context.getBean(MusicPlayer.class);
        mp.playMusic();

    }
}
