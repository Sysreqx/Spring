package com.kaisar.springApp1;

public class JazzMusic implements Music{
    public void JazzMusicInit() {
        System.out.println("Jazz Music Init");
    }

    public void JazzMusicDestroy() {
        System.out.println("Jazz Music Destroy");
    }

    @Override
    public String getSong() {
        return "Jazz music getSong()";
    }
}
