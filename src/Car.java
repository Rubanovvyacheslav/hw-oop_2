public class Car extends Transport {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
        System.out.println();
    }

    @Override
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}