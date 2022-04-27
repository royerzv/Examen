package cine.logic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Tanda implements java.io.Serializable{

    private int id;
    private Pelicula pelicula;
    private LocalDate fecha;
    private LocalTime hora;
    private String sala;

    public Tanda(){}

    public Tanda(int id, Pelicula pelicula, LocalDate fecha, LocalTime hora, String sala){
        this.id = id;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id ){
        this.id = id;
    }

    public Pelicula getPelicula(){
        return this.pelicula;
    }

    public void setPelicula(Pelicula pelicula ){
        this.pelicula = pelicula;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public LocalTime getHora(){
        return this.hora;
    }

    public void setHora(LocalTime hora ){
        this.hora = hora;
    }

    public String getSala(){
        return this.sala;
    }

    public void setSala(String sala){
        this.sala = sala;
    }
}

