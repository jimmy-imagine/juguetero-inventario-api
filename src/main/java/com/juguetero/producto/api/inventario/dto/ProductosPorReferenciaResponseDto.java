package com.juguetero.producto.api.inventario.dto;

import java.util.List;

import com.juguetero.producto.inventario.dto.ProductoPorReferenciaDto;

public class ProductosPorReferenciaResponseDto {

	private List<ProductoPorReferenciaDto> productosPorReferencia;

	public ProductosPorReferenciaResponseDto() {
	}

	public List<ProductoPorReferenciaDto> getProductosPorReferencia() {
		return productosPorReferencia;
	}

	public void setProductosPorReferencia(List<ProductoPorReferenciaDto> productosPorReferencia) {
		this.productosPorReferencia = productosPorReferencia;
	}

}
