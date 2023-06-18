public class Car extends Bicycle {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        super.doService();
        checkEngine();
    }

    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}