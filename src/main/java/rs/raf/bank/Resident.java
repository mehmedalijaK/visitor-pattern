package rs.raf.bank;

public class Resident extends Client{

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void sendMail() {
        System.out.println("Sending mail: New insurance class");
    }
}
