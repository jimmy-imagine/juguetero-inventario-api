package com.juguetero.producto.api.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juguetero.producto.api.inventario.constants.InventarioConstants;
import com.juguetero.producto.api.inventario.dto.OperationResultDto;
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
		OperationResultDto result = new OperationResultDto();
		List<ProductoPorReferenciaDto> productosResp = productoService.consultarProductosPorReferencia(referencia);

		if (!productosResp.isEmpty()) {
			result = OperationResultDto.resultOk();
		} else {
			result.setCodigo(InventarioConstants.RESULT_CODE_NOT_FOUND_DATA);
			result.setMensaje(InventarioConstants.RESULT_MESSAGE_NOT_FOUND_DATA);
		}

		response.setProductosPorReferencia(productosResp);
		response.setOperationResultDto(result);

		return ResponseEntity.ok(response);
	}

}
