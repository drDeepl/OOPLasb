package org.example.gamers;
import org.example.gamers.Gamer;
public class PlayStationGamer extends Gamer{
    private boolean isAccesToPlayStationStore;

    public PlayStationGamer(String platform, int hoursOfPlayed, boolean isAccesToPlayStationStore){
        this.platform = platform;
        this.hoursOfPlayed = hoursOfPlayed;
        this.isAccesToPlayStationStore = isAccesToPlayStationStore;
    }

    @Override
    public String getPlatform(){
        return this.platform;
    }

    @Override
    public int getHoursOfPlayed(){
        return this.hoursOfPlayed;
    }

    public boolean isAccesToPlayStationStore(){
        return this.isAccesToPlayStationStore;
    }
}
