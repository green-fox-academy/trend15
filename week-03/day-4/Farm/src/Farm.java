import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Farm {
    List<Animal> animals;
    int slot; // how many free places

    public Farm(){
        this.animals = new ArrayList<>();
    }
    void setSlot(int slot){
        this.slot=slot;
    }

    public int PrintSlot(){
        return this.slot;
    }

    void breed(String name, int y, int x){
        if( animals.size()< slot){
            Animal animal = new Animal(name,y,x);
            animals.add(animal);

        }
        else System.out.println("Not enough space for "+name);

    }
    //removes the least hungry animal

    void slaughter(){
        int minindex =0;
        int minHunger =100;

        for (int i =0; i<animals.size();i++){
            if (animals.get(i).hunger < minHunger){
                minHunger = animals.get(i).hunger;
                minindex =i;
            }
        }
        animals.remove(minindex);
    }
}