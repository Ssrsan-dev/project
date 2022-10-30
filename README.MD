## Criação do banco do projeto
--

``` sql
CREATE DATABASE `servico_agendamento`;

use servico_agendamento;

CREATE TABLE `cliente` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `contato` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB;

CREATE TABLE `agendamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(100) NOT NULL,
  `cpfCliente` varchar(11) NOT NULL,
  `contato` varchar(12) NOT NULL,
  `data_criado` varchar(50) NOT NULL,
  `data_hora_marcado` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

ALTER TABLE agendamento ADD FOREIGN KEY (cpfCliente) REFERENCES Cliente(cpf);
```
