import java.util.*;

public class Orden {

    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
        this.creacion = creacion;
        this.id = id;
        items=new ArrayList<DetalleOrden>();
    }

    public void agregarItem(DetalleOrden detalle) {
        this.items.add(detalle);
    }

    public int getNroItems() {
        return items.size();
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }

    public float calcularTotalOrden() {
        Iterator<DetalleOrden> it = this.items.iterator();
        float total = 0;
        while(it.hasNext()) {
            DetalleOrden detallePedido = it.next();
            total += detallePedido.getCantidad()*detallePedido.getPrecioUnitario();
        }
        return total;
    }
}