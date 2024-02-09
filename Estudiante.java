public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        int comparacionAltura = Integer.compare(otroEstudiante.getAltura(), this.altura);
        if (comparacionAltura != 0) {
            return comparacionAltura;
        }

        return Integer.compare(this.edad, otroEstudiante.getEdad());
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " - Edad: " + edad;
    }
}
