package com.maikon.fiscalio.Service;

import com.maikon.fiscalio.Model.NotaFiscal;
import com.maikon.fiscalio.Repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaFiscalService {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    public List<NotaFiscal> findAll() {
        return notaFiscalRepository.findAll();
    }
}