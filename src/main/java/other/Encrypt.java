package other;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	
	/*
	 * �ǤJ�n�[�K���r��(�ϥ�sha-256�[�K�^�A��^SHA-256�r��
	 */
	public String SHA256(final String strText){
		return SHA(strText, "SHA-256");
	}
	
	public String SHA512(final String strText){
		return SHA(strText, "SHA-512");
	}
	
	private String SHA(final String strText, final String strType){
		String strResult = null;
		
		if (strText != null && strText.length() > 0){
			
			try{
				// SHA�[�K�}�l
				// �Ыإ[�K��H �öǤJ�[�K����
				MessageDigest messageDigest = MessageDigest.getInstance(strType);
				// �ǤJ�n�[�K���r��
				messageDigest.update(strText.getBytes());
				// �o��[�K�᪺byte�������G
				byte byteBuffer[] = messageDigest.digest();
				
				// �Nbyte�ഫ�� string
				StringBuffer strHexString = new StringBuffer();
				for (int i = 0; i < byteBuffer.length; i++){
					String hex = Integer.toHexString(0xff & byteBuffer[i]);
					if (hex.length() == 1){
						strHexString.append('0');
					}
					strHexString.append(hex);
				}
				// �o���^���G
				strResult = strHexString.toString();
			}catch (NoSuchAlgorithmException e){
				e.printStackTrace();
			}
		}
		return strResult;
	}

	public static void main(String[] args) {
		Encrypt encrypt = new Encrypt();
		
		System.out.println("orgin password: "+"sha8233");
		System.out.println("SHA-256 encrypt: "+encrypt.SHA256("sha8233"));
		System.out.println("SHA-512 encrypt: "+encrypt.SHA512("sha8233"));
	}

}
