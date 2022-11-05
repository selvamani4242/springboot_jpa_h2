package com.sample.H2.repository;

import com.sample.H2.model.PersonInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface PersonInformationjpaRepository extends JpaRepository <PersonInformation,Long> {

    PersonInformation findByFirstname(String firstname);

}
