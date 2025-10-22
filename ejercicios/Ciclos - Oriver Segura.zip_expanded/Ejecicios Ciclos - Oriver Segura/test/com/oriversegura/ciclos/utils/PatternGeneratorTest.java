package com.oriversegura.ciclos.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PatternGeneratorTest {

	@Test
	@DisplayName("")
	void patronAjedrezTest1() {
		assertEquals("""
				*.*
				.*.
				*.*
				""", PatternGenerator.patronAjedrez(3));
	}

	@Test
	@DisplayName("")
	void patronAjedrezTest2() {
		assertEquals("""
				*.*.*.
				.*.*.*
				*.*.*.
				.*.*.*
				*.*.*.
				.*.*.*
				""", PatternGenerator.patronAjedrez(6));
	}
}
