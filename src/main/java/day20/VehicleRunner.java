package day20;

public class VehicleRunner {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda", "Civic", 2021, 13.000);
        Vehicle v2 = new Vehicle("Audi", "RS", 2022, 50.000);
        Vehicle v3 = new Vehicle("Mercedes", "C300", 2020);
        Vehicle v4 = new Vehicle("BMW", "M5", 150.000);
        Vehicle v5 = new Vehicle();

        System.out.println(v1.model);//Civic
    }
}
