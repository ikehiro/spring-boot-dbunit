package project.kage.example.spring.dbunit.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.sql.Timestamp;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;

import project.kage.example.spring.dbunit.DbUnitTestConfiguration;
import project.kage.example.spring.dbunit.model.dto.Order;
import project.kage.example.spring.dbunit.repository.OrderRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { DbUnitTestConfiguration.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class DatabaseServiceImplDbUnitTest {

	@Autowired
	private DatabaseServiceImpl sut;

	@Test
	@DatabaseSetup("OrderSnake01.xml")
	public void testFindAll() {
		Iterable<Object> actual = sut.findAll(OrderRepository.class);

		actual.forEach(obj -> System.out.println("++++ " + ToStringBuilder.reflectionToString(obj)));
		assertThat(actual, not(nullValue()));

		long count = sut.count(OrderRepository.class);

		assertThat(count, not(0));
		assertThat(count, is(5l));
	}

	@Test
	@DatabaseSetup("OrderNonIdSnake02.xml")
	public void testCount() {
		long count = sut.count(OrderRepository.class);

		assertThat(count, not(0));
		assertThat(count, is(3l));

	}

	@Test
	@DatabaseSetup("OrderSnake01.xml")
	@ExpectedDatabase("ExpectedOrder.xml")
	public void testSave() {
		Iterable<Object> actual = sut.findAll(OrderRepository.class);

		actual.forEach(obj -> System.out.println("++++ " + ToStringBuilder.reflectionToString(obj)));

		Order order = new Order();
		order.setOrderId(100L);
		order.setCompanyCode("C001");
		order.setOrderInfomation("C001-001");
		order.setCreateUserId("USER0001");
		order.setCreateDateTime(Timestamp.valueOf("1900-01-01 00:00:00.000000"));
		order.setUpdateUserId("UPD-USER");
		order.setUpdateDateTime(Timestamp.valueOf("9999-12-31 23:59:59.999999"));
		order.setVersionNumber(999);
		order.setLogicalDeleteFlag(true);
		Order result = sut.save(OrderRepository.class, order);

		System.out.println("++++ " + ToStringBuilder.reflectionToString(result));
		assertThat(result, not(nullValue()));

	}

}
