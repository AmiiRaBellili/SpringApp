package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
