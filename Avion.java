public abstract class Avion {
    protected String nombre;
    protected String matricula;
    protected int autonomiaKm;
    
    public Avion(String nombre, String matricula, int autonomiaKm) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaKm = autonomiaKm;
    }
    
    public abstract String getInfoCompleta();
    
  
    public abstract boolean actualizarInfo(String nombre, String matricula, int autonomiaKm);
    
    
    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }
    public int getAutonomiaKm() { return autonomiaKm; }
}