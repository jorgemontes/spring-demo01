import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/bean.xml");
		Person person1 = (Person) context.getBean("person");
		
		Person person2 = (Person) context.getBean("person");

		person1.setTaxId(555);
		
		System.out.println(person2);
		Address address = (Address)context.getBean("address");
		System.out.println(address);
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
