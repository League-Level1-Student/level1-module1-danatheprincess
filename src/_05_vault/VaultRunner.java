package _05_vault;
import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	Vault juan=new Vault();
	Spy robert=new Spy("victor");
	int code=robert.findCode(juan);
	if(code==-1) {
		JOptionPane.showMessageDialog(null,"Robert fail");
	}else {
		System.out.println(code+ " Robert succeeded");
	}
	
	
}
}
