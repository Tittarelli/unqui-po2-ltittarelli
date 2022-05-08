package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {

	protected int plazo;
	protected double montoSolicitado;
	protected Cliente solicitante;

	public SolicitudDeCredito(Cliente solicitante, double montoSolicitado, int plazo) {
		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
	}
	
	public double monto() {
		return montoSolicitado;
	}

	public double cuota() {
		return montoSolicitado / plazo;
	}

	protected boolean laCuotaEsMenorAl(int porcentaje) {
		return solicitante.sueldoNeto() >= this.cuota() + this.cuota() * (porcentaje / 100);
	}

	public abstract boolean esAceptable();

}
