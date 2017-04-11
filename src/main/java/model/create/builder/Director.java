package model.create.builder;

public class Director {
	private PersonBuilder builder;
	public Director(PersonBuilder builder) {
		this.builder=builder;
	}
	public void construct(){
		builder.buildheader();
		builder.buildbody();
		builder.buildfoot();
	}
}
