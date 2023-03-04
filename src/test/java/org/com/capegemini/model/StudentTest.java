package org.com.capegemini.model;

import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

class StudentTest {
   Student stud1;
   Student stud2;

   @BeforeEach
	public void setUp() throws Exception {
	   stud1=new Student(1001, "mohan", "math", 80);
	   stud2=new Student(1001, "mohan", "math", 80);
	}

	@AfterEach
	public	void tearDown() throws Exception {
	}

	@Test
	public	void test() {
		 Assertions.assertEquals(stud1.getRoll(), 1001);
		 Assertions.assertEquals(stud1, stud2);
	}

}
