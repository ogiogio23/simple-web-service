package com.ogiogio.simplewebservice.contract;

import com.ogiogio.simplewebservice.model.PeopleInfo;
import com.ogiogio.simplewebservice.model.Person;
import com.ogiogio.simplewebservice.model.PersonInfo;

import java.util.List;

public interface PersonService {
    PersonInfo getPerson();
    PeopleInfo getPeople();
}
