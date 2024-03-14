package bean;

public class Transaccion {
	String id, rutCliente,  idCuenta, montoTransferencia, cuentaTransferencia, tipoCuenta, tipoBanco;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getMontoTransferencia() {
		return montoTransferencia;
	}

	public void setMontoTransferencia(String montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}

	public String getCuentaTransferencia() {
		return cuentaTransferencia;
	}

	public void setCuentaTransferencia(String cuentaTransferencia) {
		this.cuentaTransferencia = cuentaTransferencia;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getTipoBanco() {
		return tipoBanco;
	}

	public void setTipoBanco(String tipoBanco) {
		this.tipoBanco = tipoBanco;
	}

	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", rutCliente=" + rutCliente + ", idCuenta=" + idCuenta
				+ ", montoTransferencia=" + montoTransferencia + ", cuentaTransferencia=" + cuentaTransferencia
				+ ", tipoCuenta=" + tipoCuenta + ", tipoBanco=" + tipoBanco + "]";
	}

}
