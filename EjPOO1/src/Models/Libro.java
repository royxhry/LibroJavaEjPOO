package Models;
//libreria
import java.util.Scanner;
//nombre clas
public class Libro {
    //asignar atributos
    String titulo, autor, isbn;
    int pag;
    //constructor vacio
    Libro(){
    }
    //constructor con todos los atributos pasados por parametros
    public Libro(String titulo, String autor, String isbn, int pag){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.pag = pag;
    }
    //getters&setters
    public int getPag() {
        return pag;
    }
    public void setPag(int pag) {
        this.pag = pag;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    //metodo para pedir los datos al usuario
    public void pedirInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el ISBN del libro");
        this.isbn = sc.nextLine();
        System.out.println("Ingresa el Titulo del libro: ");
        this.titulo = sc.nextLine();
        System.out.println("Ingresa el Autor del libro: ");
        this.autor = sc.nextLine();
        System.out.println("Ingresa el numero de paginas del libro: ");
        this.pag = sc.nextInt();
    }
    //metodo para mostrar los datos del libro 
    public void mostrarLibro(){
        System.out.println("El isbn es: "+isbn);
        System.out.println("El titulo es: "+titulo);
        System.out.println("El autor es: "+autor);
        System.out.println("El numero de paginas es: "+pag);
    }



}
