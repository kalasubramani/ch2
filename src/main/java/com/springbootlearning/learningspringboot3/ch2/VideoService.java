package com.springbootlearning.learningspringboot3.ch2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideoService {
    
    private List<Video> videos = List.of(
    new Video("Need hlep with your new Spring Boot 3.0 app ?"),
    new Video("Dont do this to your own code"),
    new Video("Secrets to fixing your own code")
   );

   public List<Video> getVideos()
   {
    return videos;
   }

   public Video create(Video newVideo)
   {
    List<Video> extendVideo = new ArrayList<>(videos);
    extendVideo.add(newVideo);
    this.videos=List.copyOf(extendVideo);
    return newVideo;
   }
}
