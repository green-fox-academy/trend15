import java.text.*;

public class CodingHours {
    public static void main(String[] args) {
        int avgtime = 6;
        int semester = 17;
        int weekly = 52;
        int avg;
        DecimalFormat df = new DecimalFormat("0.00");

         avg = ((avgtime *5)* semester);
        System.out.println("The avarage time for an attendee in a semester: " + avg );

        int avg2 = ((weekly * semester));
        System.out.println("The avarage time for a programmer in a semester: " + avg2 );
        double f = ((100.0/avg2)*avg);
        System.out.println("The coding hours in the semester if the average work hours weekly is 52: "+ df.format(f) + " %");
    }
}
