/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author jenders1
 */
public class Customer extends Person{
    int customerNumber;
    boolean mailingList;

    public Customer(int customerNumber, boolean mailingList, String name, String address, String phone) {
        super(name, address, phone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer Number #" + customerNumber + " is on mailing list (" + mailingList + ")";
    }
    
    
}
