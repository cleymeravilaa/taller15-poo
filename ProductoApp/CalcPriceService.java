package ProductoApp;

public class CalcPriceService {
    public CalcPriceService(Product product) {
        System.out.println("El precio del producto es: " + product.getPrice() * product.getQuantity());
    }
}
