public class Perro extends Animal {
    //atributo sólo de Perro
    private String raza;

    //constructor
    public Perro(String nombre, int edad, double peso, String raza) {
        //palabra clave super(...)
        super(nombre, edad, peso);
        this.raza = raza;
    }

    //getter
    public String getRaza() {
        return this.raza;
    }

    //setter
    public void setRaza(String nuevaRaza) {
        this.raza = nuevaRaza;
    }

    //polimorfismo del metodo hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}