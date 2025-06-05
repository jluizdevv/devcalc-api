2 Explicando a Diferença entre Workflows e Actions

Basicamente no GitHub Actions, workflows e actions têm papéis diferentes. O Workflow é o fluxo completo de automação, descrito em arquivos .yml dentro da pasta .github/workflows/. Ele define quando e quais jobs serão executados (como build, teste, deploy).Já o Action é uma tarefa reutilizável dentro de um job. Pode ser criada por você ou importada do GitHub Marketplace e é usada no workflow. É estruturada por um arquivo action.yml, que define Entradas (inputs), parâmetros de configuração.
Saídas (outputs), valores que a action pode expor. Execução, comandos ou scripts que ela executa.
