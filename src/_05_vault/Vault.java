package _05_vault;
import java.util.Random;

public class Vault {
int code;

Vault(){
	Random ran=new Random();
	code=ran.nextInt(1000);
}	
boolean tryCode(int guess) {
	if(guess==code) {
		return true;
	}else {
		return false;
	}
}
}
