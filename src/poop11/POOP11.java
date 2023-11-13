/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Archivo principal, manejo de archivos
 * @author Luis Hernandez
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("###########File##########");
        File archivo=new File("archivo.txt");
        System.out.println("(1) Archivo existe: "+archivo.exists());//si archivo existe
        if (!archivo.exists()) {try {//si el archivo NO existe entra al if
            boolean seCreo= archivo.createNewFile();//creacion de archivo, este aparece en la carpeta principal del proyecto
            System.out.println("Se creo un archivo "+seCreo);
            System.out.println("(2) Archivo existe: "+archivo.exists());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        System.out.println("###########File Writer/Reader##########");
        try {
            System.out.println("###########Lectura desde el teclado##########");//lectura desde el teclado
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//para que el usuario pueda leer
            System.out.println("Escriba el texto para el archivo");
            String texto= br.readLine();//en la variable texto se guarda lo que el usuario escriba, se lee
            System.out.println("El usuario escribio: "+texto);
            
            System.out.println("###########Escritura del archivo###########");
            FileWriter fw= new FileWriter("archivo.txt");//para escribir en el archivo
            BufferedWriter bw= new BufferedWriter(fw);//la infraestructura para escribir...
            PrintWriter impresoraDeArchivos= new PrintWriter(bw);
            impresoraDeArchivos.print(texto);//aqui se imprime en el archivo el texto guardado, print sin salto de linea, println con salto de linea
            impresoraDeArchivos.close();//para cerrar el archivo y guardar los cambios
            
            System.out.println("#########Lectura del archivo##########");//lectura desde el archivo
            FileReader fr= new FileReader("archivo.txt");//desde donde lo va a leee
            br= new BufferedReader(fr);//el buffer que lo almecena
            System.out.println("El texto del archivo es: ");
            String linea= br.readLine();
            while (linea!=null) {
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();  
            
            System.out.println("#############StringTokenizer##########");
            String alumno= "Hector Juan,Jimenez,Maya,319174377,20,8.3";
            System.out.println("Cadena a tokenizar "+alumno);
            StringTokenizer tokenizador= new StringTokenizer(alumno,",");
            while (tokenizador.hasMoreElements()) {
                System.out.println(tokenizador.nextToken());
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/   
        
        System.out.println("###########Actividad extra##########");
        try {
            
            System.out.println("###########Escritura del archivo###########");
            FileWriter fw= new FileWriter("alumnos.csv");//para escribir en el archivo
            BufferedWriter bw= new BufferedWriter(fw);//la infraestructura para escribir...
            PrintWriter impresoraDeArchivos= new PrintWriter(bw);
            impresoraDeArchivos.println("Rodrigo,Sanchez,Perez,20,123456,9.9,Copilco 300 Coyoacan");//aqui se imprime en el archivo el texto guardado, print sin salto de linea, println con salto de linea
            impresoraDeArchivos.println("Hernandez,Mejia,Luis,21,654321,9.1,Picos 2A Iztacalco");
            impresoraDeArchivos.println("Perez,Salemon,Jorge,24,789016,8.3,Canal del norte 21 Venuztiano Carranza");
            impresoraDeArchivos.println("Alvarez,Suarez,Alejandro,22,610987,8.9,Tezontle 116 Agricola Oriental");
            impresoraDeArchivos.println("Cardenas,Lazaro,Andres,20,551283,7.9,Churubusco 21 Iztapalapa");
            
            
            impresoraDeArchivos.close();//para cerrar el archivo y guardar los cambios
            
            System.out.println("#########Lectura del archivo##########");//lectura desde el archivo
            FileReader fr= new FileReader("alumnos.csv");//desde donde lo va a leee
            BufferedReader br= new BufferedReader(fr);//el buffer que lo almecena
            System.out.println("El texto del archivo es: ");
            String linea= br.readLine();
            while (linea!=null) {
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();  
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        System.out.println("===================================================");
        Alumnos alu1= new Alumnos("Luis", "Perez", "Noriega", "20", "8.3f");
        Alumnos alu2= new Alumnos("Angelica", "Romero", "Mejia", "27", "9.5f");
        Alumnos alu3= new Alumnos("Angel Eduardo", "Hernandez", "Campos", "23", "8.9f");
        Alumnos alu4= new Alumnos("Alejandra", "Gomez", "Hernandez", "22", "9.2f");
        Alumnos alu5= new Alumnos("David", "Limon", "Arambulo", "25", "8.0f");
        
        try{
            FileWriter fwr=new FileWriter("alumnos01.csv");
            BufferedWriter bwr=new BufferedWriter(fwr);
            PrintWriter imprimir= new PrintWriter(bwr);
            
            //imprimir.println("Nombre,Apeido Paterno,Apeido Materno,Edad,Promedio");
            imprimir.println(alu1.getNombre()+","+alu1.getApeido1()+","+alu1.getApeido2()+","+alu1.getEdad()+","+alu1.getPromedio());
            imprimir.println(alu2.getNombre()+","+alu2.getApeido1()+","+alu2.getApeido2()+","+alu2.getEdad()+","+alu2.getPromedio());
            imprimir.println(alu3.getNombre()+","+alu3.getApeido1()+","+alu3.getApeido2()+","+alu3.getEdad()+","+alu3.getPromedio());
            imprimir.println(alu4.getNombre()+","+alu4.getApeido1()+","+alu4.getApeido2()+","+alu4.getEdad()+","+alu4.getPromedio());
            imprimir.print(alu5.getNombre()+","+alu5.getApeido1()+","+alu5.getApeido2()+","+alu5.getEdad()+","+alu5.getPromedio());
            imprimir.close();
            
            FileReader fre= new FileReader("alumnos01.csv");
            BufferedReader bre= new BufferedReader(fre);
            System.out.println("El texto del archivo es: ");
            String linea= bre.readLine();
            int i=0;
            String datos[]=new String[25];
            while (linea!=null) {
                System.out.println(linea);
                
                String alumno=linea;
                StringTokenizer tk=new StringTokenizer(alumno,",");
                while (tk.hasMoreElements()) {
                    datos[i]=tk.nextToken();
                    i++;
                }
                
                linea=bre.readLine();
            }
            
            Alumnos alu6=new Alumnos();
            alu6.setNombre(datos[0]);
            alu6.setApeido1(datos[1]);
            alu6.setApeido2(datos[2]);
            alu6.setEdad(datos[3]);
            alu6.setPromedio(datos[4]);
            
            Alumnos alu7=new Alumnos();
            alu7.setNombre(datos[5]);
            alu7.setApeido1(datos[6]);
            alu7.setApeido2(datos[7]);
            alu7.setEdad(datos[8]);
            alu7.setPromedio(datos[9]);
            
            Alumnos alu8=new Alumnos();
            alu8.setNombre(datos[10]);
            alu8.setApeido1(datos[11]);
            alu8.setApeido2(datos[12]);
            alu8.setEdad(datos[13]);
            alu8.setPromedio(datos[14]);
            
            Alumnos alu9=new Alumnos();
            alu9.setNombre(datos[15]);
            alu9.setApeido1(datos[16]);
            alu9.setApeido2(datos[17]);
            alu9.setEdad(datos[18]);
            alu9.setPromedio(datos[19]);
            
            Alumnos alu10=new Alumnos();
            alu10.setNombre(datos[20]);
            alu10.setApeido1(datos[21]);
            alu10.setApeido2(datos[22]);
            alu10.setEdad(datos[23]);
            alu10.setPromedio(datos[24]);
            
            System.out.println("============================================");
            System.out.println("Los nuevos 5 alumnos, copias de los anteriores alumnos");
            System.out.println(alu6.toString());
            System.out.println(alu7.toString());
            System.out.println(alu8.toString());
            System.out.println(alu9.toString());
            System.out.println(alu10.toString());
                    
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
