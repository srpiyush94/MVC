package com.setter;

public class Address {
	 
    private String street;     
    private String city;     
    private String state;    
    private String zipcode;
 
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
 
    public void printAddressDetail(){
        System.out.println("Address Street \t\t: " + street);
        System.out.println("Address City \t\t: " + city);
        System.out.println("Address State \t\t: " + state);
        System.out.println("Address Zip Code \t: " + zipcode);
    }
}