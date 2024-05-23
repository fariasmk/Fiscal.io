package com.maikon.fiscalio.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idItem;

    private  Integer idNota;

    @ManyToOne
    @JoinColumn(name = "idNota", insertable = false, updatable = false)
    private NotaFiscal notaFiscal;

    private String produto;

    @Column(precision = 15, scale = 3)
    private  BigDecimal valor;
}
