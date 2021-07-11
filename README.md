## Projeto 1 Spring Boot
- Projeto com spring.initialzr e importar na IDE
- Arquivos application.properties para dev e prod
- Classe de configuração de BD e anotar com @Configuration
- Mapear propriedades com @ConfigurationProperties
- Criar métodos para instanciar Beans de cada env
- Criar classe anotada com @RestController
- Injetar propriedade appMessage com @Value
- Criar método que retorna a mensagem acima
- Executar o projeto no browser

## Multiplos ambientes
- Bancos de dados para cada ambientes
- Execução de testes unitários em ambiente local
- Suíte de testes completas em ambiente de testes
- Simulação de ambiente real em staging
- Deploy simplificado em produção

## Spring Boot Profiles
- Configurações próprias para cada ambiente
- Ambientes com sua configuração: dev, production

## Comandos
- Para ver a versão do maven: mvn -v
- Para executar o programa: mvn spring-boot:run

## Caso a porta 8080 foi usada mais de uma vez
- Abrir o PROMPT utilizando Windows + R e digitando cmd na busca; <br> 
- Digitar o comando: netstat -a -n -o ; <br>
- Teclar Enter; <br>
- Irá listar todos os processos que utilizam portas, onde estará primeiro o IP seguido por dois pontos e a porta na coluna "Endereço externo"; <br>
- Após encontrar a porta 8080, verificar o número do PID que se encontra a frente, depois da coluna "Estado"; <br>
- Digitar o seguinte comando no próprio prompt, sem as aspas: tskill "NÚMERO DO PID" <br> 
- Teclar enter e verificar se outro processo está usando a porta; <br>
- Caso o comando "tskill" não funcione usar o seguinte, sem as aspas: <br>

## Passo 1
- https://start.spring.io/
- Maven project
- Java
- Não escolha a versão do snapshot, escolha a última versão
- Dê um nome para o Group e o Artifact
- Dependência: Spring Web

## Passo 2
- Extraia e abra o projeto na IDE
- Na pasta resources criou um arquivo application-dev.properties, arquivo de desenvolvimento
- Na pasta resources criou um arquivo application-prod.properties, é um arquivo de banco de dados, simula uma conexão com o mysql
- No pacote com.digitalinnovationone.springbootconfig, criou um pacote config e uma java class DBConfiguration

## Passo 3
- Adicione a dependência do lombok no pom.xml para configurar o getter e o setter <br>

## Passo 4
- No arquivo application.properties adicionou um código <br>
- Dentro da pasta config, criou um java class AppController <br>

## Projeto 2 Spring Boot
- Migrar app.properties do profile dev para YML <br>
- Executar o projeto pelo terminal <br>

## Passo 1 
- Renomeie o application-dev.properties para application-dev.yml <br>
- Adicione o código dentro: <br>

app: <br>
ㅤmessage: This is the property file to the ${spring.application.name} <br>

spring: <br>
ㅤdatasource: <br>
ㅤdriver-class-name: org.h2.Driver <br>
ㅤurl: jdbc:h2:mem:db;DB_CLOSE_DELAY=-1 <br>
ㅤusername: sa <br>
ㅤpassword: sa <br>

- No application.properties, deixe como dev: <br>
spring.profiles.active=dev <br>
- No terminal execute: mvn spring-boot:run <br>
- No seu navegador digite: localhost:8080 <br>

## Uso de command line
- Propriedades do arquivo de configuração na linha de comando <br>
- Sobrescreve as propriedades definidas no arquivo de configurações padrão <br>
- Valores passados como argumento na execução do projeto <br>

## Exercício 3 
- Passar como argumento a propriedade server.port=8085
- Executar o projeto no terminal com o argumento 
- Abrir o browser no endereço localhost:8085

## Passo 1 
- No application-prod.properties adicionou o código: server.port=8080 <br>
- No application.properties deixou em produção: spring.profiles.active=prod <br>
- No terminal digite: mvn spring-boot:run -Dserver.port=8085 <br>
- No navegador digite: localhost8085 <br>

## Variáveis de ambiente 
- Pode ser injetada através da anotação: @Value <br>
- Injeção com anotação @Value({NOME_VARIAVEL}) <br>
- Definição de valor default quando não há variável <br>

## Exercício 4
- Injetar a variável com o @Value em AppController <br>
- Definição de valor default junto com a anotação @Value <br>
- Criar método para chamada de novo método e exibir o valor <br>
- Executar projeto no terminal e exibir no browser <br>

## Passo 1 
- As variáveis de ambiente foram definidas no AppController.java <br>
- No terminal exporte o valor da variável: export ENV_DB_URL=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1
