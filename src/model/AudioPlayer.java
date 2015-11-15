package model;

import service.MediaPlayerService;

public class AudioPlayer implements MediaPlayerService{
    
    MediaAdapter mediaAdapter;
    
    public void play(String type, String name) {
        if(type.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3. Nazwa: " + name);			
      } 
       
      else if(type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(type);
         mediaAdapter.play(type, name);
      }
      
      else{
         System.out.println("Niepoprawny typ. " + type);
      }
    }
}
