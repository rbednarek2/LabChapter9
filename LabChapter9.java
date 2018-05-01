package labchapter9;
public class LabChapter9 {
    public static void main(String[] args) {
        //Challenge 7
        System.out.println("---- Challenge 7 -----------------------------------------------");
        Customer c1 = new Customer(1, false, "Bob Smith", "1234 Main St.", "262 555 5555");
        Customer c2 = new Customer(2, true, "Joe Shmo", "4321Main St.", "262 111 5555");
        Customer c3 = new Customer(3, false, "Billy Bob", "2341 Main St.", "262 222 5555");
        
        System.out.println("Customer Number: " + c1.getCustomerNumber() + ", Customer name: " + c1.getName() + ", Address: " + c1.getAddress() + ", Number: " + c1.getNumber() + ", Mailing list: " + c1.isMailingList());
        System.out.println("Customer Number: " + c2.getCustomerNumber() + ", Customer name: " + c2.getName() + ", Address: " + c2.getAddress() + ", Number: " + c2.getNumber() + ", Mailing list: " + c2.isMailingList());
        System.out.println("Customer Number: " + c3.getCustomerNumber() + ", Customer name: " + c3.getName() + ", Address: " + c3.getAddress() + ", Number: " + c3.getNumber() + ", Mailing list: " + c3.isMailingList());
        
        //Challenge 8
        System.out.println("\n---- Challenge 8 -----------------------------------------------");
        PreferredCustomer c4 = new PreferredCustomer(3, false, "Billy Bob", "2341 Main St.", "262 222 5555");
        
        System.out.println("Customer name is " + c4.getName() + ", they will get a " + c4.getDiscount() * 100 + "% discount");
        
        System.out.println("Add $500 to customers purchace history...");
        c4.addAmmount(500);
        System.out.println("They will now get a " + c4.getDiscount() * 100 + "% discount");
        
        System.out.println("Add $500 to customers purchace history...");
        c4.addAmmount(500);
        System.out.println("They will now get a " + c4.getDiscount() * 100 + "% discount");
        
        System.out.println("Add $500 to customers purchace history...");
        c4.addAmmount(500);
        System.out.println("They will now get a " + c4.getDiscount() * 100 + "% discount");
        
        System.out.println("Add $500 to customers purchace history...");
        c4.addAmmount(500);
        System.out.println("They will now get a " + c4.getDiscount() * 100 + "% discount");
        
        System.out.println("----------------------------------------------------------------");
    }
    
}
