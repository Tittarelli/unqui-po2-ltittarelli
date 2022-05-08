package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<SolicitudDeCredito> solicitudes = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();

	public void altaDeCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}

	public double totalADesembolsar() {
		return solicitudes.stream().filter(SolicitudDeCredito::esAceptable).mapToDouble(SolicitudDeCredito::monto).sum();
	}

}
