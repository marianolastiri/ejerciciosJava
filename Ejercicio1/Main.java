import java.util.Date;
class Main {
  public static void main(String[] args) {
    Date fecha = new Date();
    Notebook compu1 = new Notebook("Apple", "MacBook Air", "Intel", 4.5f);
    DetalleOrden detallePedido = new DetalleOrden(compu1, 15000.0f, 2);
    Orden pedido = new Orden(10, fecha);
    Cliente comprador = new Cliente("Juan", 12345);

    System.out.println("El cliente " + comprador.getNombre() + ", con DNI " + comprador.getDni() + ", ha sido añadido al sistema");

    pedido.agregarItem(detallePedido);

    System.out.println("El monto total de la orden solicitada por " + comprador.getNombre() + " es " + pedido.calcularTotalOrden());


  }
}