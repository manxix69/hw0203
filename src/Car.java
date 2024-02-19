public class Car extends Vehicle  {

    public Car(String modelName, int wheelsCount) {
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
    }
}