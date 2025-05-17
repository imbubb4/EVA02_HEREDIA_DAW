package tecsup.edu.pe.eva02_heredia_daw.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class DetalleOrdenVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcionMed;
    private Integer cantidadRequerida;

    @ManyToOne
    @JoinColumn(name = "nroOrdenVta")
    @JsonBackReference
    private OrdenVenta ordenVenta;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDescripcionMed() { return descripcionMed; }
    public void setDescripcionMed(String descripcionMed) { this.descripcionMed = descripcionMed; }

    public Integer getCantidadRequerida() { return cantidadRequerida; }
    public void setCantidadRequerida(Integer cantidadRequerida) { this.cantidadRequerida = cantidadRequerida; }

    public OrdenVenta getOrdenVenta() { return ordenVenta; }
    public void setOrdenVenta(OrdenVenta ordenVenta) { this.ordenVenta = ordenVenta; }
}
