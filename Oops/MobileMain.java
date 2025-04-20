public class MobileMain {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.android_version = "12.0";
        System.out.println("Android Version: " + s.android_version);
        s.setCost(30000);
        s.setRam("8GB");
        s.setColor("Black");
        System.out.println("Cost: " + s.getCost());
        System.out.println("RAM: " + s.getRam());
        System.out.println("Color: " + s.getColor());
    }
}
