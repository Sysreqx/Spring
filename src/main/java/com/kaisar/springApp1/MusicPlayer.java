package com.kaisar.springApp1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList.addAll(0, musicList);
//    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

//    public void setMusic(List<Music> musicList) {
//        this.musicList.addAll(0, musicList);
//    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void PlayMusic() {
        System.out.println("Playing " + music.getSong());
        // Для List
//        System.out.println("Playing: ");
//        for (int i = 0; i < musicList.size(); i++) {
//            System.out.println(i + ". " + musicList.get(i).getSong());
//        }
    }

}
