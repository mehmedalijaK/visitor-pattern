package rs.raf.bank;

public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Problem 1: The Single Responsibility Principle, single object in OOP should be made for one specific function
    // Problem 2: Open-closed principle, we should be able to add new functionalities but without modification of existing code,
    // example is situation where we change one class but that requires to adapt all depending classes.
    public abstract void sendMail();
}
