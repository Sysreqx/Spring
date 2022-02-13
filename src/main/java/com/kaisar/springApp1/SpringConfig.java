package com.kaisar.springApp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(jazzMusic(), countryMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
