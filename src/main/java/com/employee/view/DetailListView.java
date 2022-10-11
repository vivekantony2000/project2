package com.employee.view;

import com.employee.json.Json;
import java.util.Date;
public class DetailListView {
    
    
    private final String firstName;
    private final String lastName;
    @Json.DateFormat
    private final Date dob;
    private final String address;
    private final String city;
    private final String state;
    private final String country;
    private final byte status;


    public DetailListView(String firstName, String lastName,Date dob, String address, String city, String state, String country, byte status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.status = status;
            
    }

    // public DetailListView(Detail detail) {
    //     this.employeeId = detail.getEmployeeId();
    //     this.firstName = detail.getFirstName();
    //     this.lastName = detail.getLastName();
    //     this.dob = detail.getDob();
    //     this.address = detail.getAddress();
    //     this.city = detail.getCity();
    //     this.state = detail.getState();
    //     this.country = detail.getCountry();
    //     this.status = detail.getStatus();
            
    // }

    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public byte getStatus() {
        return status;
    }

   
    
}
