package com.maikon.fiscalio.service;

import com.maikon.fiscalio.model.NotaFiscal;
import com.maikon.fiscalio.repository.NotaFiscalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {

    private final NotaFiscalRepository notaFiscalRepository;

    public List<NotaFiscal> findAll() {
        return notaFiscalRepository.findAll();
    }
}