package other;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	
	/*
	 * 傳入要加密的字串(使用sha-512加密），返回SHA-512字串
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
				// SHA加密開始
				// 創建加密對象 並傳入加密類型
				MessageDigest messageDigest = MessageDigest.getInstance(strType);
				// 傳入要加密的字串
				messageDigest.update(strText.getBytes());
				// 得到加密後的byte類型結果
				byte byteBuffer[] = messageDigest.digest();
				
				// 將byte轉換為 string
				StringBuffer strHexString = new StringBuffer();
				for (int i = 0; i < byteBuffer.length; i++){
					String hex = Integer.toHexString(0xff & byteBuffer[i]);
					if (hex.length() == 1){
						strHexString.append('0');
					}
					strHexString.append(hex);
				}
				// 得到返回結果
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
