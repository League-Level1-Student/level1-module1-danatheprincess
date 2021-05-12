package _04_popcorn;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn pop=new Popcorn("caramel");
	Microwave micro=new Microwave();
	micro.putInMicrowave(pop);
	micro.setTime(2);
	micro.startMicrowave();
}
}
