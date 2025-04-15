public class CarExample {

    public static class Car {
        String name;
        String cost;
        String color;
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.name = "maruti";
        car1.cost = "4 lakh";
        car1.color = "white";

        Car car2 = new Car();
        car2.name = "audi";
        car2.cost = "50 lakh";
        car2.color = "red";

        System.out.println("Car 1: " + car1.name + ", Cost: " + car1.cost + ", Color: " + car1.color);
        System.out.println("Car 2: " + car2.name + ", Cost: " + car2.cost + ", Color: " + car2.color);
    }
    
}
