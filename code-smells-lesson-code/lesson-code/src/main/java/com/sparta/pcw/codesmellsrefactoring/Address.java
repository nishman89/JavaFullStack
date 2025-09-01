package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    private int houseNo = 0;
    private String street = "";
    private String town = "";

    public Address(int houseNo, String street, String town) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        var addressString = "Address: " + getHouseNo() + " " + getStreet() + ", "  + getTown();

        if (addressString.equals("Address: 0 , ")) {
            addressString = "Address: <no address set>";
        }
        return addressString;
    }
}
