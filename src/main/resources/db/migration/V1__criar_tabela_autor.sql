CREATE TABLE AUTOR(
    ID_AUTOR SERIAL NOT NULL,
    NOME VARCHAR(50) NOT NULL,
    DESCRICAO VARCHAR(500),
    GENERO_TEXTUAL VARCHAR(200),
    PRIMARY KEY(ID_AUTOR)
);