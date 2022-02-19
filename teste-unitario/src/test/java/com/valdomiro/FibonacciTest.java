package com.valdomiro;

public class FibonacciTest {

	private Fibonacci fibonacci;

	@Before
	public void init() {
		fibonacci = new Fibonacci();
	}

	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		// 1. Cen�rio
		long posicao = 1L;

		// 2. A��o
		long valor = fibonacci.calcular(posicao);

		// 3. Valida��o
		assertEquals(1L, valor);
	}

	@Test
	public void deve_retornar_fibonacci_posicao_2() {
		long posicao = 2L;

		long valor = fibonacci.calcular(posicao);

		assertEquals(1L, valor);
	}

	@Test
	public void deve_retornar_fibonacci_posicao_0() {
		long posicao = 0L;

		long valor = fibonacci.calcular(posicao);

		assertEquals(0L, valor);
	}

}
