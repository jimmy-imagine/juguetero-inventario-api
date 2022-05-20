package com.juguetero.producto.api.inventario.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FacturaCrearRequestDto {

	@JsonProperty
	@NotBlank
	@NotNull(message = "campo obligatorio")
	private String nombreProveedor;

	@JsonProperty
	@NotBlank
	@NotNull(message = "campo obligatorio")
	private String nroPedido;
	
	@JsonProperty
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT-05:00")
	@NotNull(message = "campo obligatorio")
	private Date fecha;

	public FacturaCrearRequestDto() {
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(String nroPedido) {
		this.nroPedido = nroPedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
