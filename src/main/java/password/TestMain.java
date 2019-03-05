package password;

import java.util.Calendar;

public class TestMain {

	public static void main(String[] args) {
		String password = new RandomString().getAlphaNum(5);
		System.out.println("password="+password);
		String sha_password = Password.generate(password, Calendar.getInstance().getTime());
		System.out.println("sha_password="+sha_password+", length="+sha_password.length());
	}

}
