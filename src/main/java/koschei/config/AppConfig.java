package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public Rabbit4 getRabbit(){
        return  new Rabbit4();
    }
    @Bean
    public Wood3 getWood(Rabbit4 rabbit4){
        return  new Wood3(rabbit4);
    }
    @Bean
    public Duck5 getDuck(){
        return new Duck5();
    }
    @Bean
    public Egg6 getEgg(){
        return new Egg6();
    }
    @Bean
    public Needle7 getNeedle(){
        return new Needle7();
    }

}
