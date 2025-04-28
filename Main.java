public class Main {
    public static void main(String[] args) {
        Biberia biberia = new Biberia();
        
        // Obtener los aeropuertos
        AeropuertoMilitar militar = (AeropuertoMilitar) biberia.getAeropuerto(0);
        AeropuertoComercial barajas = (AeropuertoComercial) biberia.getAeropuerto(1);
        AeropuertoComercial elPrat = (AeropuertoComercial) biberia.getAeropuerto(2);
        
        // Crear aviones
        AvionPasajeros avion1 = new AvionPasajeros("Boeing 747", "BI-1234", 12000, 300);
        AvionCarga avion2 = new AvionCarga("Airbus A400M", "BI-5678", 8000, 37000);
        Avioneta avion3 = new Avioneta("Cessna 172", "BI-9012", 1200, 4);
        
        // Agregar pasajeros
        avion1.agregarPasajero(new Pasajero("Juan Pérez", "12345678A", 35));
        avion1.agregarPasajero(new Pasajero("María García", "87654321B", 28));
        avion3.agregarPasajero(new Pasajero("Carlos López", "11223344C", 42));
        
        // Asignar aviones a aeropuertos
        militar.agregarAvion(avion2);
        barajas.agregarAvion(avion1);
        elPrat.agregarAvion(avion3);
        
        // Prueba del requerimiento 1: Eliminar avión
        System.out.println("Intentando eliminar avión BI-5678: " + militar.eliminarAvion("BI-5678"));
        
        // Prueba del requerimiento 2: Buscar pasajero por nombre
        Pasajero pasajero = avion1.buscarPasajeroPorNombre("María García");
        System.out.println("Pasajero encontrado: " + (pasajero != null ? pasajero.getInfo() : "No encontrado"));
        
        // Prueba del requerimiento 3: Mostrar aviones por tipo
        System.out.println("\nAviones en Barajas por tipo:\n" + barajas.mostrarAvionesPorTipo());
        
        // Prueba del requerimiento 4: Actualizar información de avión
        System.out.println("Actualizando información de avión de carga: " + 
                          avion2.actualizarInfo("Airbus A400M Atlas", null, 8500));
        
        // Prueba del requerimiento 5: Listar aeropuertos por ciudad
        System.out.println("\nAeropuertos en Madrid:\n" + biberia.listarAeropuertosPorCiudad("Madrid"));
        
        // Mostrar información completa
        System.out.println(biberia.getInfoAeropuertos());
        
        // Buscar pasajero
        System.out.println(biberia.buscarPasajero("87654321B"));
    }
}