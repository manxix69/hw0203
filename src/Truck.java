public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void check() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}