/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'jorge' at '6/14/16 8:26 PM' with Gradle 2.11
 *
 * @author jorge, @date 6/14/16 8:26 PM
 */
public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void speak() {
		System.out.println("Hello!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

}
