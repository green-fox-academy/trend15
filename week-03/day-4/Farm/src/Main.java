import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog",50,50);
        Animal cat = new Animal("cat",40,30);
        Animal horse = new Animal("horse",70,70);
        Animal cow = new Animal("cow",80,60);
        Animal duck = new Animal("duck",70,20);


        Farm Ranch = new Farm();

        Ranch.animals.add(0,dog);
        Ranch.animals.add(1,cat);
        Ranch.animals.add(2,horse);
        Ranch.animals.add(3,cow);
        Ranch.animals.add(4,duck);

        //Ranch.setSlot(Ranch.animals.size()); - allatokra van szabva a Farm merete
        Ranch.setSlot(6);
        int leftnumbers =Ranch.PrintSlot()-Ranch.animals.size();
        System.out.println("The number of empty spaces:"+leftnumbers);
        System.out.println(Ranch.PrintSlot());
        Ranch.breed("snake",20,20);
        Ranch.breed("mouse",10,20);
        System.out.println("The number of 1 empty spaces:"+((Ranch.PrintSlot())-Ranch.animals.size()));
        System.out.println(Ranch.animals.size());
        Ranch.slaughter();
        System.out.println("The number of empty 2 spaces:"+((Ranch.PrintSlot())-Ranch.animals.size()));
        System.out.println(Ranch.animals.size());



    }
}

