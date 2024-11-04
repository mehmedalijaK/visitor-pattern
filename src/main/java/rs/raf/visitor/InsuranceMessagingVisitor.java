package rs.raf.visitor;

import java.util.List;

// Concrete visitors implement several versions of the same behavior
public class InsuranceMessagingVisitor implements Visitor {

//    public void sendInsuranceMails(List<Client> clientList) {
//        for(Client client : clientList) {
//            visit(client);
//        }
//    }

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending mail about theft insurance");
    }

    @Override
    public void visitCompany(Company company) {
        System.out.println("Sending employees discount");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending mail about car insurance");
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending mail about abroad insurance");
    }
}