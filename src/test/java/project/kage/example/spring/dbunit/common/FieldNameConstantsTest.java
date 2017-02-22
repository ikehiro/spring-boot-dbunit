package project.kage.example.spring.dbunit.common;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FieldNameConstantsTest {

	@Test
	public void testGetMeta() {
		Meta actual = FieldNameConstants.getMeta("注文ID");

		System.out.println("++++ name -> [" + actual.name + "]");
		assertThat(actual, not(nullValue()));
		assertThat(actual.length, is(10));
	}

}
