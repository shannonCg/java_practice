package password;


import java.security.SecureRandom;

public class RandomString {
	private static final String num = "0123456789";
	
	private static final String uppercaseAlpha = "QAZWSXEDCRFVTGBYHNUJMIKOLP";
	
	private static final String lowercaseAlpha = "qazwsxedcrfvtgbyhnujmikolp";
	
	private static SecureRandom random = new SecureRandom();
	
	protected String get(int length, String text){
		if(length < 0){
			throw new IllegalArgumentException();
		}
		StringBuilder builder = new StringBuilder(length);
		for(int i = 0; i < length; i++){
			builder.append(text.charAt(random.nextInt(text.length())));
		}
		return builder.toString();
	}
	
	public String getAlphaNum(int length){
		return get(length, num+uppercaseAlpha+lowercaseAlpha);
	}
	
	public String getNum(int length){
		return get(length, num);
	}
}
