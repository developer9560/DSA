public class Encp2CarsMain {

    public static void main(String[] args){
        Encp2Cars car1 = new Encp2Cars("BMW", "100KM/H", 1000000);
        System.out.println("Name:" + car1.getName() + "Speed: "+ car1.getSpeed() +" Price: " +car1.getPrice());
        car1.setName("Mercedes");
        car1.setSpeed("200KM/H");
        car1.setPrice(2000000);
        System.out.println("Name:" + car1.getName() + "Speed: "+ car1.getSpeed() +" Price: " +car1.getPrice());

    }
    
}
