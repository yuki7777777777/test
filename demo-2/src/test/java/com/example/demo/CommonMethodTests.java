package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class CommonMethodTests {

	@Test
	void CommonMethod() {

		String a = "500";
		String rtn = CommonMethod.keisan(a);
		assertThat(rtn, equalTo("1500"));

	}

}
