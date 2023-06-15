import java.util.ArrayList;
import java.util.List;

public class BMW {
    String brandName;
    String modelName;
    int modelYear;
    int enginePower;
    List<String> packetChoice;

    public BMW(String brandName, String modelName, int modelYear, int enginePower, List<String> packetChoice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.enginePower = enginePower;
        this.packetChoice = new ArrayList<>(packetChoice);
    }
    public void print() {
        System.out.println("Brand Name: "+brandName);
        System.out.println("Model Name: "+modelName);
        System.out.println("Model Year: "+modelYear);
        System.out.println("Engine Power: "+enginePower);
        System.out.println("Packet Choice: "+packetChoice);

    }


    public String getCar() {
        return "BMW{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelYear=" + modelYear +
                ", enginePower=" + enginePower +
                ", packetChoice='" + packetChoice + '\'' +
                '}';
    }
}
