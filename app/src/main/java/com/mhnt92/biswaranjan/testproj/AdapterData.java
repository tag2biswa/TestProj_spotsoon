package com.mhnt92.biswaranjan.testproj;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by MAUTO0C243 on 17-07-2017.
 */

public class AdapterData {


    private String title;
    private String time;
    private String description;

   private int thumbnail;


    public AdapterData() {
    }



    public AdapterData(String title, String time, String description,int thumbnail ) {
        this.title = title;
        this.time = time;
        this.description = description;
        this.thumbnail=thumbnail;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
