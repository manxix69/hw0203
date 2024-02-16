public interface CheckableEngine {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
