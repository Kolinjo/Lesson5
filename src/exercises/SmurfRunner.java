package exercises;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf littleSmurf = new Smurf("Handy");
		System.out.println(littleSmurf.getName());
		littleSmurf.eat();
		
		Smurf oldSmurf = new Smurf ("Papa");
		System.out.println(oldSmurf.getName());
		System.out.println(oldSmurf.getHatColor());
		System.out.println(oldSmurf.isGirlOrBoy());

		Smurf femaleSmurf = new Smurf("Smurfette");
		System.out.println(femaleSmurf.getName());
		System.out.println(femaleSmurf.getHatColor());
		System.out.println(femaleSmurf.isGirlOrBoy());
	}

}
