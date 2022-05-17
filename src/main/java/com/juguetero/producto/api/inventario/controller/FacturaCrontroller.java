package com.juguetero.producto.api.inventario.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juguetero.producto.api.inventario.dto.AgregarProductoFacturaRequestDto;
import com.juguetero.producto.api.inventario.dto.FacturaCrearRequestDto;
import com.juguetero.producto.inventario.dto.PedidoDto;
import com.juguetero.producto.inventario.dto.PedidoProductoDto;
import com.juguetero.producto.inventario.service.IFacturaService;

@RequestMapping("v1/factura")
@RestController
public class FacturaCrontroller {

	@Autowired
	private IFacturaService facturaService;

	@PostMapping
	public ResponseEntity<PedidoDto> crearFactura(@Valid @RequestBody FacturaCrearRequestDto request) {

		PedidoDto facturaReq = new PedidoDto();
		facturaReq.setNumeroPedido(request.getNroPedido());
		facturaReq.setProveedor(request.getNombreProveedor());

		PedidoDto result = facturaService.crearFactura(facturaReq);

		return new ResponseEntity<PedidoDto>(result, HttpStatus.CREATED);

	}

	@PostMapping(path = "/producto")
	public ResponseEntity<PedidoProductoDto> agregarProductoAFactura(
			@Valid @RequestBody AgregarProductoFacturaRequestDto request) {

		PedidoProductoDto dto = new PedidoProductoDto();
		dto.setCantidad(request.getCantidad());
		dto.setPedidoId(request.getPedidoId());
		dto.setPorcIncremento(request.getPorcIncremento());
		dto.setPorcIva(request.getPorcIva());
		dto.setProductoId(request.getProductoId());
		dto.setValorSinIva(request.getValorSinIva());

		PedidoProductoDto result = facturaService.agregarProductoAFactura(dto);
		return new ResponseEntity<PedidoProductoDto>(result, HttpStatus.CREATED);
	}

	@GetMapping(path = "/todos")
	public ResponseEntity<List<PedidoDto>> todos() {
		List<PedidoDto> pedidos = facturaService.obtenerFacturas();
		return new ResponseEntity<List<PedidoDto>>(pedidos, HttpStatus.OK);
	}

}
