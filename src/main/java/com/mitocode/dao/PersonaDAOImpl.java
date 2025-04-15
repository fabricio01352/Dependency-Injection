package com.mitocode.dao;

import java.util.List;

import com.mitocode.model.Persona;

public class PersonaDAOImpl implements PersonaDAO{


	// asi lo he estado haciedno, si cambia la clase Conexion, tendre que venir a refactorizar
	// todo donde se creen instancia de esa clase, si inyectamos la dependencia en el constructor
	// ya no nos importa lo que tiene esa clase, solo la inyectamos
//	private IConexion conexion = new Conexion();

	private IConexion conexion;	

	/*public PersonaDAOImpl(IConexion conexion) {		
		this.conexion = conexion;
	}*/
	
	public void setConexion(IConexion conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<Persona> listarTodos() {
		this.conexion.conectar();
		System.out.println("Listando...");
		return null;
	}

	@Override
	public Persona leerPorId(int id) {
		return null;
	}
	
	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona " + persona.getNombres() + " registrada");
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona " + persona.getNombres() + " actualizada");
	}

	@Override
	public void eliminar(int id) {
		System.out.println("id " + id + "eliminado");
	}

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub
		
	}

}
