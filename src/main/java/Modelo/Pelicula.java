/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author andres Vargas, Alejandro Forez y Cristian Morera
 */
public class Pelicula {

    /* Variables definidas para la clase Pelicual
    * Título: Nombre del ejemplar filmográfico.
    * Estudio: Estudio productor del ejemplar.
    * Estado: Indica el estado de la película entre un grupo de estados posibles.
    * Versiones: Una sola película puede poseer copias en distintos formatos como HD-DVD, BLUERAY, DUALDISC, entre otros.
    * Precio: Precio dado en pesos colombianos.
    * Clasificación: Indica para qué audiencia o público es apta la película.
    * Anio: Año en que la película debutó en las salas. 
    * Género: Genero de la película.
    * Fecha de publicación de DVD: Manteniendo el formato “día/mes/año”.
    * ID:  Es el ID de la película. 
    */
    private String titulo, estudio, estado, Versiones, clasificacion, genero;
    private String precio;
    private String anio, id;
    private String fecha;

    /*
    * Metodo Contructor de la aplicación
    * @param titulo: Nombre del ejemplar filmográfico.
    * @param estudio: Estudio productor del ejemplar..
    * @param estado: Estado de la película entre un grupo de estados posibles.
    * @param versiones: Versiones de las películas como HD-DVD, BLUERAY, DUALDISC, entre otros.
    * @param precio:Precio de las peliculas.
    * @param Clasificacion:Indica para qué audiencia o público es apta la película.
    * @param anio: Año en que la película debutó en las salas. 
    * @param genero: Genero de la película.
    * @param fecha: Manteniendo el formato “día/mes/año”.
    * @param id:Es el ID de la película.
    */
    public Pelicula(String titulo, String estudio, String estado, String Versiones, String precio, String Clasificacion, String anio, String genero, String fecha, String id) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.estado = estado;
        this.Versiones = Versiones;
        this.precio = precio;
        this.clasificacion = Clasificacion;
        this.anio = anio;
        this.genero = genero;
        this.fecha = fecha;
        this.id = id;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVersiones() {
        return Versiones;
    }

    public void setVersiones(String Versiones) {
        this.Versiones = Versiones;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPrecio() {
        return precio;
    }
     
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

}
