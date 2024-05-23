package com.maikon.fiscalio.Repository;

import com.maikon.fiscalio.Model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Integer> {
}
