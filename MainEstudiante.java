import java.util.Arrays;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("Patri", 12, 170),
                new Estudiante("Manuel", 43, 173),
                new Estudiante("Javier", 72, 189),
                new Estudiante("Alicia", 52, 168),
                new Estudiante("Alberto", 35, 189)
        };

        System.out.println("Estudiantes sin ordenar:");
        mostrarEstudiantes(estudiantes);

        Arrays.sort(estudiantes);

        System.out.println("\nEstudiantes ordenados:");
        mostrarEstudiantes(estudiantes);

    }

    private static void mostrarEstudiantes(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
    }
}
