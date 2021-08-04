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

## Uso de command line
- Propriedades do arquivo de configuração na linha de comando. <br>
- Sobrescreve as propriedades definidas no arquivo de configurações padrão. <br>
- Valores passados como argumento na execução do projeto. <br>

## Variáveis de ambiente 
- Pode ser injetada através da anotação: @Value. <br>
- Injeção com anotação @Value({NOME_VARIAVEL}). <br>
- Definição de valor default quando não há variável. <br>

## Sobre a Autora
Oi, eu sou a Fernanda! Estou aqui para contribuir com meu conhecimento e espero poder ajudar no desenvolvimento profissional de cada um de vocês.

[![Linkedin Badge](https://img.shields.io/badge/-Fernanda_Maki_Hirose-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/fernanda-maki-hirose-801117208/)](https://www.linkedin.com/in/fernanda-maki-hirose-801117208/)  [![Gmail Badge](https://img.shields.io/badge/-femahi2020@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:femahi2020@gmail.com)](mailto:femahi2020@gmail.com)
