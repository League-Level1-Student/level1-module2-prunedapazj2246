package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smurf ps= new Smurf("Papa");
Smurf hs = new Smurf("Handy");
Smurf s = new Smurf("Smurfette");
System.out.println(hs.getName());
hs.eat();
System.out.println(ps.getName());
System.out.println("I have a " + ps.getHatColor() + " hat.");
System.out.println("I am a " + ps.isGirlOrBoy() + ".");
System.out.println( s.getName());
System.out.println("I have  a " + s.getHatColor()+" hat.");
System.out.println("I am a " + s.isGirlOrBoy() + ".");
}

}
