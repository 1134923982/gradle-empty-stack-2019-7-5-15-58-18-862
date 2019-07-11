public class AndriodMobile extends Mobile{
	public AndriodMobile(String name, String color, String brand){
		super(name, color, brand);
	}
	public void call(String message) {
		System.out.println("<iPhone>Message : ["+message+"]");
	}
}
