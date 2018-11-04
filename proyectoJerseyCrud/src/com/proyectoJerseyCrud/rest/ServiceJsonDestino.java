package com.proyectoJerseyCrud.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.proyectoJerseyCrud.modelo.Catdestino;
import com.proyectoJerseyCrud.repositorioImp.DestinoRepositorioImp;


@Path("/getJsonDestino")
public class ServiceJsonDestino {
	
	
	@GET
    @Path("/insert")
    @Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/proyectoJerseyCrud/rest/getJsonDestino/insert?nombre=Edificio9&descripcion=Edificio 9 piso&estatus=false
    public Catdestino incluirDestino( @QueryParam("nombre") String nombre,@QueryParam("descripcion") String descripcion,@QueryParam("estatus") boolean estatus ) {
		Catdestino destino = new Catdestino();
        destino.setNombre(nombre);
        destino.setDescripcion(descripcion);
        destino.setEstatus(estatus);
        DestinoRepositorioImp repositorioDestino = new DestinoRepositorioImp();
        repositorioDestino.merge(destino);
        return destino;
    }
	
	@GET
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/proyectoJerseyCrud/rest/getJsonDestino/update?nombre=Edificio9&descripcion=Edificio 9 piso&estatus=false
    public Catdestino modificarDestino( @QueryParam("id") long id,@QueryParam("nombre") String nombre,@QueryParam("descripcion") String descripcion,@PathParam("estatus") boolean estatus ) {
		DestinoRepositorioImp repositorioDestino = new DestinoRepositorioImp();
		Catdestino destino = repositorioDestino.objetoId(id);
		destino.setNombre(nombre);
        destino.setDescripcion(descripcion);
        destino.setEstatus(estatus);
        repositorioDestino.merge(destino);
        return destino;
    }
	

	@GET
    @Path("/eliminar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Catdestino eliminarDestino( @PathParam("id") long id ) {
		DestinoRepositorioImp repositorioDestino = new DestinoRepositorioImp();
		Catdestino destino = repositorioDestino.objetoId(id);
        repositorioDestino.delete(destino);
        return destino;
    }

	
	@GET
    @Path("/getDestino")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catdestino> obtenerDestino() {
		DestinoRepositorioImp repositorioDestino = new DestinoRepositorioImp();
		List<Catdestino> destino = repositorioDestino.getAllDestino();
      return destino;
      
    }
	

}
