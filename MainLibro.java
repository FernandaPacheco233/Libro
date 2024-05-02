import java.util.Scanner;

class MainLibro {
    public static void main(String[] args) {
        Libro librito = new Libro();
        String a, e;
        int i, o;

        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa el Titulo del libro: ");
        e = op.nextLine();
        librito.titulo = e;
        System.out.print("Ingresa el nombre del Autor: ");
        a = op.nextLine();
        librito.autor = a;
        System.out.print("Ingresa el ISBN: ");
        i = op.nextInt();
        librito.isbn = i;
        System.out.print("Ingresa El numero de paginas: ");
        o = op.nextInt();
        librito.numpag = o;
        
        librito.MostrarTitulo();
        librito.MostarAutor();
        librito.MostrarIsbn();
        librito.MostarNumeroDePaginas();
        Libro libro1 = new Libro("Los locos", "Fernanda", 43, 300);

    }
}
