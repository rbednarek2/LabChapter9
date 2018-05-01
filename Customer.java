package labchapter9;
public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;
    
    public Customer(int customerNumber, boolean mailingList, String name, String address, String number) {
        super(name, address, number);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
}
