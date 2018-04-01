package cfg;

import model.Cham;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class ChamConfig {
    @Bean(name = "firstCham")
    Cham firstCham(){
        return new Cham(1,"one bed",true);
    }
    @Bean
    Cham secondCham(){
        return new Cham(2,"two bed",false);
    }
}
