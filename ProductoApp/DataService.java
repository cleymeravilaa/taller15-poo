package ProductoApp;

public class DataService {
    public DataService(Product product) {
        System.out.println("Los datos del libro son: ");
        System.out.println("Nombre: " + product.getName());
        System.out.println("Precio: " + product.getPrice());
        System.out.println("Cantidad: " + product.getQuantity());           
    }
}
