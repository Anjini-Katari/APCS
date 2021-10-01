public class Greet2 {
	public static String greet(String name){
		String hello = "Why, hello there, " + name + ". How do you do?";
		return hello;
	}
	public static void main(String[] args){
                System.out.println(greet("Watson"));
		System.out.println(greet("Sherlock"))
		System.out.println(greet("Mrs. Hudson"))
	}
}
