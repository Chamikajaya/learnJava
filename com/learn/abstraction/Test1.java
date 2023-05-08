package com.learn.abstraction;
interface ICamera{
    void takePhoto();
    void captureVideo();
}

interface IMusicPlayer{
    void play();
    void pause();
    void skip();
}
class Phone{
    public void takeACall(){
        System.out.println("Taking a call. ");
    }
    public void sendSMS(){
        System.out.println("Sending a SMS.");
    }
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    // This means Smartphone is a phone which has the behavior of cameras and music players


    // Unique method to Smartphone
    public void playgames(){
        System.out.println("Playing Limbo Game");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void captureVideo() {
        System.out.println("Capturing a video");
    }

    @Override
    public void play() {
        System.out.println("Playing Music");
    }

    @Override
    public void pause() {
        System.out.println("Paused the music");
    }

    @Override
    public void skip() {
        System.out.println("Skipping to the next track");
    }
}
public class Test1 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();  // Both ref and obj type = SmartPhone
        s1.playgames();
        Phone s2 = new SmartPhone();  // Ref -> Phone & obj type = SmartPhone ==> SmartPhone will only behave like a normal Phone
        s2.sendSMS();
        s2.takeACall();
        ICamera s3 = new SmartPhone();  // Ref -> ICamera & obj type = SmartPhone ==> SmartPhone will only behave like a camera  only
        s3.captureVideo();
        s3.takePhoto();
        IMusicPlayer s4 = new SmartPhone(); // Ref -> IMusicPlayer & obj type = SmartPhone ==> SmartPhone will only behave like a music player only
        s4.play();
        s4.skip();
        s4.pause();





    }



}
