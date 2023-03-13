package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Time {
    private long hour;
    private long minute;
    private long second;
    Time() {
        this(0);
    }
    Time(long elapseTime) {
        setTime(elapseTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    public void setTime(long elapseTime) {
        long totalMillisecond = System.currentTimeMillis();
        long totalSecond = totalMillisecond / 1000;
        second = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        minute = totalMinute % 60;
        long totalHours = totalMinute / 60;
        hour = totalHours % 24;

        if (elapseTime > 0) {
            totalSecond = elapseTime / 1000;
            second = totalSecond % 60;
            totalMinute = totalSecond / 60;
            minute = totalMinute % 60;
            totalHours = totalMinute / 60;
            hour =totalHours % 24;
        }
    }
}
//UML diagram
///************************************************
// *                      Time                     *
// *-----------------------------------------------*
// * -hour: long                                   *
// * -minute: long                                 *
// * -second: long                                 *
// * Time()                                        *
// * Time(elapseTime: long)                        *
// * Time(hour: long, minute: long, second: long)  *
// * getHour(): long                               *
// * getMinute(): long                             *
// * getSecond(): long                             *
// * setTime(elapseTime: long)                     *
// ************************************************/