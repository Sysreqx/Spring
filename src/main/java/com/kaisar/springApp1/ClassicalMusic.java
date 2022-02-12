package com.kaisar.springApp1;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

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
