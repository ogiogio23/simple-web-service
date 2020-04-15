package com.ogiogio.simplewebservice.controller;

import com.ogiogio.simplewebservice.contract.PersonService;
import com.ogiogio.simplewebservice.model.PeopleInfo;
import com.ogiogio.simplewebservice.model.Person;
import com.ogiogio.simplewebservice.model.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1")
public class PersonServiceController {

    @Autowired
    PersonService personService;

    @RequestMapping(value="/person", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
    public ResponseEntity<PersonInfo> getName(){
        return new ResponseEntity<>(personService.getPerson(), HttpStatus.OK);
    }

    @RequestMapping(value="/people", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
    public ResponseEntity<PeopleInfo> getPeopleName(){
        HttpHeaders responseHeader = new HttpHeaders();
        return new ResponseEntity<PeopleInfo>(personService.getPeople(),responseHeader,HttpStatus.OK) ;
    }
}
