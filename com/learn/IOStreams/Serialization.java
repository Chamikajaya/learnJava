package com.learn.IOStreams;
import java.io.*;

// Vehicle class does not implement Serializable interface hence objects created using Vehicle will not be serialized
class Vehicle{

}

class FarCry implements Serializable {  // Serializable interface is an interface with no methods. This announces that objects created from this class can be serialized
    private String charactor;
    transient private Vehicle vehicle;  // Since we have used transient keyword this will not be serialized.
    private int age;
    private String type;
    private String weapon;

    public FarCry(String charactor, int age, String type, String weapon) {
        this.charactor = charactor;
        this.age = age;
        this.type = type;
        this.weapon = weapon;
        this.vehicle = new Vehicle();
    }

    public String getCharactor() {
        return charactor;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getWeapon() {
        return weapon;
    }
    @Override
    public String toString() {
        return "Character: " + charactor +
                ", Age: " + age +
                ", Type: " + type +
                ", Weapon: " + weapon;
    }
}



public class Serialization {
    public static void main(String[] args) {
        FarCry c1 = new FarCry("Vass", 35, "Villain", "Ak47");
        FarCry c2 = new FarCry("Jason", 22, "Hero", "RPG");
        FarCry c3 = new FarCry("Citra", 30, "Villain", "Spells");

        try {
            // Firstly we need to create a file to write the objects' state into a file
            FileOutputStream saveData = new FileOutputStream("gamedetails.ser");
            // ObjectOutputStream lets us write objects to file, but it can not directly connect to the file which is the reason why we need a helper
            ObjectOutputStream os = new ObjectOutputStream(saveData);
            // This will serialize the object and will be written as bytes (why -> Because we are using FileOutputStream which uses byte streams)
            os.writeObject(c1);
            os.writeObject(c2);
            os.writeObject(c3);
            // Finally we need to close the stream (top level stream)
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization process -->     //TODO: Note that when we deserialize the object these transient variables will come back either null for object references or as default primitive values.
        try {
            // Make a file input stream
            FileInputStream savedFile = new FileInputStream("gamedetails.ser");
            //Make an ObjectInputStream
            ObjectInputStream os = new ObjectInputStream(savedFile);
            //Read the objects
            Object obj1 = os.readObject();
            Object obj2 = os.readObject();
            Object obj3 = os.readObject();
            // Cast the object to its actual type
            FarCry model1 = (FarCry) obj1;
            FarCry model2 = (FarCry) obj2;
            FarCry model3 = (FarCry) obj3;
            // Close the higher level ObjectOutputStream
            os.close();

            // Now let's check whether the deserialization is done correctly
            System.out.println(model1.toString());
            System.out.println(model2.toString());
            System.out.println(model3.toString());



        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}


