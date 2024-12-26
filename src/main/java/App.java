import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworldBean");

        HelloWorld beanUno  =
                (HelloWorld) applicationContext.getBean("helloworldBean");

        Cat koshka = (Cat) applicationContext.getBean("catBean");

        Cat koshkaUno = (Cat) applicationContext.getBean("catBean");



        System.out.println(bean == beanUno);
        System.out.println(koshka == koshkaUno);
    }
}