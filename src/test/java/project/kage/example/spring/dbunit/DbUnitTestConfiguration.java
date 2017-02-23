package project.kage.example.spring.dbunit;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author papa
 *
 */
@Configuration
@ComponentScan("project.kage.example.spring.dbunit")
public class DbUnitTestConfiguration {

	private static final String URL = "jdbc:mysql://localhost/springdb?useSSL=false";
	private static final String USERNAME = "spring";
	private static final String PASSWORD = "password";

	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource(URL, USERNAME, PASSWORD);
	}
}
