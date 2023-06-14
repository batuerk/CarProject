public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("bmw", "320", 2020, 200, "jump");
        bmw.print();

        Audi audi = new Audi("audi", "Q7", 2020, 220, "jump");
        audi.print();

        Mercedes mercedes = new Mercedes();
        mercedes.brandName = "mercedes";
        System.out.println("Brand Name: "+mercedes.brandName);
        mercedes.modelName = "G";
        System.out.println("modelName: "+mercedes.modelName);
        mercedes.modelYear = 2020;
        System.out.println("modelYear: "+mercedes.modelYear);
        mercedes.enginePower = 190;
        System.out.println("enginePower: "+mercedes.enginePower);
        mercedes.packetChoice = "jump";
        System.out.println("packetChoice: "+mercedes.packetChoice);
    }
}