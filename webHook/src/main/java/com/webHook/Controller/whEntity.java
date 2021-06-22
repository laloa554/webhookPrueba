package com.webHook.Controller;

public class whEntity {
	private String nombre;
	private String mensaje;
	
	public whEntity(String nombre, String mensaje) {
		super();
		this.nombre = nombre;
		this.mensaje = mensaje;
	}
	
	public whEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	

}
