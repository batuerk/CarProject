public class BMW {
    String brandName;
    String modelName;
    int modelYear;
    int enginePower;
    String packetChoice;

    public BMW(String brandName, String modelName, int modelYear, int enginePower, String packetChoice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.enginePower = enginePower;
        this.packetChoice = packetChoice;
    }
    public void print() {
        System.out.println("Brand Name: "+brandName);
        System.out.println("Model Name: "+modelName);
        System.out.println("Model Year: "+modelYear);
        System.out.println("Engine Power: "+enginePower);
        System.out.println("Packet Choice: "+packetChoice);

    }
}
