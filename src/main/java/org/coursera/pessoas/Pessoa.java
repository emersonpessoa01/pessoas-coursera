package org.coursera.pessoas;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	private Date dataDeNascimento;
	private Relogio relogio;

	public Pessoa(Date dataDeNascimento, Relogio relogio) {
		this.dataDeNascimento = dataDeNascimento;
		this.relogio = relogio;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.setTime(this.dataDeNascimento);

		Calendar hoje = Calendar.getInstance();
		hoje.setTimeInMillis(relogio.agora());

		int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
		if (hoje.get(Calendar.MONTH) < dataNasc.get(Calendar.MONTH) ||
				(hoje.get(Calendar.MONTH) == dataNasc.get(Calendar.MONTH)
						&& hoje.get(Calendar.DAY_OF_MONTH) < dataNasc.get(Calendar.DAY_OF_MONTH))) {
			idade--;
		}
		return idade;
	}

	public String getSigno() {
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.setTime(this.dataDeNascimento);
		int dia = dataNasc.get(Calendar.DAY_OF_MONTH);
		int mes = dataNasc.get(Calendar.MONTH) + 1;

		if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4))
			return "Áries";
		if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5))
			return "Touro";
		if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6))
			return "Gêmeos";
		if ((dia >= 21 && mes == 6) || (dia <= 21 && mes == 7))
			return "Câncer";
		if ((dia >= 22 && mes == 7) || (dia <= 22 && mes == 8))
			return "Leão";
		if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9))
			return "Virgem";
		if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10))
			return "Libra";
		if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12))
			return "Sagitário";
		if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1))
			return "Capricórnio";
		if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11))
			return "Escorpião";
		if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2))
			return "Aquário";
		if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3))
			return "Peixes";

		return "Desconhecido";
	}
}
