package com.vialfinaz14.Chapter9_ObjectAndClasses.Latihan;

public class Listing3_TV {
    int channel = 1;
    int volumelevel = 1;
    boolean on = false;
    public void TV() {
    }
    public void turnon() {
        on = true;
    }
    public void turnoff() {
        on = false;
    }
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    public void setVolume(int newvolumelevel) {
        if (on && newvolumelevel >= 1 && newvolumelevel <= 7)
            volumelevel = newvolumelevel;
    }
    public void channelup() {
        if (on && channel < 120)
            channel++;
    }
    public void channeldown() {
        if (on && channel < 1)
            channel--;
    }
    public void volumeup() {
        if (on && volumelevel < 7)
            volumelevel++;
    }
    public void volumedown() {
        if (on && volumelevel > 1)
            volumelevel--;
    }
}
