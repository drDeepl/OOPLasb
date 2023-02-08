package org.example.gamers;

public abstract class Gamer {
    protected String platform;
    protected int hoursOfPlayed;

    protected abstract String getPlatform();
    protected abstract int getHoursOfPlayed();

}


