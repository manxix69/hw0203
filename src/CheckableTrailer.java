public interface CheckableTrailer {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
