/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Pelicula {
    
    /* Variables definidas para la clase Pelicual
    * Título: Nombre del ejemplar filmográfico.
    * Estudio: Estudio productor del ejemplar.
    * Estado: Indica el estado de la película entre un grupo de estados posibles.
    * Versiones: Una sola película puede poseer copias en distintos formatos como HD-DVD, BLUERAY, DUALDISC, entre otros.
    * Precio: Precio dado en pesos colombianos MCTe.
    * Clasificación: Indica para qué audiencia o público es apta la película.
    * Año: Año en que la película debutó en las salas. 
    * Género: Genero de la película.
    * Fecha de publicación de DVD: Manteniendo el formato “día/mes/año”.
    * ID:  Es el ID de la película. */
    
    private String titulo,estudio,estado,Versiones,clasificacion, genero;
    private boolean precio;
    private int calificacion, anio, id;
    private Date fecha;

    /*
    * Metodo Contructor de la aplicación
    */
    public Pelicula(String titulo, String estudio, String estado, String Versiones, String clasificacion, String genero, boolean precio, int calificacion, int id) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.estado = estado;
        this.Versiones = Versiones;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.precio = precio;
        this.calificacion = calificacion;
        this.id = id;
    }

    /*
    * Metodo Contructor de la aplicación sin inicializar
    */
    public Pelicula() {
    }
    
    /*Metodos Get y set*/

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

    public boolean isPrecio() {
        return precio;
    }

    public void setPrecio(boolean precio) {
        this.precio = precio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
}
