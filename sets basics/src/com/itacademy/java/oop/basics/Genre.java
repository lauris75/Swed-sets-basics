package com.itacademy.java.oop.basics;

public enum Genre {
    Sandbox("SB"),
    ActionAdventure("AA"),
    RealtimeStrategy("RTS"),
    FirstPersonShooters("FPS"),
    Multiplayer("MP"),
    Platformer("PF"),
    Singleplayer("SP");

    public final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public static Genre valueOfCode(String genre) {
        for (Genre e : values()) {
            if (e.genre.equals(genre)) {
                return e;
            }
        }
        return null;
    }
}
