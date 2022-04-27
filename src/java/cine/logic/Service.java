
package cine.logic;

import java.time.*;
import java.time.LocalTime;
import java.time.Month;
import static java.time.LocalDate.parse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.time.format.*;
import java.util.*;
import java.time.format.DateTimeFormatter;


public class Service {

    private static Service uniqueInstance;
    
    public static Service instance()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new Service();
        }
        return uniqueInstance; 
    }
    
    HashMap<String,Pelicula> peliculas;
    HashMap<Integer,Tanda> tandas;
    
    private Service(){
        
        DateTimeFormatter formatterA = DateTimeFormatter.ofPattern("hh:mm:ss a");
   
        String path = "/Examen/images";
        peliculas = new HashMap();
        peliculas.put("batman", new Pelicula("batman", "THE BATMAN", "2D DOB", "02:55", "Accion", "MAY12", 3000, 2500, path + "/batman.png"));
        peliculas.put("morbius", new Pelicula("morbius", "MORBIUS", "2D DOB", "01:45", "Accion", "TP", 3500, 2500, path + "/morbius.png"));
        peliculas.put("jujutsu", new Pelicula("jujutsu", "JUJUTSU KAISEN 0", "2D SUB", "01:45", "Animadas", "MAY12", 2000, 1500, path + "/jujutsu.png"));
        peliculas.put("tiposmalos", new Pelicula("tiposmalos", "LOS TIPOS MALOS", "2D DOB", "01:40", "Animadas", "TP", 2500, 2000, path + "/tiposmalos.png"));
        peliculas.put("sonic2", new Pelicula("sonic2", "SONIC 2", "2D DOB", "02:05", "Animadas", "TP", 3000, 2500, path + "/sonic2.png"));
        peliculas.put("animales3", new Pelicula("animales3", "ANIMALES FANTASTICOS 3", "2D DOB", "02:20", "Aventura", "TP", 3000, 2500, path + "/animales3.png"));
        
        tandas = new HashMap();
        tandas.put(1, new Tanda(1, peliculaFind("batman"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(14,30,00).format(formatterA), formatterA) , "6"));
        tandas.put(2, new Tanda(2, peliculaFind("batman"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(18,00,00).format(formatterA), formatterA), "4"));
        tandas.put(3, new Tanda(3, peliculaFind("morbius"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(12,20,00).format(formatterA), formatterA), "5"));
        tandas.put(4, new Tanda(4, peliculaFind("morbius"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(14,35,00).format(formatterA), formatterA), "5"));
        tandas.put(5, new Tanda(5, peliculaFind("morbius"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(16,45,00).format(formatterA), formatterA), "5"));
        tandas.put(6, new Tanda(6, peliculaFind("jujutsu"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(11,00,00).format(formatterA), formatterA), "3"));
        tandas.put(7, new Tanda(7, peliculaFind("jujutsu"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(14,30,00).format(formatterA), formatterA), "3"));
        tandas.put(8, new Tanda(8, peliculaFind("jujutsu"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(16,40,00).format(formatterA), formatterA), "3"));
        tandas.put(9, new Tanda(9, peliculaFind("jujutsu"), parse("2022-04-27"), LocalTime.parse(LocalTime.of(18,55,00).format(formatterA), formatterA), "3"));
        tandas.put(10, new Tanda(10, peliculaFind("batman"), parse("2022-04-28"), LocalTime.parse(LocalTime.of(13,00,00).format(formatterA), formatterA), "4"));
        tandas.put(11, new Tanda(11, peliculaFind("tiposmalos"), parse("2022-04-28"), LocalTime.parse(LocalTime.of(11,30,00).format(formatterA), formatterA), "5"));
        tandas.put(12, new Tanda(12, peliculaFind("tiposmalos"), parse("2022-04-28"), LocalTime.parse(LocalTime.of(17,30,00).format(formatterA), formatterA), "5"));
        tandas.put(13, new Tanda(13, peliculaFind("sonic2"), parse("2022-04-28"), LocalTime.parse(LocalTime.of(01,30,00).format(formatterA), formatterA), "6"));
        tandas.put(14, new Tanda(14, peliculaFind("sonic2"), parse("2022-04-28"), LocalTime.parse(LocalTime.of(16,00,00).format(formatterA), formatterA), "6"));
        tandas.put(15, new Tanda(15, peliculaFind("sonic2"), parse("2022-04-29"), LocalTime.parse(LocalTime.of(14,00,00).format(formatterA), formatterA), "6"));
        tandas.put(16, new Tanda(16, peliculaFind("animales3"), parse("2022-04-29"), LocalTime.parse(LocalTime.of(13,00,00).format(formatterA), formatterA), "5"));
        tandas.put(17, new Tanda(17, peliculaFind("animales3"), parse("2022-04-29"), LocalTime.parse(LocalTime.of(15,30,00).format(formatterA), formatterA), "5"));
    
    }
    
    public List<Tanda> tandasFind(LocalDate fecha){
        List<Tanda> result = new ArrayList<>();
        for(Tanda t: tandas.values()){
            if(t.getFecha().equals(fecha)){
                result.add(t);
            }
        }
        
        return result;
    }
    
    public List<Tanda> getTandas(){
        List<Tanda> result = new ArrayList<Tanda>(tandas.values());
        
        return result;
    }
    
    public Pelicula peliculaFind(String codigo) 
    {
        if (peliculas.get(codigo)!=null){
            if(peliculas.get(codigo).getCodigo().equals(codigo)){
                return peliculas.get(codigo);
            }
        }
        Pelicula obj = new Pelicula();
        return obj;
    }
   
     public List<LocalDate> getDatesFromList(List<Tanda> listaTanda)
    {
        
        List<LocalDate> fechas = new ArrayList<LocalDate>();
        
        for(Tanda t: listaTanda){
            fechas.add(t.getFecha());
        }

        Set<LocalDate> set = new LinkedHashSet<>();

        set.addAll(fechas);

        fechas.clear();

        fechas.addAll(set);

        return fechas;
    }
}
