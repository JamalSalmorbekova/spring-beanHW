package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld hello1 =
                (HelloWorld)  applicationContext.getBean("helloworld");
        System.out.println(hello1.getMessage());
        HelloWorld hello2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        hello2.setMessage("Privet");
        System.out.println(hello2.getMessage());
        System.out.println(hello1.getMessage());

        System.out.println(hello1==hello2);



        Cat bean1 =
                (Cat) applicationContext.getBean("Myshyk");
        System.out.println(bean1.getColor());

        Cat bean2 =
                (Cat) applicationContext.getBean("Myshyk");
        System.out.println(bean2.getColor());
        Cat bean3 =
                (Cat) applicationContext.getBean("Myshyk");
        System.out.println(bean3.getColor());

        System.out.println(bean2 == bean3);

    }
}
