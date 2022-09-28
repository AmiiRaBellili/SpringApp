package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
