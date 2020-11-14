package org.javaweb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        RockMusic rockMusic = context.getBean("musicBean2", RockMusic.class);
        System.out.println(rockMusic.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.playMusicList();
//        secondMusicPlayer.playMusicList();
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(" firstMusicPlayer.getVolume(): " + firstMusicPlayer.getVolume());
//        System.out.println("secondMusicPlayer.getVolume(): " + secondMusicPlayer.getVolume());
//
//
//        boolean isSameLink = firstMusicPlayer == secondMusicPlayer;
//        System.out.println("isSameLink: " + isSameLink);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);

        context.close();
    }
}
