CREATE TABLE tag(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    id_projeto INT NOT NULL,
    area_atuacao VARCHAR(100) NOT NULL,
    CONSTRAINT id_projeto_comentario FOREIGN KEY (id_projeto) REFERENCES projeto(id)
)