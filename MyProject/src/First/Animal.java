package First;

public abstract class Animal {
	public abstract void sound();
}

class Lion extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Roaarr!");	
	}
	
}

class Bird extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Pheawww!");	
	}
	
}

class Main {
	public static void main(String[] args) {
		Animal myBird = new Bird();
		myBird.sound();
		
		Animal myLion = new Lion();
		myLion.sound();
	}
}


