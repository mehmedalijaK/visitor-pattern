package rs.raf.visitor;

// Visitor interface declares a set of visiting methods
public interface Visitor {
    // Methods take concrete elements of an object structure as arguments
    void visitBank(Bank bank);
    void visitCompany(Company company);
    void visitResident(Resident resident);
    void visitRestaurant(Restaurant restaurant);
}
