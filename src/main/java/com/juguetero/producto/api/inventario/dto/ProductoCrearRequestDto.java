package com.juguetero.producto.api.inventario.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductoCrearRequestDto {

	@NotBlank
	@NotNull(message = "campo obligatorio")
	private String nombre;

	@NotBlank
	@NotNull(message = "campo obligatorio")
	private String referencia;

	public ProductoCrearRequestDto() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

}
