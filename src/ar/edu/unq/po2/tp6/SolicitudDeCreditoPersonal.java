package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(Cliente solicitante, double montoSolicitado, int plazo) {
		super(solicitante, montoSolicitado, plazo);
	}

	@Override
	public boolean esAceptable() {
		return solicitante.sueldoNetoAnual() > 15000 && laCuotaEsMenorAl(70);
	}

}
