import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat beanCatOne = applicationContext.getBean("cat",Cat.class);
        Cat beanCatTwo = applicationContext.getBean("cat",Cat.class);

        System.out.println(bean == beanHelloWorld);
        System.out.println(beanCatOne == beanCatTwo);

        System.out.println(bean.getMessage());
    }
}