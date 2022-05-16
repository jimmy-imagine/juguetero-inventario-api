package com.juguetero.producto.api.inventario;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ConexionBD {

	private final String databaseUrl;
	private final String databaseDriver;
	private final String databaseUserName;
	private final String databasePassword;

	public ConexionBD() {
		this.databaseUrl = "jdbc:mysql://eljugueterodetatho.com:3306/eljugueterodetat_inventario";
		this.databaseDriver = "com.mysql.cj.jdbc.Driver";
		this.databaseUserName = "eljugueterodetat_inv";
		this.databasePassword = "1nv3nt4r10.";
	}

	@Bean
	public DataSource dataSource() {

		HikariDataSource dataSource = new HikariDataSource();

		dataSource.setDriverClassName(databaseDriver);
		dataSource.setJdbcUrl(databaseUrl);
		dataSource.setUsername(databaseUserName);
		dataSource.setPassword(databasePassword);
		dataSource.setIdleTimeout(120000);// Dos minutos
		dataSource.setMaximumPoolSize(20);
		dataSource.setMinimumIdle(5);
		dataSource.setConnectionTimeout(45000);
		return dataSource;
	}

}
