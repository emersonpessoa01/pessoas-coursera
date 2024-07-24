package org.coursera.pessoas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class PessoaTest {

	@Test
	public void testGetIdadeWithFixedTime() {
		Calendar cal = new GregorianCalendar(1990, Calendar.JANUARY, 1);
		Relogio relogio = new Relogio();
		relogio.setFixedTime(new GregorianCalendar(2024, Calendar.JULY, 23).getTimeInMillis());
		Pessoa pessoa = new Pessoa(cal.getTime(), relogio);
		assertEquals(34, pessoa.getIdade());
	}

	@Test
	public void testGetSigno() {
		Calendar cal = new GregorianCalendar(1990, Calendar.JANUARY, 1);
		Relogio relogio = new Relogio();
		Pessoa pessoa = new Pessoa(cal.getTime(), relogio);
		Assert.assertEquals("Capricórnio", pessoa.getSigno());
	}

	@Test
	public void testGetIdadeDifferentDateWithFixedTime() {
		Calendar cal = new GregorianCalendar(2000, Calendar.DECEMBER, 15);
		Relogio relogio = new Relogio();
		relogio.setFixedTime(new GregorianCalendar(2024, Calendar.JULY, 23).getTimeInMillis());
		Pessoa pessoa = new Pessoa(cal.getTime(), relogio);
		assertEquals(23, pessoa.getIdade());
	}

	@Test
	public void testGetSignoDifferentDate() {
		Calendar cal = new GregorianCalendar(2000, Calendar.DECEMBER, 15);
		Relogio relogio = new Relogio();
		Pessoa pessoa = new Pessoa(cal.getTime(), relogio);
		Assert.assertEquals("Sagitário", pessoa.getSigno());
	}

	@Test
	public void testGetSignoAnotherDate() {
		Calendar cal = new GregorianCalendar(1985, Calendar.JUNE, 10);
		Relogio relogio = new Relogio();
		Pessoa pessoa = new Pessoa(cal.getTime(), relogio);
		Assert.assertEquals("Gêmeos", pessoa.getSigno());
	}
}
