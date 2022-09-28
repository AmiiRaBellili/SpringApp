package com.bellilidz.formation.repositories;


import com.bellilidz.formation.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
