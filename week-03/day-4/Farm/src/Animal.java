import java.util.ArrayList;
import java.util.List;

public class Animal {

    String name;
    int hunger = 50;
    int thirst = 50;

    public void Animal(){

    }

    public Animal(String name, int hunger, int thirst){
        this.name =name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat(){
        this.hunger++;
    }

    public void drink(){
        this.thirst++;
    }

    public void play(){
        this.hunger--;
        this.thirst--;
    }

    public void Print(){
        System.out.println(this.hunger);
        System.out.println(this.thirst);
    }
}