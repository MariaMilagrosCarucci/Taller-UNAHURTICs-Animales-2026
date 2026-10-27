public class Gato extends Animal {
    //atributo sólo de Gato
    private int horasDeSuenio;

    //constructor
    public Gato(String nombre, int edad, double peso, int horasDeSuenio) {
        //palabra clave super(...)
        super(nombre, edad, peso);
        this.horasDeSuenio = horasDeSuenio;
    }

    //getter
    public int getHorasDeSuenio() {
        return this.horasDeSuenio;
    }

    //setter
    public void setHorasDeSuenio(int nuevaHora) {
        this.horasDeSuenio = nuevaHora;
    }

    //polimorfismo del metodo hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}