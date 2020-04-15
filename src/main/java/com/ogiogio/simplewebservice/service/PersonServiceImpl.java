package com.ogiogio.simplewebservice.service;

import com.ogiogio.simplewebservice.contract.PersonService;
import com.ogiogio.simplewebservice.model.PeopleInfo;
import com.ogiogio.simplewebservice.model.Person;
import com.ogiogio.simplewebservice.model.PersonInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {
    @Override
    public PersonInfo getPerson() {
        Person person = new Person();
        PersonInfo personInfo = new PersonInfo();
        person.setName("Emmanuel Ogiogio");
        person.setAccNumber("0049346289");
        person.setBank("Union Bank");
        personInfo.setResponseCode("00");
        personInfo.setResponseMessage("Successful");
        personInfo.setPerson(person);
        return personInfo;
    }

    @Override
    public PeopleInfo getPeople() {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person();
        person1.setName("Dominic Ebingonye");
        person1.setAccNumber("1002354687");
        person1.setBank("Diamond/Access Bank");

        Person person2 = new Person();
        person2.setName("Emmanuel Ogiogio");
        person2.setAccNumber("0049346289");
        person2.setBank("Union Bank");
        list.add(person1);
        list.add(person2);

        PeopleInfo peopleInfo = new PeopleInfo();
        peopleInfo.setResponseCode("00");
        peopleInfo.setResponseMessage("Successful");
        peopleInfo.setPeople(list);
        return peopleInfo;
    }
}
