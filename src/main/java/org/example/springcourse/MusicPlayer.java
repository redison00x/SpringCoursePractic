package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

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
        String chosen;

        if (genre == chooseGenre.CLASSICAL) {
            chosen = classicalMusic.getSongs().get(randomNumber);
        }
        else {
            chosen = rockMusic.getSongs().get(randomNumber);
        }
        System.out.println(chosen);
    }
}
