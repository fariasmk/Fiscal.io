CREATE TABLE nota_fiscal (
    idNota SERIAL PRIMARY KEY,
    emissor VARCHAR(150),
    data DATE
);

CREATE INDEX idx_data ON nota_fiscal USING HASH (data);

CREATE TABLE item (
    idNota INT,
    idItem SERIAL,
    produto TEXT,
    valor NUMERIC(15,3),
    PRIMARY KEY (idNota, idItem),
    FOREIGN KEY (idNota) REFERENCES nota_fiscal(idNota)
);

CREATE INDEX idx_produto ON item USING BTREE (produto);
