import java.util.Random;

public class Vault {
int code;

Vault(){
	Random ran=new Random();
	code=ran.nextInt(1000);
}		
}
