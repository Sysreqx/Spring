package com.kaisar.springApp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.PlayMusic();

        Music jazzMusic = context.getBean("jazzMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(jazzMusic);
        musicPlayer.PlayMusic();

        Music rnb = context.getBean("rhythmAndBluesMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(rnb);
        musicPlayer1.PlayMusic();

        context.close();
    }
}
