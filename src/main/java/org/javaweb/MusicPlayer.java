package org.javaweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;
    private SoulMusic soulMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic, SoulMusic soulMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
        this.soulMusic = soulMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//        System.out.println("Playing: " + rapMusic.getSong());
//        System.out.println("Playing: " + soulMusic.getSong());

    }
}