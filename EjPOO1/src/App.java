/*
Crear un package llamado Models dentro de src.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 
**Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
//importar clase del model
import Models.Libro;
//nombre de la app
public class App {
    //metodo main
    public static void main(String[] args) {
        //constructor del libro para llamarlo 
        Libro libro = new Libro(null, null, null, 0);
        //llamar metodos
        libro.pedirInfo();
        libro.mostrarLibro();
    }
}
