import java.util.ArrayList;

public class AvionPasajeros extends Avion implements IConsulta {
    private int numPasajeros;
    private ArrayList<Pasajero> pasajeros;
    
    public AvionPasajeros(String nombre, String matricula, int autonomiaKm, int numPasajeros) {
        super(nombre, matricula, autonomiaKm);
        this.numPasajeros = numPasajeros;
        this.pasajeros = new ArrayList<>();
    }
    
    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }
    
    @Override
    public String getInfoCompleta() {
        StringBuilder info = new StringBuilder();
        info.append("Avión de Pasajeros: ").append(nombre).append("\n");
        info.append("Matrícula: ").append(matricula).append("\n");
        info.append("Autonomía: ").append(autonomiaKm).append(" km\n");
        info.append("Capacidad: ").append(numPasajeros).append(" pasajeros\n");
        info.append("Pasajeros a bordo:\n");
        for (Pasajero p : pasajeros) {
            info.append("- ").append(p.getInfo()).append("\n");
        }
        return info.toString();
    }
    
    @Override
    public Pasajero buscarPasajeroPorNombre(String nombre) {
        for (Pasajero p : pasajeros) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    
    public Pasajero buscarPasajero(String dni) {
        for (Pasajero p : pasajeros) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }
    
    @Override
    public boolean actualizarInfo(String nombre, String matricula, int autonomiaKm) {
        throw new UnsupportedOperationException("Método no implementado en AvionPasajeros");
    }
    
    
    public int getNumPasajeros() { return numPasajeros; }
    public ArrayList<Pasajero> getPasajeros() { return pasajeros; }
}