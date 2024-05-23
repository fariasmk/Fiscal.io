package com.maikon.fiscalio.service;

import com.maikon.fiscalio.model.NotaFiscal;
import com.maikon.fiscalio.repository.NotaFiscalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
class NotaFiscalServiceTest {

    @Mock
    private NotaFiscalRepository notaFiscalRepository;

    @InjectMocks
    private NotaFiscalService notaFiscalService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindAll() {
        List<NotaFiscal> notasFiscais = new ArrayList<>();
        notasFiscais.add(new NotaFiscal(1, "Emissor 1", null));
        notasFiscais.add(new NotaFiscal(2, "Emissor 2", null));

        when(notaFiscalRepository.findAll()).thenReturn(notasFiscais);

        List<NotaFiscal> resultado = notaFiscalService.findAll();

        assertEquals(notasFiscais.size(), resultado.size());
        for (int i = 0; i < notasFiscais.size(); i++) {
            assertEquals(notasFiscais.get(i), resultado.get(i));
        }
    }

}