
# Serviço de Agendamento com Servlets (Java EE)
Criado como _Dynamic Web Project no Eclipse IDE
## Configuração de servidor local

Servidor Apache Tomcat 9

1. No campo abaixo da aba Servers, clique com o botão direito do mouse para adicionar um servidor local:
![image](https://user-images.githubusercontent.com/54105984/198866949-72a35e5c-4f08-4e7c-82a5-d8b304864ce3.png)
![image](https://user-images.githubusercontent.com/54105984/198866760-30daf54a-2a55-4299-a58c-3a56c89798ee.png)

2. Depois adicione o projeto como um recurso do servidor, clicando com o botão direito do mouse no servidor e selecione _Add and Remove_ .
![image](https://user-images.githubusercontent.com/54105984/198867046-0f1ad68c-28a1-489a-b575-21eb49209456.png)

3. Adicione o projeto clicando no mesmo e depois no botão _Add_, o projeto irá para a caixa _Configured_ na direita. Feito isso clique em _Finish_.
![image](https://user-images.githubusercontent.com/54105984/198867071-a4da30e0-bca4-4722-aed3-39e8a6c4b604.png)

4. Agora só iniciar o servidor clicando com o botão direito do mouse no servidor e depois na opção _Start_.
![image](https://user-images.githubusercontent.com/54105984/198867146-14cd8521-c8d9-45c4-9558-7fd86c3a1eb2.png)

5. Com o servidor local iniciado, a página principal estará disponível em: ```localhost:8080/sistema-agendamento/home```

### Obs.: Alterações no código Java faz necessário reiniciar o servidor para que as alterações sejam sincronizadas.

## Script de criação do banco do projeto

O projeto usa um driver JDBC MySQL, portanto instale o MySQL e crie o banco a partir do script a seguir:

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
