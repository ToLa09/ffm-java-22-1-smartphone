import java.util.List;

public class Smartphone implements Radio, GPS{
    private String model;
    private String manufacturer;
    private List<Contact> allContacts;

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer, List<Contact> allContacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.allContacts = allContacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
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

    public List<Contact> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(List<Contact> allContacts) {
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

    public void addContact (Contact contact) {
        allContacts.add(contact);
    }

    public Contact getContact (int index){
        return allContacts.get(index);
    }

    public Contact getContactByName (String name){
        for (Contact c : allContacts) {
            if (c.getName() == name) {
                return c;
            }
        }
        throw new RuntimeException("Kein Kontakt mit diesem Namen gefunden");
    }

    public void removeContactByName(String name) {
        for (Contact c : allContacts) {
            if (c.getName() == name) {
                allContacts.remove(c);
            }
        }
    }
}
