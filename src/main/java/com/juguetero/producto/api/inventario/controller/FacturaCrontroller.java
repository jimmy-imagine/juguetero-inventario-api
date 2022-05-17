package com.juguetero.producto.api.inventario.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juguetero.producto.api.inventario.dto.FacturaCrearRequest;
import com.juguetero.producto.inventario.dto.PedidoDto;
import com.juguetero.producto.inventario.service.IFacturaService;

@RequestMapping("v1/factura")
@RestController
public class FacturaCrontroller {

	@Autowired
	private IFacturaService facturaService;

	@PostMapping
	public ResponseEntity<PedidoDto> crearFactura(@Valid @RequestBody FacturaCrearRequest request) {

		PedidoDto facturaReq = new PedidoDto();
		facturaReq.setFecha(request.getFecha());
		facturaReq.setNumeroPedido(request.getNroPedido());
		facturaReq.setProveedor(request.getNombreProveedor());

		PedidoDto result = facturaService.crearFactura(facturaReq);

		return new ResponseEntity<PedidoDto>(result, HttpStatus.CREATED);

	}

}
