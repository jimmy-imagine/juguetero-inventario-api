package com.juguetero.producto.api.inventario.dto;

import java.util.List;

import com.juguetero.producto.inventario.dto.ProductoPorReferenciaDto;

public class ProductosPorReferenciaResponseDto {

	private OperationResultDto operationResultDto;
	private List<ProductoPorReferenciaDto> productosPorReferencia;

	public ProductosPorReferenciaResponseDto() {
	}

	public ProductosPorReferenciaResponseDto(OperationResultDto operationResultDto,
			List<ProductoPorReferenciaDto> productosPorReferencia) {
		super();
		this.operationResultDto = operationResultDto;
		this.productosPorReferencia = productosPorReferencia;
	}

	public OperationResultDto getOperationResultDto() {
		return operationResultDto;
	}

	public void setOperationResultDto(OperationResultDto operationResultDto) {
		this.operationResultDto = operationResultDto;
	}

	public List<ProductoPorReferenciaDto> getProductosPorReferencia() {
		return productosPorReferencia;
	}

	public void setProductosPorReferencia(List<ProductoPorReferenciaDto> productosPorReferencia) {
		this.productosPorReferencia = productosPorReferencia;
	}

}
