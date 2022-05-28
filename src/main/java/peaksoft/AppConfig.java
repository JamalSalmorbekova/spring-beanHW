package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name="helloworld")
    @Scope("singleton")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name="Myshyk")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setNeme(" Arstan");
        cat.setColor("Targyl");
        cat.setAge(4);
        return cat;

    }

}
