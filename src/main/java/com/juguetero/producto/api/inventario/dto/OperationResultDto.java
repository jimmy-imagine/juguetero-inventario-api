package com.juguetero.producto.api.inventario.dto;

import com.juguetero.producto.api.inventario.constants.InventarioConstants;

public class OperationResultDto {

	private Integer codigo;
	private String mensaje;

	public OperationResultDto() {
	}

	public OperationResultDto(Integer codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public static OperationResultDto resultOk() {
		return new OperationResultDto(InventarioConstants.RESULT_CODE, InventarioConstants.RESULT_MESSAGE);
	}

}
