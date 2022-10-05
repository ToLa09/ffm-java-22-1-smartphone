import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact david = new Friend("david", 1234023);
        Contact mykola = new Friend("mykola", 9123412);
        Contact daniel = new Friend("daniel", 912931);
        Contact recruiter = new BusinessContact("paul", "ABCRecruiting");

        List<Contact> tobiasContacts = new ArrayList<>();
        tobiasContacts.add(david);
        tobiasContacts.add(mykola);
        tobiasContacts.add(daniel);
        tobiasContacts.add(recruiter);

        Smartphone tobiasPhone = new Smartphone("Iphone SE", "Apple", tobiasContacts);

        System.out.println(tobiasPhone.startRadio());
        System.out.println(tobiasPhone.getAllContacts());
        System.out.println(tobiasPhone);
        System.out.println(tobiasPhone.getContact(1));
        System.out.println(tobiasPhone.getContactByName("mykola"));
        tobiasPhone.removeContactByName("daniel");
        System.out.println(tobiasPhone.getAllContacts());
    }
}
