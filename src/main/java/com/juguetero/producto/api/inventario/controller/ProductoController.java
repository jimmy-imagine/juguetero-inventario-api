package com.juguetero.producto.api.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juguetero.producto.api.inventario.dto.ProductosPorReferenciaResponseDto;
import com.juguetero.producto.inventario.dto.ProductoPorReferenciaDto;
import com.juguetero.producto.inventario.service.IProductoService;

@RequestMapping("v1/producto")
@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@GetMapping(path = "{referencia}")
	public ResponseEntity<ProductosPorReferenciaResponseDto> obtenerProductos(@PathVariable String referencia) {

		ProductosPorReferenciaResponseDto response = new ProductosPorReferenciaResponseDto();
		List<ProductoPorReferenciaDto> productosResp = productoService.consultarProductosPorReferencia(referencia);
		response.setProductosPorReferencia(productosResp);

		return ResponseEntity.ok(response);
	}

}
