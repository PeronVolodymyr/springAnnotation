package cfg;

import model.Food;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfig {
    @Bean(name = "breakfast")
    Food breakfast() {
        return new Food(1,"breakfast",30);
    }
    @Bean
    Food lunch(){
        return new Food(2,"lunch",40);
    }
}
