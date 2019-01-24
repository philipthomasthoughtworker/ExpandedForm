package com.Kata.ExpandedForm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExpandedFormApplicationTests {

	@Test
	public void testSomething() {
		assertEquals("10 + 2", ExpandedFormApplication.expandedForm(12));
		assertEquals("40 + 2", ExpandedFormApplication.expandedForm(42));
		assertEquals("70000 + 300 + 4", ExpandedFormApplication.expandedForm(70304));
	}

	@Test
	public void sdfsf() {
		assertEquals("10 + 2", ExpandedFormApplication.expandedForm(12));
	}

}
