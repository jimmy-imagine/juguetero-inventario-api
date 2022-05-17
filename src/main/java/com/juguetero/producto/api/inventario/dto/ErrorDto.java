package com.juguetero.producto.api.inventario.dto;

public class ErrorDto {

	private String codigo;
	private String mensaje;

	public ErrorDto() {
	}

	public ErrorDto(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
