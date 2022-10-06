public class Friend extends Contact{
    private String phoneNumber;

    public Friend(String name) {
        super(name);
    }

    public Friend(String name, String phoneNumber) {
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
