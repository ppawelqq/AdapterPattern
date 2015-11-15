package model;

import service.AdvencedMediaPlayerService;

public class Mp4Player implements AdvencedMediaPlayerService{

    @Override
    public void playMp4(String type) {
            System.out.println("Play MP4");
    }

    @Override
    public void playMp3(String type) {
        
    }
    
}
