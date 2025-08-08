INSERT INTO Dono (id, nome, email, login, senha, dataUltimaAlteracao, rua, numero, complemento, bairro, cidade, estado, cep)
VALUES
(1, 'Mauricio Borges', 'mauricio@restaurante.com', 'mauricio', 'senha123', NOW(), 'Rua A', '100', '', 'Centro', 'São Paulo', 'SP', '01000-000'),
(2, 'Ana Souza', 'ana@restaurante.com', 'ana', 'senha456', NOW(), 'Rua B', '200', 'Ap 2', 'Jardim', 'Rio de Janeiro', 'RJ', '20000-000'),
(3, 'Carlos Lima', 'carlos@restaurante.com', 'carlos', 'senha789', NOW(), 'Rua C', '300', '', 'Bela Vista', 'Belo Horizonte', 'MG', '30000-000');

INSERT INTO Cliente (id, nome, email, login, senha, dataUltimaAlteracao, rua, numero, complemento, bairro, cidade, estado, cep)
VALUES
(1, 'João Silva', 'joao@email.com', 'joao', 'senha1', NOW(), 'Rua D', '10', '', 'Centro', 'São Paulo', 'SP', '01001-000'),
(2, 'Maria Oliveira', 'maria@email.com', 'maria', 'senha2', NOW(), 'Rua E', '20', '', 'Jardim', 'Rio de Janeiro', 'RJ', '20001-000'),
(3, 'Pedro Santos', 'pedro@email.com', 'pedro', 'senha3', NOW(), 'Rua F', '30', '', 'Bela Vista', 'Belo Horizonte', 'MG', '30001-000'),
(4, 'Lucas Costa', 'lucas@email.com', 'lucas', 'senha4', NOW(), 'Rua G', '40', '', 'Centro', 'Curitiba', 'PR', '80001-000'),
(5, 'Fernanda Lima', 'fernanda@email.com', 'fernanda', 'senha5', NOW(), 'Rua H', '50', '', 'Jardim', 'Porto Alegre', 'RS', '90001-000'),
(6, 'Rafael Alves', 'rafael@email.com', 'rafael', 'senha6', NOW(), 'Rua I', '60', '', 'Bela Vista', 'Recife', 'PE', '50001-000'),
(7, 'Juliana Souza', 'juliana@email.com', 'juliana', 'senha7', NOW(), 'Rua J', '70', '', 'Centro', 'Salvador', 'BA', '40001-000'),
(8, 'Bruno Pereira', 'bruno@email.com', 'bruno', 'senha8', NOW(), 'Rua K', '80', '', 'Jardim', 'Fortaleza', 'CE', '60001-000'),
(9, 'Patricia Mendes', 'patricia@email.com', 'patricia', 'senha9', NOW(), 'Rua L', '90', '', 'Bela Vista', 'Manaus', 'AM', '69001-000'),
(10, 'Gabriel Martins', 'gabriel@email.com', 'gabriel', 'senha10', NOW(), 'Rua M', '100', '', 'Centro', 'Belém', 'PA', '66001-000');
