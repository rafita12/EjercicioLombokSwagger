package com.clemen.mvc.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name="Cliente")
@Data
@AllArgsConstructor

public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fecha")
	private LocalDate fecha;

	@Column(name="dni")
	private String dni;
	
	public Cliente() {};
	
	public Cliente(String nombre, String apellidos, LocalDate fecha, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.dni = dni;
	}
	
}
