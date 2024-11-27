CREATE TABLE LIVRO(
    ID-LIVRO SERIAL NOT NULL,
    NOME VARCHAR(50) NOT NULL,
    SINOPSE VARCHAR(1000),
    GENERO_TEXTUAL VARCHAR(100),
    CLASSIFICACAO_INDICATIVA VARCHAR(10),
    QUANT_PAGINA  INTEGER,
    ESTANTE VARCHAR(1),
    ANO_PUBLICACAO INTEGER,
    ID_AUTOR INTEGER NOT NULL,
    ID_EDITORA INTEGER NOT NULL,

    PRIMARY KEY (ID_LIVRO),
    FOREIGN KEY (ID_AUTOR)REFERENCES AUTOR (ID_AUTOR),
    FOREIGN KEY (ID_EDITORA)REFERENCES EDITORA (ID_EDITORA) 
);