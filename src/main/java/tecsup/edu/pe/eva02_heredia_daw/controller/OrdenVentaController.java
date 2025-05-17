package tecsup.edu.pe.eva02_heredia_daw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tecsup.edu.pe.eva02_heredia_daw.model.OrdenVenta;
import tecsup.edu.pe.eva02_heredia_daw.service.OrdenVentaService;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenVentaController {

    @Autowired
    private OrdenVentaService service;

    @GetMapping
    public List<OrdenVenta> listar() {
        return service.listar();
    }

    @PostMapping
    public OrdenVenta guardar(@RequestBody OrdenVenta orden) {
        return service.guardar(orden);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdenVenta> buscar(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdenVenta> actualizar(@PathVariable Integer id, @RequestBody OrdenVenta orden) {
        return service.buscarPorId(id).map(actual -> {
            orden.setNroOrdenVta(id);
            return ResponseEntity.ok(service.guardar(orden));
        }).orElse(ResponseEntity.notFound().build());
    }
}