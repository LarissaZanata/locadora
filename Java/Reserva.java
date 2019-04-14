package Workflow de Projeto.Visão Global;

import Workflow Análise.Classes de Análise.Pagar Multa.Cliente;
import Workflow Análise.Classes de Análise.Reservar Exemplar.Reserva;
import Workflow de Requisitos.Modelo de casos de uso.Diagrama de movimentação.Cliente;

public class Reserva {

	private Filme filme;

	private Cliente cliente;

	private int codigoReserva;

	public boolean validarReserva(Reserva reserva) {
		return false;
	}

	public boolean confirmarReserva(Cliente cliente, Filme filme) {
		return false;
	}

	public void setFilme(Filme filme) {

	}

	public Filme getFilme() {
		return null;
	}

	public void setCliente(Cliente cliente) {

	}

	public Cliente getCliente() {
		return null;
	}

	public void setCodigoReserva(int codigoReserva) {

	}

	public int getCodigoReserva() {
		return 0;
	}

	public void Reserva() {

	}

	public void enviarEmail(String email) {

	}

}
