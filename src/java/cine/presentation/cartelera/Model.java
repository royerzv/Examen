/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cine.presentation.cartelera;
import cine.logic.Tanda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static java.time.LocalDate.parse;
import java.time.LocalTime;
import java.time.LocalDate;
import cine.logic.Pelicula;
import java.time.Month;
import java.time.format.*;
import java.time.format.DateTimeFormatter;

public class Model {

    List<Tanda> tandasCompleta;
    List<Tanda> tandasFiltrada;
    List<LocalDate> fechas;
    String selectedDate;
    
    public Model()
    {
        this.reset();
    }
    
    public void reset()
    {
        setListTandasFiltrada(new ArrayList<Tanda>());        
    }
    
    public List<Tanda> getListTandasCompleta()
    {
        return tandasCompleta;
    }
    
        public void setListTandasCompleta(List<Tanda> tanda) 
    {
        this.tandasCompleta = tanda;
    }
        
    public List<Tanda> getListTandasFiltrada()
    {
        return tandasFiltrada;
    }
    
        public void setListTandasFiltrada(List<Tanda> tanda) 
    {
        this.tandasFiltrada = tanda;
    }
        
    public List<LocalDate> getListFechas()
    {
        return fechas;
    }
    
        public void setListFechas(List<LocalDate> fechas) 
    {
        this.fechas = fechas;
    }
       
    public String getSelectedDate(){
        return this.selectedDate;
    }
    
    public void setSelectedDate(String date){
        this.selectedDate = date;
    }
}
