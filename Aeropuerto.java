import java.util.ArrayList;
import java.util.Iterator;

public abstract class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected ArrayList<Avion> aviones;
    
    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new ArrayList<>();
    }
    
    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }
    
    /**
     * Método para eliminar un avión de la lista de aviones asignados
     * @param matricula Matrícula del avión a eliminar
     * @return true si se eliminó correctamente, false si no se encontró el avión
     */
    public boolean eliminarAvion(String matricula) {
        Iterator<Avion> iterator = aviones.iterator();
        while (iterator.hasNext()) {
            Avion avion = iterator.next();
            if (avion.getMatricula().equals(matricula)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    
     
    public String mostrarAvionesPorTipo() {
        StringBuilder info = new StringBuilder();
        info.append("Aviones en ").append(nombre).append(":\n");
        
        // Aviones de pasajeros
        info.append("\n--- Aviones de Pasajeros ---\n");
        for (Avion a : aviones) {
            if (a instanceof AvionPasajeros) {
                info.append(a.getInfoCompleta()).append("\n");
            }
        }
        
        // Aviones de carga
        info.append("\n--- Aviones de Carga ---\n");
        for (Avion a : aviones) {
            if (a instanceof AvionCarga) {
                info.append(a.getInfoCompleta()).append("\n");
            }
        }
        
        // Avionetas
        info.append("\n--- Avionetas ---\n");
        for (Avion a : aviones) {
            if (a instanceof Avioneta) {
                info.append(a.getInfoCompleta()).append("\n");
            }
        }
        
        return info.toString();
    }
    
    public String getInfoAviones() {
        StringBuilder info = new StringBuilder();
        info.append("Aviones en ").append(nombre).append(":\n");
        for (Avion a : aviones) {
            info.append(a.getInfoCompleta()).append("\n\n");
        }
        return info.toString();
    }
    
    public Avion buscarAvionConPasajero(String dni) {
        for (Avion a : aviones) {
            if (a instanceof AvionPasajeros) {
                AvionPasajeros ap = (AvionPasajeros) a;
                if (ap.buscarPasajero(dni) != null) {
                    return a;
                }
            } else if (a instanceof Avioneta) {
                Avioneta av = (Avioneta) a;
                if (av.buscarPasajero(dni) != null) {
                    return a;
                }
            }
        }
        return null;
    }
    
    
    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public ArrayList<Avion> getAviones() { return aviones; }
}