package com.vialfinaz14.Chapter9_ObjectAndClasses.Latihan;

public class Listing4_TestTV {
    public static void main(String[] args) {
        Listing3_TV tv1 = new Listing3_TV();
        tv1.turnon();
        tv1.setChannel(30);
        tv1.setVolume(3);

        Listing3_TV tv2 = new Listing3_TV();
        tv2.turnon();
        tv2.channelup();
        tv2.channelup();
        tv2.volumeup();

        System.out.println("tv1's channel is " + tv1.channel +
                " and volume level is " + tv1.volumelevel);
        System.out.println("tv2's channel is " + tv2.channel +
                " and volume level is " + tv2.volumelevel);
    }
}
