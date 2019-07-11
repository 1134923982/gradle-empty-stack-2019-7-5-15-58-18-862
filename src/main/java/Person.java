public class Person {
	private String name;
	private Mobile mobile;

	public Person(String name, Mobile mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public void sendMessage(String message){
		this.mobile.call(message);
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
}
