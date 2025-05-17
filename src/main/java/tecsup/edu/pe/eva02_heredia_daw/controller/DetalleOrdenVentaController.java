package tecsup.edu.pe.eva02_heredia_daw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tecsup.edu.pe.eva02_heredia_daw.model.DetalleOrdenVenta;
import tecsup.edu.pe.eva02_heredia_daw.service.DetalleOrdenVentaService;

import java.util.List;

@RestController
@RequestMapping("/detalles")
public class DetalleOrdenVentaController {

    @Autowired
    private DetalleOrdenVentaService service;

    @GetMapping
    public List<DetalleOrdenVenta> listar() {
        return service.listar();
    }

    @PostMapping
    public DetalleOrdenVenta guardar(@RequestBody DetalleOrdenVenta detalle) {
        return service.guardar(detalle);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleOrdenVenta> buscar(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
