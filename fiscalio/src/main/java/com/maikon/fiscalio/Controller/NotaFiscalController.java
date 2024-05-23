package com.maikon.fiscalio.Controller;

import com.maikon.fiscalio.Model.NotaFiscal;
import com.maikon.fiscalio.Service.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notaFiscal")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalService notaFiscalService;

    public List<NotaFiscal> findAll() {
        return notaFiscalService.findAll();
    }
}