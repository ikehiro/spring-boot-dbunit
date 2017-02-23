package project.kage.example.spring.dbunit.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import project.kage.example.spring.dbunit.TestConfiguration;
import project.kage.example.spring.dbunit.repository.OrderRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { TestConfiguration.class })
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@PropertySource(value = { "test.properties" })
public class DatabaseServiceImplTest {

	@Autowired
	private DatabaseServiceImpl sut;

	@Test
	public void testFindAll() {
		Iterable<Object> actual = sut.findAll(OrderRepository.class);

		actual.forEach(obj -> System.out.println("++++ " + ToStringBuilder.reflectionToString(obj)));
		assertThat(actual, not(nullValue()));

		long count = sut.count(OrderRepository.class);

		assertThat(count, not(0));
		assertThat(count, is(5l));
	}

	@Test
	public void testCount() {
		long count = sut.count(OrderRepository.class);

		assertThat(count, not(0));
		assertThat(count, is(5l));

	}

}
