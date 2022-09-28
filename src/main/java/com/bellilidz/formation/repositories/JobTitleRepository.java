package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
