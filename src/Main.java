public class Main {
    public static void main(String[] args) {
        Car polo = new Car("Volkswagen Polo", 4);
        Car passat = new Car("Volkswagen Passat", 4);

        Truck kamaz = new Truck("KamaZ 4308", 6);
        Truck mercedes = new Truck("Mercedes Actros", 8);

        Bicycle gt = new Bicycle("GT Avalanche", 2);
        Bicycle cannondale = new Bicycle("Cannondale Trails", 2);


        passat.check();
        mercedes.check();
        cannondale.check();
    }
}