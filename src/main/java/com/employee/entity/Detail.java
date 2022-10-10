package com.employee.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String address;
    private String city;
    private String state;
    private String country;
    private byte status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;
    @ElementCollection(fetch = FetchType.LAZY)
    private Collection<String> phone;
    @ElementCollection(fetch = FetchType.LAZY)
    private Collection<String> email;

    public Contact() {
    }

    public Contact(Integer contactId) {
        this.contactId = contactId;
    }

    public Contact(ContactForm form, Integer userId) {
        this.user = new User(userId);

        this.firstName = form.getFirstName();
        this.lastName = form.getLastName();
        this.nickName = form.getNickName();
        this.dob = form.getDob();
        this.address = form.getAddress();
        this.city = form.getCity();
        this.state = form.getState();
        this.country = form.getCountry();
        this.zipCode = form.getZipCode();

        this.phone = form.getPhones();
        this.email = form.getEmails();

        this.status = Status.ACTIVE.value;

        Date dt = new Date();
        this.createDate = dt;
        this.updateDate = dt;
    }

    public Contact update(ContactForm form) {
        this.firstName = form.getFirstName();
        this.lastName = form.getLastName();
        this.nickName = form.getNickName();
        this.dob = form.getDob();
        this.address = form.getAddress();
        this.city = form.getCity();
        this.state = form.getState();
        this.country = form.getCountry();
        this.zipCode = form.getZipCode();

        this.phone = form.getPhones();
        this.email = form.getEmails();

        Date dt = new Date();
        this.updateDate = dt;

        return this;
    }
}
