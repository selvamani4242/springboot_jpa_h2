package com.sample.H2.dao;

import com.sample.H2.model.PersonInformation;

import java.util.List;

public interface IPersonInformationService {


    public PersonInformation findByName(String name);
    public List<PersonInformation> findAll();
    public PersonInformation save(PersonInformation personInformation);

}
