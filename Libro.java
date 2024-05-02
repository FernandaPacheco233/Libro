class Libro {
    String titulo, autor;
    int isbn, numpag;

    Libro() {
    }

    Libro(String tit, String au, int is, int num) {
        System.out.println("titulo: " + tit + " autor: " + au + "isbn " + is + "numpag " + num);
    }

    public void MostrarTitulo() {
        System.out.println("El titulo es: " + this.titulo);
    }

    public void MostarAutor() {
        System.out.println("El autor es: " + this.autor);
    }

    public void MostrarISBN() {
        System.out.println("El ISBN es: " + this.isbn);
    }

    public void MostarNumeroDePaginas() {
        System.out.println("Numero de paginas: " + this.numpag);
    }

}