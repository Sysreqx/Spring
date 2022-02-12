package com.kaisar.springApp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.PlayMusic();

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        System.out.println();

        JazzMusic jazzMusic = context.getBean("jazzMusicBean", JazzMusic.class);
        System.out.println(jazzMusic.getSong());

        System.out.println();

        context.close();
    }
}
