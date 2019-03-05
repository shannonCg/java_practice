package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * 在Java中可以使用Properties類別來讀取設定檔，如下面程式要讀config.properties的檔案，而檔案內容如下：
 * 	localhost=jdbc:mysql://localhost/db
 *  username=user
 *  password=1234567
 */
public class TestProperties {

	public static void main(String[] args) {
		Properties properties = new Properties();
		String configFile = "bin/properties/config.properties";
		
		try {
			properties.load(new FileInputStream(configFile));
		} catch(FileNotFoundException ex){
			ex.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		String host = properties.getProperty("localhost");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String port = properties.getProperty("port", "8080");
		
		System.out.println("host: "+host);
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		System.out.println("port: "+port);
	}

}
