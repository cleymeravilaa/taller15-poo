public class BookInfoManagementService {
    public BookInfoManagementService(Book book) {
        System.out.println("Titulo libro: : " + book.getTitle());
        System.out.println("Autor del Libro: : " + book.getAuthor());
        System.out.println("Numero de paginas:  " + book.getNumberOfPages());
    }
}
