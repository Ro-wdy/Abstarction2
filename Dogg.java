abstract class Dogg {
	public void bark() {
		System.out.println("Bark");
}
       public abstract void poop();
}
class Chihuahua extends Dogg{
	public void poop() {
		System.out.println("Dog pooped");
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Chihuahua c = new Chihuahua();
		    c.bark();
		    c.poop();

	}

}
