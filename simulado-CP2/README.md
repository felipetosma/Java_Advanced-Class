# Simulado Avaliativo | Java Advanced

Este repositório traz a estrutura base na qual deve ser implementado o projeto de simulação de avaliação para o curso de Java Advanced com Spring Framework.

## Pre-Requisitos

- IntelliJ IDEA ou outra IDE de sua preferência (Eclipse, Netbeans, Visual Studio, etc)
- Maven v3.8.7
- Java (JDK 17), com SpringBoot 3.0.1
- Um servidor SQL configurado e sua URL/Porta de conexão

## Setup do Build/Run

1. Crie um novo projeto com sua IDE a partir do código fonte deste repositório como um projeto Maven;
2. Verifique se o projeto possui uma JDK configurada, indo em *Project Structure/Project/SDK*, selecionando/baixando o graalvm-jdk-17;
3. Vá em *Edit Configuration* e adicione uma nova config *Maven*, setando o campo *Run* com a seguinte linha:


    -Dmaven.test.skip=true package

5. Faça o build do projeto executando a linha de config anteriormente criada para gerar o .jar;
5. Vá em *Edit Configuration* e adicione uma outra nova config *JAR Application*, setando o campo *Path to JAR* com a seguinte linha:


    <diretório raíz do projeto>\target\simulado-0.0.1-SNAPSHOT.jar

7. Ainda na config do *JAR Application* adicione o seguinte comando no *Before Launch*:


    -Dmaven.test.skip=true package

8. Faça as devidas configurações para o banco de dados no *application.properties*.

## Instruções Gerais

Este projeto possui uma estrutura base para codificação, na qual temos já presentes:

- As classes entidades *Owner* e *Blog*, com relacionamento 1 para N;
- As interfaces de repositórios para as entidades *Owner* e *Blog*, com alguns exemplos de queries JPQL;
- Um *OwnerController* com implementações mínimas de criação e obtenção de registros;
- Arquivo POM com as dependências já configuradas;
- Arquivo *application.properties* com campos que DEVEM ser preenchidos;
- Arquivo *postman_collection* com exemplos de registros de chamadas;
- Este arquivo *README* com instruções gerais.

Você deve seguir as instruções presentes na próxima seção e realizar cada uma de suas tarefas para concluir este simulado.

DICAS:
- Seja uma pessoa detalhista. Cada detalhe vale ponto!
- Recorra aos materiais das aulas anteriores e à internet!
- Cada tarefa será avaliada de forma independente (não existem pré-requisitos de uma para outra)!

## Tarefas do Simulado

1. [20pts] Observe os exemplos dos métodos já implementados no controller e crie as chamadas para o conjunto completo CRUD para a entidade Owner;
2. [10pts] Crie ao menos 1 consulta filtrada por meio de JPQL (sugestão: busca por nome);
3. [10pts] Crie ao menos 1 consulta filtrada por meio de @Query com SQL nativo (sugestão: use um SELECT comum em cima de uma tabela qualquer);
4. [10pts] Eleve a API fornecida pelo *OwnerController* a um nível de Richardson igual ou superior a 2. Para a criação de um novo registro, use o @RequestBody;
5. [10pts] Implemente uma entidadade adicional, além da *Owner* e *Blog*, e que tenha uma relação de 1:1 com *Owner* (sugestão: *Address*, onde 1 *Owner* mora em apenas 1 *Address*);
6. [10pts] Complete o arquivo *Simulado.postman_collection* com as chamadas do CRUD criado;
7. [10pts] Crie uma consulta paginada para a entidade *Blog* no *OwnerController*. Use um tamanho de página de 5 registros;
8. [10pts] Escreva a seção seguinte (*Considerações Gerais*) com instruções de como executar o projeto, o banco de dados a ser usado, detalhamentos, etc;
9. [10pts] Projeto buildando com sucesso.

Sua entrega deverá ser feita por meio de um repositório github (acessível pelo professor) ou diretório .zip enviado através de canais de comunicação da instituição ou email corporativo.

## Considerações Gerais

- *A ser preenchido*
- *A ser preenchido*
- *A ser preenchido*
- 

1. *A ser preenchido*
2. *A ser preenchido*
3. *A ser preenchido*
4. 
