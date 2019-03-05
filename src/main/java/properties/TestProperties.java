package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * �bJava���i�H�ϥ�Properties���O��Ū���]�w�ɡA�p�U���{���nŪconfig.properties���ɮסA���ɮפ��e�p�U�G
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
