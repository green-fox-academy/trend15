import PetrolStation.Car;
import PetrolStation.Station;

public class Main {
    public static void main(String[] args) {
        Station OMV = new Station();
        OMV.printy();
        Car VW = new Car();
        OMV.refill(VW);
        OMV.printy();
    }
}
