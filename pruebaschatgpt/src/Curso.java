import  java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
        // Constructor por defecto
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana,
                 String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        alumnos = new String[5]; // Crear el arreglo para almacenar los nombres de los alumnos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de los alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
    }

    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso:");
        nombreCurso = scanner.nextLine();

        System.out.println("Ingrese la cantidad de horas por día:");
        cantidadHorasPorDia = scanner.nextInt();

        System.out.println("Ingrese la cantidad de días por semana:");
        cantidadDiasPorSemana = scanner.nextInt();

        System.out.println("Ingrese el turno (mañana o tarde):");
        turno = scanner.next();

        System.out.println("Ingrese el precio por hora:");
        precioPorHora = scanner.nextDouble();

        cargarAlumnos(); // Llamar al método cargarAlumnos() para ingresar los nombres de los alumnos
    }

    public double calcularGananciaSemanal() {
        int cantidadAlumnos = alumnos.length;
        double gananciaPorDia = cantidadHorasPorDia * precioPorHora * cantidadAlumnos;
        double gananciaSemanal = gananciaPorDia * cantidadDiasPorSemana;
        return gananciaSemanal;
    }

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.crearCurso();
        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("La ganancia semanal del curso es: $" + gananciaSemanal);
    }
}
