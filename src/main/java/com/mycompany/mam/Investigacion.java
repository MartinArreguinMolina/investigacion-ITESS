
package com.mycompany.mam;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Investigacion {
    private static final String TITULO = "Ejemplo de definicion de investigacion";
    private static final String DESCRIPCION = "La investigación es un proceso que busca aumentar el conocimiento y resolver problemas a través de la recopilación, organización y análisis de información. Se puede aplicar a cualquier campo del saber humano, y es un método que se ha venido refinando a lo largo de la historia";
    private static final String REFERENCIA = "https://es.wikipedia.org/wiki/Investigaci%C3%B3n#:~:text=La%20investigaci%C3%B3n%20es%20el%20trabajo,de%20un%20tema%20o%20problema.";
    private static final String FOTO = "img-investigacion.jpg";    
    
    // Get and Set de titulo
    public String getTitulo(){
        return this.TITULO;
    }
    
    // Get and Set de descripcion;
    public String getDescripcion(){
        return this.DESCRIPCION;
    }
    
    // Get and Set de referencia
    public String getReferencia(){
        return this.REFERENCIA;
    }
    // Get and Set de foto
    public String getFoto(){
        return this.FOTO;
    }
    
}
