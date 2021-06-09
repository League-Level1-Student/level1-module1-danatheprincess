package _05_vault;

public class Spy {
String name;
	Spy(String name){
		this.name=name;
	}

int findCode(Vault george){
	for(int i=0;i<=1000;i++) {
		boolean isOpen=george.tryCode(i);
		if(isOpen) {
			return i;
		}	
			
	}
	return -1;
}
}