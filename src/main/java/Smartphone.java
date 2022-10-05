import java.util.List;

public class Smartphone implements Radio, GPS{
    private String model;
    private String manufacturer;
    private List<String> allContacts;

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer, List<String> allContacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.allContacts = allContacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String startRadio() {
        return "Radio started";
    }

    @Override
    public String stopRadio() {
        return "Radio stopped";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<String> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(List<String> allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", allContacts=" + allContacts +
                '}';
    }
}
