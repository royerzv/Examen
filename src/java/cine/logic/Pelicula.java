/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cine.logic;

public class Pelicula implements java.io.Serializable{

    private String codigo;
    private String nombre;
    private String formato;
    private String duracion;
    private String genero;
    private String censura;
    private double precioGen;
    private double precioAM;
    private String foto;
    
    public Pelicula(){}
    
    public Pelicula(String codigo, String nombre, String formato, String duracion, String genero, String censura, double precioGen, double precioAM, String foto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.formato = formato;
        this.duracion = duracion;
        this.genero = genero;
        this.censura = censura;
        this.precioGen = precioGen;
        this.precioAM = precioAM;
        this.foto = foto;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getFormato(){
        return this.formato;
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }
    
    public String getDuracion(){
        return this.duracion;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getCensura(){
        return this.censura;
    }
    
    public void setCensura(String censura){
        this.censura = censura;
    }
    
    public double getPrecioGen(){
        return this.precioGen;
    }
    
    public void setPrecioGen(double precioGen){
        this.precioGen = precioGen;
    }
    
    public double getPrecioAM(){
        return this.precioAM;
    }
    
    public void setPrecioAM(double precioAM){
        this.precioAM = precioAM;
    }
    
    public String getFoto(){
        return this.foto;
    }
    
    public void setFoto(String foto){
        this.foto = foto;
    }
}
