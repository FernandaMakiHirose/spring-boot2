## Projeto 1 Spring Boot
- Projeto com spring.initialzr e importar na IDE.
- Arquivos application.properties para dev e prod.
- Classe de configuração de BD e anotar com @Configuration.
- Mapear propriedades com @ConfigurationProperties.
- Criar métodos para instanciar Beans de cada env.
- Criar classe anotada com @RestController.
- Injetar propriedade appMessage com @Value.
- Criar método que retorna a mensagem acima.
- Executar o projeto no browser.

## Pré-requisitos
- IDE e Java instalados.

## Multiplos ambientes
- Bancos de dados para cada ambientes.
- Execução de testes unitários em ambiente local.
- Suíte de testes completas em ambiente de testes.
- Simulação de ambiente real em staging.
- Deploy simplificado em produção.

## Spring Boot Profiles
- Configurações próprias para cada ambiente.
- Ambientes com sua configuração: dev, production.

## Comandos
- Para ver a versão do maven.
> ```
>mvn -v
> ```

- Para executar o programa.
> ```
>mvn spring-boot:run
> ```

## Caso a porta 8080 foi usada mais de uma vez
- Abrir o PROMPT utilizando Windows + R e digitando cmd na busca; <br> 
- Digitar o comando:
> ```
>netstat -a -n -o
> ``` 
- Teclar Enter; <br>
- Irá listar todos os processos que utilizam portas, onde estará primeiro o IP seguido por dois pontos e a porta na coluna "Endereço externo"; <br>
- Após encontrar a porta 8080, verificar o número do PID que se encontra a frente, depois da coluna "Estado"; <br>
- Digitar o seguinte comando no próprio prompt, sem as aspas.
> ```
>git clone tskill "NÚMERO DO PID"
> ```
- Teclar enter e verificar se outro processo está usando a porta; <br>
- Caso o comando "tskill" não funcione usar o seguinte, sem as aspas: <br>

## Passo 1
- https://start.spring.io/
- Maven project.
- Java.
- Escolhi a última versão.
- Dei um nome para o Group e o Artifact.
- Dependência: Spring Web.

## Passo 2
- Extraí e abra o projeto na IDE.
- Na pasta resources criei um arquivo application-dev.properties, arquivo de desenvolvimento.
- Na pasta resources criei um arquivo application-prod.properties, é um arquivo de banco de dados, simula uma conexão com o mysql.
- No pacote com.digitalinnovationone.springbootconfig, criei um pacote config e uma java class DBConfiguration.

## Passo 3
- Adicionei a dependência do lombok no pom.xml para configurar o getter e o setter. <br>

## Passo 4
- No arquivo application.properties adicionei código. <br>
- Dentro da pasta config, criou um java class AppController. <br>

## Projeto 2 Spring Boot
- Migrei app.properties do profile dev para YML. <br>
- Executei o projeto pelo terminal. <br>

## Passo 1 
- Renomeei o application-dev.properties para application-dev.yml. <br>
- Adicione o código dentro: <br>

> ```
>app: 
>  message: This is the property file to the ${spring.application.name}
>
>spring: 
>  datasource: 
>  driver-class-name: org.h2.Driver 
>  url: jdbc:h2:mem:db;DB_CLOSE_DELAY=-1 
>  username: sa 
>  password: sa 
> ```

- No application.properties, deixei como dev: <br>
spring.profiles.active=dev. <br>
- No terminal execute.
> ```
> mvn spring-boot:run
> ```
- No seu navegador digite: localhost:8080. <br>

## Uso de command line
- Propriedades do arquivo de configuração na linha de comando. <br>
- Sobrescreve as propriedades definidas no arquivo de configurações padrão. <br>
- Valores passados como argumento na execução do projeto. <br>

## Exercício 3 
- Passei como argumento a propriedade server.port=8085.
- Executei o projeto no terminal com o argumento.
- Abri o browser no endereço localhost:8085.

## Passo 1 
- No application-prod.properties adicionei o código: server.port=8080. <br>
- No application.properties deixei em produção: spring.profiles.active=prod. <br>
- No terminal digite: mvn spring-boot:run -Dserver.port=8085. <br>
- No navegador digite.
> ```
>http://localhost:8085/
> ```

## Variáveis de ambiente 
- Pode ser injetada através da anotação: @Value. <br>
- Injeção com anotação @Value({NOME_VARIAVEL}). <br>
- Definição de valor default quando não há variável. <br>

## Exercício 4
- Injetei a variável com o @Value em AppController. <br>
- Definição de valor default junto com a anotação @Value. <br>
- Criei um método para chamada de novo método e exibi o valor. <br>
- Executei o projeto no terminal e exibi no browser. <br>

## Passo 1 
- Defini as variáveis de ambiente no AppController.java. <br>
- <a href="https://github.com/FernandaMakiHirose/spring-boot2/blob/main/springbootconfig/variaveis-de-ambiente.txt">Siga este arquivo</a>
- No terminal exportei o valor da variável:
> ```
>export ENV_DB_URL=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1 
>mvn spring-boot:run
> ```

## Sobre a Autora
Oi, eu sou a Fernanda! Estou aqui para contribuir com meu conhecimento e espero poder ajudar no desenvolvimento profissional de cada um de vocês.

[![Linkedin Badge](https://img.shields.io/badge/-Fernanda_Maki_Hirose-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/fernanda-maki-hirose-801117208/)](https://www.linkedin.com/in/fernanda-maki-hirose-801117208/)  [![Gmail Badge](https://img.shields.io/badge/-femahi2020@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:femahi2020@gmail.com)](mailto:femahi2020@gmail.com)
