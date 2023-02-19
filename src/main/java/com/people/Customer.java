package com.people;

import com.easyschedule.Appointment;
import com.utils.Query;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Customer extends Person{
    private int divisionId;
    private String address, phoneNumber, postalCode, division;
    private ObservableList<Appointment> associatedAppointments;

    public Customer(int id, String name, String address, String postalCode, String phoneNumber, int divisionId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.divisionId = divisionId;
        setDivision();
        this.associatedAppointments = FXCollections.emptyObservableList();
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision() {
        division = Query.getDivision(divisionId);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void printCustomer() {
        System.out.println(getName() + ":\n" + getAddress() + " " + getDivisionId() + ", " + getPostalCode() + "\n\n");
    }
}