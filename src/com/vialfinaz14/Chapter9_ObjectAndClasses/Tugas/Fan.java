package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;
///***********************
// *         Fan          *
// * ---------------------*
// * +SLOW: int           *
// * ----------           *
// * +MEDIUM: int         *
// * ------------         *
// * +FAST: int           *
// * ----------           *
// * -speed: int          *
// * -on: boolean         *
// * -radius: double      *
// * +color: String       *
// * +Fan()               *
// * +setSpeed(int)       *
// * +turnOn()            *
// * +turnOff()           *
// * +setRadius(double):  *
// * +setColor(String):   *
// * +getSpeed(): String  *
// * +isOn(): boolean     *
// * +getRadius(): double *
// * +getColor(): String  *
// * +toString(): String  *
// ***********************/
public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static  int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;
    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public void setSpeed(int newspeed) {
        speed = newspeed;
    }

    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void setRadius(double newradius) {
        radius = newradius;
    }

    public void setColor(String newcolor) {
        color = newcolor;
    }
    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW -> s = "SLOW";
            case MEDIUM -> s = "MEDIUM";
            case FAST -> s = "FAST";
        }
        return s;
    }
    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color +
                    ", radius: " + radius + "\n";
        }
        else {
            return "\nFan color: " + color + ", radius " + radius +
                    "\nfan is off\n";
        }
    }
}
