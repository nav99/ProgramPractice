package com.test.designPattern;

interface ParleG {
	void biscuit();
}

class Cream implements ParleG {

	@Override
	public void biscuit() {
		System.out.println("Cream Biscuit");
	}
}

class Namkeen implements ParleG {

	@Override
	public void biscuit() {
		System.out.println("Namkeen Biscuit");
	}
}

class Jam implements ParleG {

	@Override
	public void biscuit() {
		System.out.println("Jam Biscuit");
	}
}

class ParlegFactory {

	// use getShape method to get object of type shape
	public ParleG getBiscuit(String biscuitType) {
		if (biscuitType == null) {
			return null;
		}
		if (biscuitType.equalsIgnoreCase("Jam")) {
			return new Jam();

		} else if (biscuitType.equalsIgnoreCase("Namkeen")) {
			return new Namkeen();

		} else if (biscuitType.equalsIgnoreCase("Cream")) {
			return new Cream();
		}

		return null;
	}
}

public class FactoryPattern {
	public static void main(String[] args) {
		ParlegFactory parleFactory = new ParlegFactory();

		ParleG biscuit1 = parleFactory.getBiscuit("Cream");
		biscuit1.biscuit();
		ParleG biscuit2 = parleFactory.getBiscuit("Namkeen");
		biscuit2.biscuit();
		ParleG buscuit3 = parleFactory.getBiscuit("Jam");
		buscuit3.biscuit();
		

	}

}
