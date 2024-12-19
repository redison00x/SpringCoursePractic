package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(chooseGenre genre) {

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == chooseGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        }
        else {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}
