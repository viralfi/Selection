package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

public class StopWatch {
    private long startTime;
    private long endTime;
    StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
