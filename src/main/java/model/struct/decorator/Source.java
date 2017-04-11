package model.struct.decorator;

public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("This is original method!");
	}

}
