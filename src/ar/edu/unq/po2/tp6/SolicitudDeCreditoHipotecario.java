package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private Propiedad propiedadEnGarantia;

	public SolicitudDeCreditoHipotecario(Cliente solicitante, double montoSolicitado, int plazo, Propiedad propiedadEnGarantia) {
		super(solicitante, montoSolicitado, plazo);
		this.propiedadEnGarantia = propiedadEnGarantia;
	}

	@Override
	public boolean esAceptable() {
		return solicitante.menorA65En(plazo) && laCuotaEsMenorAl(50) && montoSolicitado <= propiedadEnGarantia.valorFiscal() * 0.7;
	}

}
