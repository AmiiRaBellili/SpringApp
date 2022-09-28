package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
