package org.javaweb;

public class RockMusic implements Music {

    public void init() {
        System.out.println("init()");
    }

    public void destroy() {
        System.out.println("destroy()");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
