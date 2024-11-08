package UserApp;

public class DataService {
    public DataService(User user) {
        System.out.println("Los datos del usuario son: ");
        System.out.println("Nombre: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Contraseña: " + user.getPassword());
    }
}
