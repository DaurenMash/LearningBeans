import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanUno  =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanUno.getMessage());

        Cat koshka = (Cat) applicationContext.getBean("cat");
        System.out.println(koshka.getName());

        Cat koshkaUno = (Cat) applicationContext.getBean("cat");
        System.out.println(koshkaUno.getName());

        System.out.println(bean == beanUno);
        System.out.println(koshka == koshkaUno);
    }
}