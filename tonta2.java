public class tonta2 {
    public static void main(String[] args) {
        // Crear instancias de Localidad
        Localidad balcon1 = new Localidad(50);
        Localidad balcon2 = new Localidad(50);
        Localidad platea = new Localidad(50);

        // Crear instancia de Teatro
        Teatro teatro = new Teatro(balcon1, balcon2, platea);

        // Crear instancia de Tickets
        Tickets ticket = new Tickets(10, "Juan Perez", "Balcon1", teatro, "", "juan@example.com", 20000.0f);

        // Validar presupuesto y disponibilidad
        boolean presupuestoValido = ticket.validarPresupuesto();
        boolean disponibilidadValida = ticket.validarDisponibilidad();

        // Registrar venta si ambas validaciones son verdaderas
        Tickets venta = ticket.registrarventa();

        if (venta != null) {
            System.out.println("Venta registrada exitosamente.");
            System.out.println("Número de ticket: " + venta.generarNoTicket());
        } else {
            System.out.println("No se pudo registrar la venta.");
        }
    }
}
