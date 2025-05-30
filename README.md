# DevCalc

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


