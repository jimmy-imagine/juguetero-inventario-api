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
	private String proveedor;

	@JsonProperty
	@NotBlank
	@NotNull(message = "campo obligatorio")
	private String numeroPedido;
	
	@JsonProperty
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT-05:00")
	@NotNull(message = "campo obligatorio")
	private Date fecha;

	public FacturaCrearRequestDto() {
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
