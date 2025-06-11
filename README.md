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
git clone https://github.com/jluizdevv/devcalc-api
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

## Depuração do Pipeline com GitHub Actions

Durante a configuração do pipeline, foi provocado intencionalmente uma falha ao modificar um comando no job de build (run: mvn clean install → run: mvn cleann install). Após o push, foi acessado a aba Actions do repositório no GitHub, onde foi possível visualizar o histórico de execuções e analisar os logs detalhados do workflow com erro.
A interface mostrou claramente em qual step ocorreu a falha e qual foi a mensagem de erro. Corrigi o comando inválido no arquivo ci.yml, e realizei novo commit e push, e confirmei a execução bem-sucedida na mesma aba de Actions. Essa prática demonstrou a importância do uso de logs e da estrutura modular dos workflows para facilitar a identificação e correção de erros.

## Observações sobre Execuções do Pipeline
Realizei duas execuções distintas do pipeline: uma acionada automaticamente por um push na branch main e outra manualmente através do botão "Run workflow" na aba Actions do GitHub. Pela interface, é possível identificar o tipo de gatilho usado em cada execução, usando os filtros disponíveis no menu lateral da aba Actions. A execução via push ocorre de forma imediata sempre que há mudanças no código, sendo útil para validar automaticamente novas versões. Já a execução manual permite maior controle, pois é possível selecionar parâmetros como run_tests e run_lint, úteis para testes específicos ou execuções parciais. Essa flexibilidade torna o pipeline mais adaptável ao fluxo de trabalho da equipe.

 Etapas DO TP3 do Projeto DevCalc com GitHub Actions
Este repositório demonstra a automação de CI/CD com GitHub Actions integrando práticas modernas de DevOps. As etapas implementadas foram:

Etapa 1 - Execução de Comandos no Runner
Criado um workflow para verificar o ambiente do runner e instalar ferramentas adicionais.

Comandos como curl --version foram usados para validar a instalação.

Reexecutar:
Acesse a aba Actions, selecione o workflow da Etapa 1, e clique em Run workflow.

Etapa 2 - Uso de Variáveis e Secrets
Definidas variáveis como APP_MODE e SUPPORT_EMAIL.

Criado o secret PROD_TOKEN usado em um passo simulado de autenticação.

Reexecutar:
Reinicie o workflow associado via Actions > Run workflow ou realize um push para a branch.

Etapa 3 - Contextos e Escopos de Variáveis
Demonstrado o uso de variáveis de ambiente em três níveis: workflow, job e step.

Exibidas também informações de contexto como ${{ github.actor }} e ${{ runner.os }}.

Reexecutar:
Rodar novamente o workflow env-context-demo.yml.

Etapa 4 - Controle de Permissões e Uso do GITHUB_TOKEN
Configuradas permissões para o token padrão (GITHUB_TOKEN) com escopo contents: write.

Criada uma issue automaticamente quando uma condição é atendida (ex: variável ausente).

Reexecutar:
Modificar uma variável no workflow criar-issue-automatica.yml e fazer um commit para acionar a issue.

Etapa 5 - Ambientes de Deploy para Dev e Prod
Criados dois environments: dev (com liberação automática) e prod (com aprovação manual).

O deploy ocorre automaticamente ao fazer push para dev, e exige aprovação na branch main.

Reexecutar:

Faça push para dev → deploy automático.

Faça push para main → requer aprovação via GitHub interface.

Etapa 6 - Nova Funcionalidade na API (Raiz Quadrada)
Adicionado o endpoint: GET /sqrt?x=16

Atualizados testes automatizados na classe CalculatorServiceTest.

Confirmada a integração contínua com sucesso após a implementação.

Reexecutar:
Faça qualquer commit e verifique a execução dos testes no workflow de CI/CD.
