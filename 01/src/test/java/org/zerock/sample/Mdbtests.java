package org.zerock.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import org.apache.log4j.Logger;
import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class Mdbtests {
//	private static final Logger log = Logger.getLogger(Mdbtests.class);
	
	String url = "jdbc:mariadb://localhost:3306/tt?user=root&password=1234";

	@Test
	public void connectionTest() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			log.info("### connection : " + connection + " - 연결 성공 ####");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
