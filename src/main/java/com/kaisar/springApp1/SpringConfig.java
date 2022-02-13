package com.kaisar.springApp1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kaisar.springApp1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
