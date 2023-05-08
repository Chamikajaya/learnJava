package com.learn.inheritance;

public class SmartPhone extends Phone {
    private  int cameraPixels;
    public SmartPhone(String model ,String brand,int modelNumber, int cameraPixels) {
            super(model, brand, modelNumber);
            this.cameraPixels = cameraPixels;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }
    @Override
    public void makeACall(){
        System.out.println("Making a call from a smartphone");
    }
    @Override
    public void recieveCall(){
        System.out.println("Answering a call from a smartphone");
    }

    public void takePhoto(){
        System.out.println("Taking a photo from " + this.cameraPixels + " px camera");
    }



}
