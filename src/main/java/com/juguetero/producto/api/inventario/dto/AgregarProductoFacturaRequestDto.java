package com.juguetero.producto.api.inventario.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AgregarProductoFacturaRequestDto {

	@NotBlank
	@NotNull(message = "campo obligatorio")
	@Min(value = 1)
	private Integer pedidoId;

	@NotBlank
	@NotNull(message = "campo obligatorio")
	@Min(value = 1)
	private Integer productoId;

	@NotBlank
	@NotNull(message = "campo obligatorio")
	@Min(value = 1)
	private BigDecimal valorSinIva;

	@NotBlank
	@NotNull(message = "campo obligatorio")
	@Min(value = 1)
	private Integer cantidad;

	private BigDecimal porcIva;
	private BigDecimal porcIncremento;

	public AgregarProductoFacturaRequestDto() {
	}

	public Integer getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Integer pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public BigDecimal getValorSinIva() {
		return valorSinIva;
	}

	public void setValorSinIva(BigDecimal valorSinIva) {
		this.valorSinIva = valorSinIva;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPorcIva() {
		return porcIva;
	}

	public void setPorcIva(BigDecimal porcIva) {
		this.porcIva = porcIva;
	}

	public BigDecimal getPorcIncremento() {
		return porcIncremento;
	}

	public void setPorcIncremento(BigDecimal porcIncremento) {
		this.porcIncremento = porcIncremento;
	}

}
