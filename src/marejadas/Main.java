package marejadas;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class Main {
    public static void main(String[] args){
        /*LectorArchivo lector = new LectorArchivo();
        List<Dato> datos = lector.leer("C:\\Users\\Duoc\\Downloads\\NodoIquique.txt");
        for(Dato d : datos){
            d.mostrar();
       }*/
       /***Consulta directa al sitio web***/
       try{
           //1.- Definir la URL
           String urlStr = "https://fundacion-instituto-profesional-duoc-uc.github.io/ATY1102-Surf/Nodo%2010%20(-37,-75)%20-%20Talcahuano.txt"; 
           var url = new URL(urlStr);
           //2.- Crear un archivo temporal
           File tempFile = File.createTempFile("NodoIquique",".txt");
           tempFile.deleteOnExit();
           //3.- copiar desde la url el archivo temporal
           try(InputStream in = url.openStream()){
               Files.copy(in, tempFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
           }
           //4.- Unificar el Archivo Temporal con los objetos
           LectorArchivo lector = new LectorArchivo();
           List<Dato> datos = lector.leer(tempFile.getAbsolutePath());
           //5.- mostrar resultados
           for(Dato d : datos){
            d.mostrar();
           }
           
           //6.- Ola más alta
           AnalizadorMarejadas analizador = new AnalizadorMarejadas(datos);
           analizador.olaMasAlta();
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}
