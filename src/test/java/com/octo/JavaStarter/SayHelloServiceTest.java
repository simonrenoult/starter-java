package com.octo.JavaStarter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SayHelloServiceTest {

	@Test
	void sayHelloTo_ReturnsHelloToSomeone() {
		// Given
		SayHelloService service = new SayHelloService();
		String someone = "Simon";

		// When
		String result = service.sayHelloTo(someone);

		// Then
		Assertions.assertEquals("Hello Simon", result);
	}

}
