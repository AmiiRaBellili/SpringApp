package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
