public class EstudianteSena {

    private String nombreDelAprendiz;
    private String fichaAprendiz;
    private int edadAprendiz;
    private String programaDeFormacion;
    private String centroDeFormacion;
    private String nombreInstructorLider;
    private String nombreVoceroDeFicha;
    private boolean tieneContratoDeAprendizaje;
    private boolean tieneApoyoDeSostenimiento;
    private boolean tieneCivicaEstudiantil;


    public EstudianteSena() {
    }


    public EstudianteSena(String nombreDelAprendiz, String fichaAprendiz, int edadAprendiz,
                          String programaDeFormacion, String centroDeFormacion, String nombreInstructorLider,
                          String nombreVoceroDeFicha, boolean tieneContratoDeAprendizaje, boolean tieneApoyoDeSostenimiento,
                          boolean tieneCivicaEstudiantil) {
        this.nombreDelAprendiz = nombreDelAprendiz;
        this.fichaAprendiz = fichaAprendiz;
        this.edadAprendiz = edadAprendiz;
        this.programaDeFormacion = programaDeFormacion;
        this.centroDeFormacion = centroDeFormacion;
        this.nombreInstructorLider = nombreInstructorLider;
        this.nombreVoceroDeFicha = nombreVoceroDeFicha;
        this.tieneContratoDeAprendizaje = tieneContratoDeAprendizaje;
        this.tieneApoyoDeSostenimiento = tieneApoyoDeSostenimiento;
        this.tieneCivicaEstudiantil = tieneCivicaEstudiantil;
    }

    public String getNombreDelAprendiz() {
        return this.nombreDelAprendiz;
    }

    public void setNombreDelAprendiz(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
        }
        this.nombreDelAprendiz = nombre;
    }

    public String getFichaAprendiz() {
        return this.fichaAprendiz;
    }

    public void setFichaAprendiz(String ficha) {
        if (ficha == null || ficha.isEmpty()) {
            System.out.println("La ficha no puede estar vacía");
        }
        this.fichaAprendiz = ficha;
    }

    public int getEdadAprendiz() {
        return this.edadAprendiz;
    }

    public void setEdadAprendiz(int edad) {
        if (edad > 100 || edad < 0) {
            System.out.println("Ingrese una edad válida");
        }
        this.edadAprendiz = edad;
    }

    public String getProgramaDeFormacion() {
        return this.programaDeFormacion;
    }

    public void setProgramaDeFormacion(String programa) {
        if (programa == null || programa.isEmpty()) {
            System.out.println("El programa de formación no puede estar vacío");
        }
        this.programaDeFormacion = programa;
    }

    public String getCentroDeFormacion() {
        return this.centroDeFormacion;
    }

    public void setCentroDeFormacion(String centro) {
        if (centro == null || centro.isEmpty()) {
            System.out.println("El centro de formación no puede estar vacío");
        }
        this.centroDeFormacion = centro;
    }

    public String getNombreInstructorLider() {
        return this.nombreInstructorLider;
    }

    public void setNombreInstructorLider(String nombreInstructor) {
        if (nombreInstructor == null || nombreInstructor.isEmpty()) {
            System.out.println("El nombre del instructor no puede estar vacío");
        }
        this.nombreInstructorLider = nombreInstructor;
    }

    public String getNombreVoceroDeFicha() {
        return this.nombreVoceroDeFicha;
    }

    public void setNombreVoceroDeFicha(String nombreVoceroFicha) {
        if (nombreVoceroFicha == null || nombreVoceroFicha.isEmpty()) {
            System.out.println("El nombre del vocero no puede estar vacío");
        }
        this.nombreVoceroDeFicha = nombreVoceroFicha;
    }

    public boolean getTieneContratoDeAprendizaje() {
        return this.tieneContratoDeAprendizaje;
    }

    public void setTieneContratoDeAprendizaje(boolean contrato) {
        this.tieneContratoDeAprendizaje = contrato;
    }

    public boolean getTieneApoyoDeSostenimiento() {
        return this.tieneApoyoDeSostenimiento;
    }

    public void setTieneApoyoDeSostenimiento(boolean apoyo) {
        this.tieneApoyoDeSostenimiento = apoyo;
    }

    public boolean getTieneCivicaEstudiantil() {
        return this.tieneCivicaEstudiantil;
    }

    public void setTieneCivicaEstudiantil(boolean civica) {
        this.tieneCivicaEstudiantil = civica;
    }

    @Override
    public String toString() {
        return "EstudianteSena {" +
                "nombreDelAprendiz='" + nombreDelAprendiz + '\'' +
                ", fichaAprendiz='" + fichaAprendiz + '\'' +
                ", edadAprendiz=" + edadAprendiz +
                ", programaDeFormacion='" + programaDeFormacion + '\'' +
                ", centroDeFormacion='" + centroDeFormacion + '\'' +
                ", nombreInstructorLider='" + nombreInstructorLider + '\'' +
                ", nombreVoceroDeFicha='" + nombreVoceroDeFicha + '\'' +
                ", tieneContratoDeAprendizaje=" + tieneContratoDeAprendizaje +
                ", tieneApoyoDeSostenimiento=" + tieneApoyoDeSostenimiento +
                ", tieneCivicaEstudiantil=" + tieneCivicaEstudiantil +
                '}';
    }
}