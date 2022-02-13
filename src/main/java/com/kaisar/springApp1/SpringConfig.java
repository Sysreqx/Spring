package com.kaisar.springApp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public CountryMusic countryMusic() {
        return new CountryMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RhythmAndBluesMusic rhythmAndBluesMusic() {
        return new RhythmAndBluesMusic();
    }

    @Bean
    public ArrayList<Music> genreList() {
        ArrayList<Music> musicArrayList= new ArrayList<>();
        musicArrayList.add(jazzMusic());
        musicArrayList.add(countryMusic());
        musicArrayList.add(classicalMusic());
        musicArrayList.add(rhythmAndBluesMusic());

        return musicArrayList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genreList());
    }

}
