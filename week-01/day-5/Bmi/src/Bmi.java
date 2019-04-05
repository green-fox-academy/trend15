public class Bmi {
    public static void main(String[] args) {
        double massInKg = 103.5;
        double heightInM = 1.82;
        double mm = Math.pow(heightInM,2);
        double BMI;
        BMI= massInKg/mm;
        System.out.println(BMI);

        if (BMI <= 18.5){
            System.out.println("Underweigth");
        }

        if ((BMI> 18.5) && (BMI <= 24.9)) {
            System.out.println("Normal weight");
        }

        if ((BMI> 25) && (BMI <= 29)) {
            System.out.println("Overweight");
        }

        if (BMI >29) {
            System.out.println("Obesity");
        }
    }
}
