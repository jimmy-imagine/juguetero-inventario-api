package com.juguetero.producto.api.inventario.dto;

import com.juguetero.producto.inventario.dto.PedidoProductoDto;

public class FacturaCrearResponseDto {

	private OperationResultDto operationResultDto;
	private PedidoProductoDto factura;

	public FacturaCrearResponseDto() {
	}

	public OperationResultDto getOperationResultDto() {
		return operationResultDto;
	}

	public void setOperationResultDto(OperationResultDto operationResultDto) {
		this.operationResultDto = operationResultDto;
	}

	public PedidoProductoDto getFactura() {
		return factura;
	}

	public void setFactura(PedidoProductoDto factura) {
		this.factura = factura;
	}

}
