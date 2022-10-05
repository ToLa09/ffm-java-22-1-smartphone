public class Friend extends Contact{
    private int phoneNumber;

    public Friend(String name) {
        super(name);
    }

    public Friend(String name, int phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                "} " + super.toString();
    }
}
