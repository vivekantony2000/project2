package com.employee.view;

import java.util.Collection;
import java.util.Collections;
import com.employee.entity.Detail;


public class DetailDetailView extends DetailListView{

    
    private final Collection<String> phones;
    private final Collection<String> emails;

    public DetailDetailView(Detail detail) {
        super(
                detail.getFirstName(),
                detail.getLastName(),
                detail.getDob(),
                detail.getAddress(),
                detail.getCity(),
                detail.getState(),
                detail.getCountry(),
                detail.getStatus()
        );
        this.phones = Collections.unmodifiableCollection(detail.getPhone());
        this.emails = Collections.unmodifiableCollection(detail.getEmail());
    }

    public Collection<String> getPhones() {
        return phones;
    }

    public Collection<String> getEmails() {
        return emails;
    }
}
