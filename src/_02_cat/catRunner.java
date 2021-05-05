package _02_cat;

public class catRunner {
public static void main(String[] args) {
	Cat cat=new Cat("Sammy");
	cat.meow();
	cat.printName();
	while(cat.getLives()>0) {
		cat.kill();
	}
	
}
}
