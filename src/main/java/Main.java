import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> tobiasContacts = new ArrayList<>();
        tobiasContacts.add("david");
        tobiasContacts.add("mykola");
        tobiasContacts.add("daniel");

        Smartphone tobiasPhone = new Smartphone("Iphone SE", "Apple", tobiasContacts);

        System.out.println(tobiasPhone.startRadio());
        System.out.println(tobiasPhone.getAllContacts());
        System.out.println(tobiasPhone);
    }
}
