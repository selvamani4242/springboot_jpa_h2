package com.sample.H2.dao;

import com.sample.H2.model.PersonInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sample.H2.repository.PersonInformationjpaRepository;

import java.util.List;

@Component
public class PersonInformationService implements IPersonInformationService {

    @Autowired
    PersonInformationjpaRepository personInformationjpaRepository;


    @Override
    public PersonInformation findByName(String name) {
          PersonInformation personInformation = personInformationjpaRepository.findByFirstname(name);
          return personInformation;
    }

    @Override
    public List<PersonInformation> findAll() {
            List<PersonInformation> personInformationjpaRepositoryAll = personInformationjpaRepository.findAll();
       return personInformationjpaRepositoryAll;
    }

    @Override
    public PersonInformation save(PersonInformation personInformation) {
        PersonInformation personInformation1 = personInformationjpaRepository.save(personInformation);
        return personInformation1;
    }
}
