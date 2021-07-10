package com.digitalinnovationone.springbootconfig.config;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// no momento que subir o projeto, o springboot vai ler vai ser o @Configuration, vai instanciar todas as configurações, vai pegar todos os prefixos iniciados com spring.datasource e as propriedades
// se o profile ativo é de desenvolvimento vai ler todas as propriedades do arquivo application-dev.properties, caso contrário vai mapear o application-prod.properties

@Configuration // indica que é um arquivo de configuração
@ConfigurationProperties("spring.datasource") // mapeia todas as propriedades iniciadas com spring
@Getter
@Setter
public class DBConfiguration {

    // mapeia as propriedades
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean // porque queremos mostrar todo o conteúdo sendo mapeado na subida do sistema
    // declara os métodos que vão fazer o mapeamento das propriedades para dentro do sistema
    public String testDatabaseConnection() {
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection() {
        System.out.println("DB connection for Production - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_PROD - Production instance";
    }
}
