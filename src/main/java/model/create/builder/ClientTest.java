package model.create.builder;

public class ClientTest {
	public static void main(String[] args) {
		PersonBuilder builder=new ManBuilder();
		Director director=new Director(builder);
		director.construct();
		builder.getMan();
	}
}
