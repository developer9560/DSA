public class automobilMain {
    private static Car car;
    private static Bikes bike;

    public static void main(String[] args) {
        Car car = new Car();
        Bikes bike = new Bikes();

        bike.started();
        bike.stopped();
        car.started();
        car.stopped();
    }
}
