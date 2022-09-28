package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
