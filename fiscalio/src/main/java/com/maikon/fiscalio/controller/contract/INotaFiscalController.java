package com.maikon.fiscalio.controller.contract;

import com.maikon.fiscalio.model.NotaFiscal;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Tag(name = "Nota Fiscal")
public interface INotaFiscalController {

    @GetMapping
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "401",
                    description = "Não autorizado"
            ),
            @ApiResponse(responseCode = "403",
                    description = "Acesso negado"
            ),
    })
    @Operation(summary = "Endpoint para listar todas as notas fiscais")
    //Todo: Implementar o endpoint para buscar todas as notas fiscais com paginacão
    ModelAndView findAll();
}