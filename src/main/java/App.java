import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        boolean ben = bean == bean1;
        System.out.println("Для пары HelloWorld: " + ben);

        Cat cat =
                (Cat) applicationContext.getBean("cat");

        Cat cat1 =
                (Cat) applicationContext.getBean("cat");

        boolean ben1 = cat == cat1;
        System.out.println("Для пары Cat: " + ben1);
    }
}