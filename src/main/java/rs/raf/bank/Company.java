package rs.raf.bank;

public class Company extends Client{

    private final int numberOfEmployees;

    public Company(String name, String address, String number, int numberOfEmployees) {
        super(name, address, number);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void sendMail() {
        System.out.println("Sending mail: For 10+ employees, some discount...");
    }
}
