import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/bean.xml");
		Person person = (Person) context.getBean("person");
		person.speak();
		System.out.println(person);
		((ClassPathXmlApplicationContext) context).close();
	}

}
