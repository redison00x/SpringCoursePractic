package org.example.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springcourse")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
}
