package com.proyectoJerseyCrud.repositorioImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.proyectoJerseyCrud.modelo.Catdestino;
import com.proyectoJerseyCrud.repositorio.DestinoRepositorio;



public class DestinoRepositorioImp implements DestinoRepositorio {
	
	
	private static final String PERSISTENCE_UNIT_NAME ="servicioJpa";
	public  EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	public  EntityManager  em = emf.createEntityManager();
 
	@Override
	public Catdestino merge(Catdestino destino) {
	try {
		
		em.getTransaction().begin();
		em.merge(destino);
		em.getTransaction().commit();
	}catch(Exception e) {
	    e.printStackTrace();	
	}	
		return destino;
	}
	/**
	 * lista todos los elementos destino
	 */
	@SuppressWarnings("unchecked")
	@Override
	public  List<Catdestino> getAllDestino(){
		Query queryObj = em.createQuery("SELECT destino FROM Catdestino destino");
        List<Catdestino> listaDestino = (List<Catdestino>) queryObj.getResultList();
        System.out.println(" lista destino "+ listaDestino.size() );
        if (listaDestino != null && listaDestino.size() > 0) {           
            return listaDestino;
        } else {
            return null;
        }
	}
	
	/**
	 * Eliminar en la base de datos en la tabla destino
	 * @param destino
	 */
	public Catdestino delete(Catdestino destino){
		
		try {
			em.getTransaction().begin();
			em.remove(destino);
			em.getTransaction().commit();	
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return destino;
	}
	
	/*
	 * Buscar por id destino para modificar
	 */
	
	public Catdestino objetoId(long id){
		em.getTransaction().begin();
		Catdestino destino = em.find(Catdestino.class, id);
		em.getTransaction().commit();
		return destino;
	}

	
	
	
}
