package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.KoscheiTheDeathless;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Ocean1 getOcean(Island2 island2) {
        return new Ocean1(island2);
    }

    @Bean
    public static Island2 getIsland(Wood3 wood3) {
        return new Island2(wood3);
    }

    @Bean
    public static Wood3 getWood(Rabbit4 rabbit4) {
        return new Wood3(rabbit4);
    }

    @Bean
    public static Rabbit4 getRabbit(Duck5 duck5) {
        return new Rabbit4(duck5);
    }

    @Bean
    public static Duck5 getDuck(Egg6 egg6) {
        return new Duck5(egg6);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle7) {
        return new Egg6(needle7);
    }

    @Bean
    public static Deth8 getDeth(KoscheiTheDeathless koscheiTheDeathless) {
        return new Deth8(koscheiTheDeathless);
    }

}