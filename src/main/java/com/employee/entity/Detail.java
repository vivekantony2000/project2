package com.employee.entity;

import java.util.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import com.employee.form.DetailForm;


@Entity
public class Detail {
    public static enum Status {
        DELETED((byte) 0),
        ACTIVE((byte) 1);

        public final byte value;

        private Status(byte value) {
            this.value = value;
        }
    }

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String address;
    private String city;
    private String state;
    private String country;
    private byte status;
    @OneToOne(optional= false,fetch = FetchType.LAZY )
    private Employee employee;
    @ElementCollection(fetch = FetchType.LAZY)
    private Collection<String> phone;
    @ElementCollection(fetch = FetchType.LAZY)
    private Collection<String> email;

    public Detail() {
    }

    public Detail(DetailForm form, Integer empId) {
        System.out.println(empId);
        this.employee = new Employee(empId);
        this.firstName = form.getFirstName();
        this.lastName = form.getLastName();
        this.dob = form.getDob();
        this.address = form.getAddress();
        this.city = form.getCity();
        this.state = form.getState();
        this.country = form.getCountry();
        this.phone = form.getPhones();
        this.email = form.getEmails();
        this.status = Status.ACTIVE.value;       
    }

    public Detail update(DetailForm form) {
        this.firstName = form.getFirstName();
        this.lastName = form.getLastName();
        this.dob = form.getDob();
        this.address = form.getAddress();
        this.city = form.getCity();
        this.state = form.getState();
        this.country = form.getCountry();
        this.phone = form.getPhones();
        this.email = form.getEmails();
        return this;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Collection<String> getPhone() {
        return phone;
    }

    public void setPhone(Collection<String> phone) {
        this.phone = phone;
    }

    public Collection<String> getEmail() {
        return email;
    }

    public void setEmail(Collection<String> email) {
        this.email = email;
    }
}
