abstract class Animal {
    //atributos privados
    private String nombre;
    private int edad;
    private double peso;

    //constructor
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public double getPeso() {
        return this.peso;
    }

    //setters
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    public void setPeso(double nuevoPeso) {
        this.peso = nuevoPeso;
    }

    //metodo abstracto
    public abstract void hacerSonido();
}