package _04_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TeaBag g = new TeaBag("green");
TeaBag m = new TeaBag("mint");
TeaBag c = new TeaBag("chamomile");
TeaBag pf = new TeaBag("passion fruit");
Kettle k = new Kettle();
Water w = new Water();
Cup cup = new Cup();
System.out.println("I will drink " + pf.getFlavor() + " tea.");
k.getWater();
k.boil();
	}

}
