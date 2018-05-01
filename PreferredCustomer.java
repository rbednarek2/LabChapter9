package labchapter9;
public class PreferredCustomer extends Customer{
    private double amountSpent = 0;

    public PreferredCustomer(int customerNumber, boolean mailingList, String name, String address, String number) {
        super(customerNumber, mailingList, name, address, number);
    }
    
    public PreferredCustomer(int customerNumber, boolean mailingList, String name, String address, String number, double amountSpent) {
        super(customerNumber, mailingList, name, address, number);
        this.amountSpent = amountSpent;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }
    
    public void addAmmount (double amount){
        amountSpent = amountSpent + amount;
    }
    
    public double getDiscount (){
        if (amountSpent >= 2000){
            return .1;
        }else if (amountSpent >= 1500){
            return .07;
        }else if (amountSpent >= 1000){
            return .06;
        }else if (amountSpent >=500){
            return .05;
        }else {
            return 0;
        }
    }
}
