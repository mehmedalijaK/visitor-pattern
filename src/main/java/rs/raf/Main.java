package rs.raf;

import rs.raf.visitor.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = List.of(
            new Bank("Bank 1", "Bank Bank", "15", 10),
            new Resident("Resident 1", "Resident Resident", "10", "A"),
            new Company("Company 1", "Company Company", "15", 1000),
            new Restaurant("Restaurant 1", "Address Address", "5", true)
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();

        visitor.sendInsuranceMails(clients);

        System.out.println();

        List<rs.raf.bank.Client> clientWithoutVisitor = List.of(
            new rs.raf.bank.Bank("Bank 1", "Bank Bank", "15", 10),
            new rs.raf.bank.Resident("Resident 1", "Resident Resident", "10", "A"),
            new rs.raf.bank.Company("Company 1", "Company Company", "15", 1000),
            new rs.raf.bank.Restaurant("Restaurant 1", "Address Address", "5", true)
        );

        clientWithoutVisitor.forEach(rs.raf.bank.Client::sendMail);
    }
}