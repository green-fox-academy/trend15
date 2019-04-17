public class Sharpie {
    String color;
    float width;
    float inkAmount=100;


    public void use(){
        this.inkAmount--;
    }

    public Sharpie (String color, float width){
        this.color=color;
        this.width=width;
    }
    public Sharpie (){
    }

    public void Print(){
        System.out.println(inkAmount);
    }
}
