package com.example.sca25.tourguideapp;

/**
 * Created by Caine on 2/28/2018.
 */

public class Word {
    private String mName;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String name, String description, int imageResourceId){
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName(){ return mName; }
    public String getDescription(){return mDescription; }
    public int getImageResourceId(){return mImageResourceId; }

    // Returns whether or not there is an image for this name

    public boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}
}
