package password;

import java.util.Date;

public class Password {
	public static String generate(String password, Date createDate){
		Encrypt encrypt = new Encrypt();
		return encrypt.encrypt_sha512(password+createDate.getTime());
	}
}
