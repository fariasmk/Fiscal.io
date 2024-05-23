package com.maikon.fiscalio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNota;

    private String emissor;

    @Temporal(TemporalType.DATE)
    private Date data;

    @OneToMany(mappedBy = "notaFiscal", cascade = CascadeType.ALL)
    private List<Item> items;

    public NotaFiscal(Integer idNota, String emissor, Date data) {
        this.idNota = idNota;
        this.emissor = emissor;
        this.data = data;
    }
}