package model;

import service.AdvencedMediaPlayerService;
import service.MediaPlayerService;

public class MediaAdapter implements MediaPlayerService {

    AdvencedMediaPlayerService advencedMediaPlayerService;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp3")) {
            advencedMediaPlayerService = new Mp3Player();

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advencedMediaPlayerService = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String name) {
        if (type.equalsIgnoreCase("mp3")) {
            advencedMediaPlayerService.playMp3(type);
        } else if (type.equalsIgnoreCase("mp4")) {
            advencedMediaPlayerService.playMp4(type);
        }
    }

}
