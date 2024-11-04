package rs.raf.bank;

public class Restaurant extends Client{

    public final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    @Override
    public void sendMail() {
        System.out.println("Sending mail: New abroad restaurant plans");
    }
}
