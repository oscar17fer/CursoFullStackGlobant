
package profesorclases.entidades;




public class Entidades {
    
    // -------------- ATRIBUTOS --------------------//
    
    private String nombreCurso;
    private int catidadHorasPorDia;
    private int catidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String [] alumnos = new String[5];
    
    
    // -------------- CONSTRUTOR POR DEFECTO --------------------//
    
    public Entidades (){
       
    }
    
    // -------------- CONSTRUCTOR POR ATRIBUTOS  --------------------//

    public Entidades(String nombreCurso, int catidadHorasPorDia, int catidadDiasPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.catidadHorasPorDia = catidadHorasPorDia;
        this.catidadDiasPorSemana = catidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    


    
    
    // -------------- GETTERS AND SETTERS  --------------------//

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCatidadHorasPorDia() {
        return catidadHorasPorDia;
    }

    public void setCatidadHorasPorDia(int catidadHorasPorDia) {
        this.catidadHorasPorDia = catidadHorasPorDia;
    }

    public int getCatidadDiasPorSemana() {
        return catidadDiasPorSemana;
    }

    public void setCatidadDiasPorSemana(int catidadDiasPorSemana) {
        this.catidadDiasPorSemana = catidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    
    
    
    
    

}    


