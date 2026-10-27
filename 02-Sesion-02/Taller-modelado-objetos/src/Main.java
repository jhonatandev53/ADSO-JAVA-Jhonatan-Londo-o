public class Main {
    public static void main(String[] args) {

        EstudianteSena miEstudiante = new EstudianteSena(
                "Carlos Pérez",
                "2822510",
                20,
                "Análisis y Desarrollo de Software",
                "Centro de Comercio y Servicios",
                "Ana Gómez",
                "Mateo Restrepo",
                true,
                true,
                false
        );


        System.out.println("--- INFORMACIÓN DEL ESTUDIANTE (Usando toString) ---");
        System.out.println(miEstudiante);


        System.out.println("\n--- PROBANDO GETTERS ---");
        System.out.println("Nombre del aprendiz: " + miEstudiante.getNombreDelAprendiz());
        System.out.println("Ficha: " + miEstudiante.getFichaAprendiz());


        System.out.println("\n--- PROBANDO SETTERS Y VALIDACIONES ---");
        System.out.println("Cambiando edad a 150 (debe mostrar el mensaje de error)...");
        miEstudiante.setEdadAprendiz(150);

        System.out.println("Cambiando edad a 22 (edad válida)...");
        miEstudiante.setEdadAprendiz(22);
        System.out.println("Nueva edad guardada: " + miEstudiante.getEdadAprendiz());
    }
}