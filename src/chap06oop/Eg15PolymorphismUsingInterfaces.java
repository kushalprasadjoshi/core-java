package chap06oop;

class CellPhone {
    void call() {
        System.out.println("Calling... Call");
    }

    void message() {
        System.out.println("Messaging... Message");
    }
}

interface GPS {
    void navigation();
    void mapping();
}

interface Camera {
    void photo ();
    void video();
}

interface MediaPlayer {
    void playMusic();
    void playVideo();
}

class SmartPhones extends Phone implements GPS, Camera, MediaPlayer {
    @Override
    public void navigation() {
        System.out.println("Navigating... Location");
    }

    @Override
    public void mapping() {
        System.out.println("Mapping... Points");
    }

    @Override
    public void photo() {
        System.out.println("Clicking... Photo");
    }

    @Override
    public void video() {
        System.out.println("Recording... Video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing... Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing... Video");
    }
}

public class Eg15PolymorphismUsingInterfaces {
    public static void main(String[] args) {
        GPS gps = new SmartPhones();    // Can only use GPS methods
        gps.navigation();
        gps.mapping();
//        gps.playMusic(); // Not possible --> throws an error

        // Similarly
        Camera camera = new SmartPhones();	// Can only use Camera methods.
        MediaPlayer mp = new SmartPhones();	// Can only use MediaPlayer methods.
        SmartPhones s = new SmartPhones();	// Can use all Smartphone methods.

    }
}
