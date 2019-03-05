package password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	
	/*
	 * �ǤJ�n�[�K���r��(�ϥ�sha-512�[�K�^�A��^SHA-512�r��
	 */
	public String encrypt_sha512(final String strText){
		return encrypt(strText, EncryptType.SHA512);
	}
	
	protected String encrypt(final String strText, final EncryptType strType){
		String strResult = null;
		
		if (strText != null && strText.length() > 0){
			
			try{
				// SHA�[�K�}�l
				// �Ыإ[�K��H �öǤJ�[�K����
				MessageDigest messageDigest = MessageDigest.getInstance(strType.getValue());
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
}
