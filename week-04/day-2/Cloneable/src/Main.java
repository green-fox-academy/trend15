public class Main {

    public static void main(String[] args) {

        Student john = new Student("John",20,"male","BME");
        Student johnClone = john.clone();
        System.out.println(johnClone.getName()+johnClone.getAge()+johnClone.getGender()+johnClone.getPreviousOrganization());

    }
}
