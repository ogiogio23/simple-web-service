package com.ogiogio.simplewebservice.model;

import java.util.List;

public class PeopleInfo extends BaseResponse {
    private List<Person> people;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

}
