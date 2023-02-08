package org.example;
import org.example.gamers.DesktopGamer;
import org.example.gamers.PlayStationGamer;
import java.util.UUID;
public class Main {
    public static void main(String[] args) {
    DesktopGamer pcGamer = new DesktopGamer("PC", 1300, "rtx3060");
    String pcGamerPlatform = pcGamer.getPlatform();
    int pcGamerHours = pcGamer.getHoursOfPlayed();
    String graphicCard = pcGamer.getModelGraphicCard();
    System.out.println("Платформа: " + pcGamerPlatform + "\nНаигранных часов: " + pcGamerHours+ "\nМодель видеокарты: "+graphicCard );

    PlayStationGamer psGamer = new PlayStationGamer("PlayStaion", 1000, false);
    String psGamerPlatform = psGamer.getPlatform();
    // TODO

    }
}