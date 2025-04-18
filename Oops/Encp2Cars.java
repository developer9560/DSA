public class Encp2Cars {
    private String name;
    private String speed;
    private int price;

    public Encp2Cars(String name, String speed, int price){
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpeed(){
        return speed;
    }
    public void setSpeed(String speed){
        this.speed = speed;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    
}
