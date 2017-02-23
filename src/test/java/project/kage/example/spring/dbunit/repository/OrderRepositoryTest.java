package project.kage.example.spring.dbunit.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import project.kage.example.spring.dbunit.TestConfiguration;

/**
 * @author papa
 *
 */
@RunWith(SpringRunner.class)
// @ContextConfiguration(classes = { SpringBootDbunitApplicationTests.class }​)
@ContextConfiguration(classes = { TestConfiguration.class })
public class OrderRepositoryTest {

	@Autowired
	private OrderRepository sut;

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#save(S)}.
	 */
	@Test
	public void testSaveS() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#save(java.lang.Iterable)}.
	 */
	@Test
	public void testSaveIterableOfS() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)}.
	 */
	@Test
	public void testFindOne() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#exists(java.io.Serializable)}.
	 */
	@Test
	public void testExists() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#findAll()}.
	 */
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#findAll(java.lang.Iterable)}.
	 */
	@Test
	public void testFindAllIterableOfID() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#count()}.
	 */
	@Test
	public void testCount() {
		long count = sut.count();

		assertThat(count, is(0L));
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#delete(java.io.Serializable)}.
	 */
	@Test
	public void testDeleteID() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#delete(java.lang.Object)}.
	 */
	@Test
	public void testDeleteT() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable)}.
	 */
	@Test
	public void testDeleteIterableOfQextendsT() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.springframework.data.repository.CrudRepository#deleteAll()}.
	 */
	@Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

}
