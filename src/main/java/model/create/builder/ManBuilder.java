package model.create.builder;

public class ManBuilder implements PersonBuilder {

	@Override
	public void buildheader() {
		System.out.println("Build header");
	}

	@Override
	public void buildbody() {
		System.out.println("Build body");
	}

	@Override
	public void buildfoot() {
		System.out.println("Build foot");
	}
	@Override
	public Man getMan() {
		return new Man();
	}
}
