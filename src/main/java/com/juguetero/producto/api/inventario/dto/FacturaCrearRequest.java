package com.juguetero.producto.api.inventario.dto;

public class FacturaCrearRequest {

	private String nombreProveedor;
	private String fecha;
	private String nroPedido;

	public FacturaCrearRequest() {
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(String nroPedido) {
		this.nroPedido = nroPedido;
	}

}
