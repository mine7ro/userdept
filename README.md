API Rest de Usuários e Departamentos Visão Geral Esta documentação descreve o processo de deploy de uma API Rest desenvolvida em Java usando Spring Boot e banco de dados H2. A API permite operações básicas em entidades de usuários e departamentos, como buscar todos os usuários, buscar um usuário específico pelo seu ID e cadastrar novos usuários.

Funcionalidades da API:
Buscar Todos os Usuários: URL: /api/users Método HTTP: GET Descrição: Retorna uma lista de todos os usuários cadastrados no sistema.

Buscar Usuário por ID: URL: /api/users/{id} Método HTTP: GET Descrição: Retorna os detalhes de um usuário específico identificado pelo seu ID. Parâmetros: id (Path Variable): O ID do usuário a ser buscado.

Cadastrar Novo Usuário: URL: /api/users Método HTTP: POST Descrição: Cadastra um novo usuário no sistema. Body (JSON): Informações do novo usuário (e.g., nome, email, departamento). Estrutura do Banco de Dados

Usuários (Users): ID (identificador único) Nome Email Departamento (associação com a tabela de departamentos)

Departamentos (Departments): ID (identificador único) Nome

Tecnologias Utilizadas: Java Spring Boot Banco de Dados H2 (em memória para facilitar testes e desenvolvimento)

Considerações Finais Esta API foi desenvolvida com o objetivo de ser simples e eficiente, utilizando o banco de dados H2 em memória para facilitar o desenvolvimento e testes. A arquitetura baseada em Spring Boot proporciona escalabilidade e facilidade de manutenção. Para um ambiente de produção, recomenda-se configurar um banco de dados persistente e realizar ajustes de segurança adicionais.
