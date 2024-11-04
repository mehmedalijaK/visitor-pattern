package rs.raf.visitor;

public class Company extends Client {

    private final int numberOfEmployees;

    public Company(String name, String address, String number, int numberOfEmployees) {
        super(name, address, number);
        this.numberOfEmployees = numberOfEmployees;
    }

    // Concrete elements must implement accept which redirects the call to the proper visitor's method
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
