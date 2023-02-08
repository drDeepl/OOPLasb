package org.example.gamers;
import org.example.gamers.Gamer;
public class DesktopGamer extends Gamer{

    private String modelGraphicCard;
    public DesktopGamer(String platform, int hoursOfPlayed, String modelGraphicCard){
        this.platform = platform;
        this.hoursOfPlayed = hoursOfPlayed;
        this.modelGraphicCard = modelGraphicCard;
    }

    @Override
    public String getPlatform(){
        return this.platform;
    }
    @Override
    public int getHoursOfPlayed(){
        return this.hoursOfPlayed;
    }

    public String getModelGraphicCard(){
        return this.modelGraphicCard;
    }

}
