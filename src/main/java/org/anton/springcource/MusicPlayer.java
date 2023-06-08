package org.anton.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
}
