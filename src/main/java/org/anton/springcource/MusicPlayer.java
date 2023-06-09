package org.anton.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MusicPlayer {
    private Music music;
    @Autowired

    public MusicPlayer(@Qualifier("classicalMusic")Music music){

        this.music = music;
    }
    public void playMusic(){
        music.getSong();
    }
    @PostConstruct
    void init(){
        System.out.println("Doing init");
    }
    @PreDestroy
    void destroy(){
        System.out.println("Doing destroy");
    }
}
