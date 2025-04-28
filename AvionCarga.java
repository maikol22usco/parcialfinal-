public class AvionCarga extends Avion {
    private double cargaMaximaKg;
    
    public AvionCarga(String nombre, String matricula, int autonomiaKm, double cargaMaximaKg) {
        super(nombre, matricula, autonomiaKm);
        this.cargaMaximaKg = cargaMaximaKg;
    }
    
    @Override
    public String getInfoCompleta() {
        return "Avión de Carga: " + nombre + "\n" +
               "Matrícula: " + matricula + "\n" +
               "Autonomía: " + autonomiaKm + " km\n" +
               "Carga máxima: " + cargaMaximaKg + " kg";
    }
    
    @Override
    public boolean actualizarInfo(String nombre, String matricula, int autonomiaKm) {
        
        if (nombre != null && nombre.isEmpty()) return false;
        if (matricula != null && matricula.isEmpty()) return false;
        if (autonomiaKm < 0) return false;
        
        
        if (nombre != null) this.nombre = nombre;
        if (matricula != null) this.matricula = matricula;
        if (autonomiaKm > 0) this.autonomiaKm = autonomiaKm;
        
        return true;
    }
    
    public double getCargaMaximaKg() { return cargaMaximaKg; }
}