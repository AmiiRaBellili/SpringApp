package com.bellilidz.formation.repositories;

import com.bellilidz.formation.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
