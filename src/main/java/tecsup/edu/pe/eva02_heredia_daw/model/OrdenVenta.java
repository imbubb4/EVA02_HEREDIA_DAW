package tecsup.edu.pe.eva02_heredia_daw.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class OrdenVenta {

    @Id
    private Integer nroOrdenVta;

    private LocalDate fechaEmision;
    private String motivo;
    private String situacion;

    @OneToMany(mappedBy = "ordenVenta", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<DetalleOrdenVenta> detalles;

    // Getters y Setters
    public Integer getNroOrdenVta() { return nroOrdenVta; }
    public void setNroOrdenVta(Integer nroOrdenVta) { this.nroOrdenVta = nroOrdenVta; }

    public LocalDate getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(LocalDate fechaEmision) { this.fechaEmision = fechaEmision; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getSituacion() { return situacion; }
    public void setSituacion(String situacion) { this.situacion = situacion; }

    public List<DetalleOrdenVenta> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleOrdenVenta> detalles) { this.detalles = detalles; }
}
