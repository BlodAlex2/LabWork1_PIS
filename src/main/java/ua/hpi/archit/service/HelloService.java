package ua.hpi.archit.service;

public class HelloService implements IHello {

	@Override
	public void sayHello() {
		System.out.println("Say Hello World");
	}

}
