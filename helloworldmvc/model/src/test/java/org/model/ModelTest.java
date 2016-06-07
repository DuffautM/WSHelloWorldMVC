package org.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.model.Model;

public class ModelTest {
	
	Model model;

	@Before
	public void setUp() throws Exception {
		
		this.model = new Model();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHelloWorld() throws SQLException {
		assertEquals("Hello World!", this.model.getHelloWorld());
	}

}
