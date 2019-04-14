package Workflow de Projeto.Visão Global;

import Workflow de Requisitos.Modelo de objeto de Negócio.Livro;
import Workflow Análise.Classes de Análise.Pagar Multa.Cliente;
import Workflow Análise.Classes de Análise.Reservar Exemplar.Reserva;
import Workflow de Requisitos.Modelo de casos de uso.Diagrama de movimentação.Cliente;

public class Reserva {

	private Livro livro;

	private Cliente cliente;

	private int codigoReserva;

	private ControlReserva controlReserva;

	private ControlReserva controlReserva;

	private ControlReserva controlReserva;

	public boolean validarReserva(Reserva reserva) {
		return false;
	}

	public boolean confirmarReserva(Cliente cliente, Filme livro) {
		return false;
	}

	public void setLivro(Livro livro) {

	}

	public Livro getLivro() {
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
