package org.tnsif.statickeyword;

public class Tiger extends Animal {
	void eat()
	{
		System.out.println("Eating:child");
	}
	static void run()
	{
		//we can't override static method
		//super.run();
		System.out.println("Running :child");
	}

}
