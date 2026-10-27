
public class Main {
    public static void main(String[] args) {
        //aca adentro probamos todo lo hecho
        
        //instanciamos objetos
        Animal coraje = new Perro("Coraje", 3, 43.0, "Golden");
        Animal cuki = new Gato("Cuki", 8, 5.0, 16);

        //verificamos polimorfismo
        coraje.hacerSonido();
        cuki.hacerSonido();
    }
}