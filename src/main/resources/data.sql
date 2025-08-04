CREATE TABLE Dono (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    login VARCHAR(255),
    senha VARCHAR(255),
    dataUltimaAlteracao TIMESTAMP,
    rua VARCHAR(255),
    numero VARCHAR(50),
    complemento VARCHAR(255),
    bairro VARCHAR(255),
    cidade VARCHAR(255),
    estado VARCHAR(50),
    cep VARCHAR(20)
);

CREATE TABLE Cliente (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    login VARCHAR(255),
    senha VARCHAR(255),
    dataUltimaAlteracao TIMESTAMP,
    rua VARCHAR(255),
    numero VARCHAR(50),
    complemento VARCHAR(255),
    bairro VARCHAR(255),
    cidade VARCHAR(255),
    estado VARCHAR(50),
    cep VARCHAR(20)
);

INSERT INTO Dono (id, nome, email, login, senha, dataUltimaAlteracao, rua, numero, complemento, bairro, cidade, estado, cep)
VALUES
(1, 'Mauricio Borges', 'mauricio@restaurante.com', 'mauricio', 'senha123', CURRENT_TIMESTAMP, 'Rua A', '100', '', 'Centro', 'São Paulo', 'SP', '01000-000'),
(2, 'Ana Souza', 'ana@restaurante.com', 'ana', 'senha456', CURRENT_TIMESTAMP, 'Rua B', '200', 'Ap 2', 'Jardim', 'Rio de Janeiro', 'RJ', '20000-000'),
(3, 'Carlos Lima', 'carlos@restaurante.com', 'carlos', 'senha789', CURRENT_TIMESTAMP, 'Rua C', '300', '', 'Bela Vista', 'Belo Horizonte', 'MG', '30000-000');

INSERT INTO Cliente (id, nome, email, login, senha, dataUltimaAlteracao, rua, numero, complemento, bairro, cidade, estado, cep)
VALUES
(1, 'João Silva', 'joao@email.com', 'joao', 'senha1', CURRENT_TIMESTAMP, 'Rua D', '10', '', 'Centro', 'São Paulo', 'SP', '01001-000'),
(2, 'Maria Oliveira', 'maria@email.com', 'maria', 'senha2', CURRENT_TIMESTAMP, 'Rua E', '20', '', 'Jardim', 'Rio de Janeiro', 'RJ', '20001-000'),
(3, 'Pedro Santos', 'pedro@email.com', 'pedro', 'senha3', CURRENT_TIMESTAMP, 'Rua F', '30', '', 'Bela Vista', 'Belo Horizonte', 'MG', '30001-000'),
(4, 'Lucas Costa', 'lucas@email.com', 'lucas', 'senha4', CURRENT_TIMESTAMP, 'Rua G', '40', '', 'Centro', 'Curitiba', 'PR', '80001-000'),
(5, 'Fernanda Lima', 'fernanda@email.com', 'fernanda', 'senha5', CURRENT_TIMESTAMP, 'Rua H', '50', '', 'Jardim', 'Porto Alegre', 'RS', '90001-000'),
(6, 'Rafael Alves', 'rafael@email.com', 'rafael', 'senha6', CURRENT_TIMESTAMP, 'Rua I', '60', '', 'Bela Vista', 'Recife', 'PE', '50001-000'),
(7, 'Juliana Souza', 'juliana@email.com', 'juliana', 'senha7', CURRENT_TIMESTAMP, 'Rua J', '70', '', 'Centro', 'Salvador', 'BA', '40001-000'),
(8, 'Bruno Pereira', 'bruno@email.com', 'bruno', 'senha8', CURRENT_TIMESTAMP, 'Rua K', '80', '', 'Jardim', 'Fortaleza', 'CE', '60001-000'),
(9, 'Patricia Mendes', 'patricia@email.com', 'patricia', 'senha9', CURRENT_TIMESTAMP, 'Rua L', '90', '', 'Bela Vista', 'Manaus', 'AM', '69001-000'),
(10, 'Gabriel Martins', 'gabriel@email.com', 'gabriel', 'senha10', CURRENT_TIMESTAMP, 'Rua M', '100', '', 'Centro', 'Belém', 'PA', '66001-000');
