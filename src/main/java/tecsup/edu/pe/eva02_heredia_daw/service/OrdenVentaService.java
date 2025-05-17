package tecsup.edu.pe.eva02_heredia_daw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tecsup.edu.pe.eva02_heredia_daw.dao.OrdenVentaDAO;
import tecsup.edu.pe.eva02_heredia_daw.model.OrdenVenta;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenVentaService {

    @Autowired
    private OrdenVentaDAO dao;

    public List<OrdenVenta> listar() {
        return dao.findAll();
    }

    public OrdenVenta guardar(OrdenVenta orden) {
        return dao.save(orden);
    }

    public Optional<OrdenVenta> buscarPorId(Integer id) {
        return dao.findById(id);
    }

    public void eliminar(Integer id) {
        dao.deleteById(id);
    }
}
