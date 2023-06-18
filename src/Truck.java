public class Truck extends Car {

    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        super.doService();
        checkEngine();
    }

    void checkEngine() {
        System.out.println("Проверяем прицеп");
    }
}
