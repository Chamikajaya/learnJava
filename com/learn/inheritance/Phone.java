package com.learn.inheritance;

public class Phone {
    private String model;
    private String brand;
    private int modelNumber;

    public Phone(String model, String brand, int modelNumber) {
        this.model = model;
        this.brand = brand;
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getModel() {
        return model;
    }

    public void makeACall(){
        System.out.println("Making a call from a normal phone");
    }

    public  void recieveCall(){
        System.out.println("Answering  a call receiving to  normal phone");

    }


}
