package com.maikon.fiscalio.controller;

import com.maikon.fiscalio.controller.contract.INotaFiscalController;
import com.maikon.fiscalio.model.NotaFiscal;
import com.maikon.fiscalio.service.NotaFiscalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notaFiscal")
public class NotaFiscalController implements INotaFiscalController {

    private final NotaFiscalService notaFiscalService;

    @GetMapping
    public ModelAndView findAll() {
        List<NotaFiscal> notas = notaFiscalService.findAll();
        ModelAndView mav = new ModelAndView("notas-fiscais");
        mav.addObject("notas", notas);
        return mav;
    }
}