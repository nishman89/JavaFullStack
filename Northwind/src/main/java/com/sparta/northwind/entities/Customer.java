package com.sparta.northwind.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Size(max = 5)
    @Column(name = "CustomerID", nullable = false, length = 5)
    private String customerID;

    @Size(max = 40)
    @NotNull
    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;

    @Size(max = 30)
    @Column(name = "ContactName", length = 30)
    private String contactName;

    @Size(max = 30)
    @Column(name = "ContactTitle", length = 30)
    private String contactTitle;

    @Size(max = 60)
    @Column(name = "Address", length = 60)
    private String address;

    @Size(max = 15)
    @Column(name = "City", length = 15)
    private String city;

    @Size(max = 15)
    @Column(name = "Region", length = 15)
    private String region;

    @Size(max = 10)
    @Column(name = "PostalCode", length = 10)
    private String postalCode;

    @Size(max = 15)
    @Column(name = "Country", length = 15)
    private String country;

    @Size(max = 24)
    @Column(name = "Phone", length = 24)
    private String phone;

    @Size(max = 24)
    @Column(name = "Fax", length = 24)
    private String fax;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactTitle='" + contactTitle + '\'' +
                '}';
    }
}