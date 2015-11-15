package model;

import service.AdvencedMediaPlayerService;

public class Mp3Player implements AdvencedMediaPlayerService{

    @Override
    public void playMp4(String type) {
        
    }

    @Override
    public void playMp3(String type) {
        System.out.println("Play Mp3");
    }

}
