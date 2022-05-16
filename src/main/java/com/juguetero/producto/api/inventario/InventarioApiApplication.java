package com.juguetero.producto.api.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.juguetero.producto.inventario.InventarioCoreConfig;

@Import({ InventarioCoreConfig.class })
@SpringBootApplication
public class InventarioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApiApplication.class, args);
	}

}
