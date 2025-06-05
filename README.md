# DevCalc

![CI Status](https://github.com/jluizdevv/devcalc-api/actions/workflows/ci.yml/badge.svg)

Projeto simples de uma API em Java com Spring Boot que realiza operações matemáticas básicas: soma, subtração, multiplicação e divisão.

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- JUnit 5
- GitHub Actions

## Como executar o projeto

1. Clone o repositório:
git clone https://github.com/seu-usuario/devcalc-api.git
cd devcalc-api
2. Compile o projeto:
mvn clean install
3. Execute a aplicação:
mvn spring-boot:run

## CI/CD com GitHub Actions
Este projeto utiliza um workflow de CI/CD automatizado com as seguintes etapas:

Job	Descrição
checkout	Faz checkout do código-fonte
build	Compila o projeto com Maven
test	Executa todos os testes unitários
package	Gera o arquivo .jar do projeto
deploy	Simula o deploy com uma mensagem de sucesso

Também é possível executar o pipeline manualmente pela interface do GitHub (via botão "Run workflow").

Execução manual
O workflow também suporta execução manual via GitHub Actions usando workflow_dispatch.
Você pode rodar o pipeline diretamente na aba Actions do repositório.

Depuração do Pipeline com GitHub Actions

Durante a configuração do pipeline, foi provocado intencionalmente uma falha ao modificar um comando no job de build (run: mvn clean install → run: mvn cleann install). Após o push, foi acessado a aba Actions do repositório no GitHub, onde foi possível visualizar o histórico de execuções e analisar os logs detalhados do workflow com erro.
A interface mostrou claramente em qual step ocorreu a falha e qual foi a mensagem de erro. Corrigi o comando inválido no arquivo ci.yml, e realizei novo commit e push, e confirmei a execução bem-sucedida na mesma aba de Actions. Essa prática demonstrou a importância do uso de logs e da estrutura modular dos workflows para facilitar a identificação e correção de erros.

