package com.kaisar.springApp1;

public class ClassicalMusic implements Music{
    public void classicalMusicInit() {
        System.out.println("Classical Music Init");
    }

    public void classicalMusicDestroy() {
        System.out.println("Classical music Destroy");
    }

    @Override
    public String getSong() {
        return "Classical music getSong()";
    }
}
