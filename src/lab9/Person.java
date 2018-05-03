/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author bschultz43
 */
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private String phone;

    public Person(String firstName, String lastName, String address, String addressCity, String addressState, String addressZip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.addressState = addressState;
        this.addressCity = addressCity;
        this.addressZip = addressZip;
        this.phone = phone;
    }

    public Person(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = "";
        this.addressCity = "";
        this.addressState = "";
        this.addressZip = "";
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressZip() {
        return addressZip;
    }

    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        String str;
        str = "Person:\n" + this.firstName + " " + this.lastName + "\n" 
                + this.address + "\n" +  this.addressCity + ", " + this.addressState + " " 
                + this.addressZip + "\n" + this.phone;
        
        return str;
    }
    
}
