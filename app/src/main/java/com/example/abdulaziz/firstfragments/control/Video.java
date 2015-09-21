package com.example.abdulaziz.firstfragments.control;

/**
 * Created by Abdulaziz on 9/19/2015.
 */
public class Video {

    private String videoName;
    private String videoDescription;
    private int videoPicture;

    public Video(String name, String description, int picture){
        this.videoName = name;
        this.videoDescription = description;
        this.videoPicture = picture;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public void setVideoPicture(int videoPicture) {
        this.videoPicture = videoPicture;
    }

    public String getVideoName() {

        return videoName;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public int getVideoPicture() {
        return videoPicture;
    }
}
