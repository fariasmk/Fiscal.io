package com.maikon.fiscalio.controller;

import com.maikon.fiscalio.model.NotaFiscal;
import com.maikon.fiscalio.service.NotaFiscalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notaFiscal")
public class NotaFiscalController {

    private final NotaFiscalService notaFiscalService;

    public List<NotaFiscal> findAll() {
        return notaFiscalService.findAll();
    }
}