package rs.raf.bank;

public class Bank extends Client {

    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void sendMail() {
        System.out.println("Sending mail: Extra discount for each branch");
    }
}
