package com.juguetero.producto.api.inventario.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FacturaCrearRequest {

	@JsonProperty
	@NotNull(message = "campo obligatorio")
	private String nombreProveedor;

	@JsonProperty
	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT-05:00")
	@NotNull(message = "campo obligatorio")
	private Date fecha;

	@JsonProperty
	@NotNull(message = "campo obligatorio")
	private String nroPedido;

	public FacturaCrearRequest() {
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(String nroPedido) {
		this.nroPedido = nroPedido;
	}

}
