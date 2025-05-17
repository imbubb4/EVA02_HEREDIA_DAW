package tecsup.edu.pe.eva02_heredia_daw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tecsup.edu.pe.eva02_heredia_daw.dao.DetalleOrdenVentaDAO;
import tecsup.edu.pe.eva02_heredia_daw.model.DetalleOrdenVenta;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleOrdenVentaService {

    @Autowired
    private DetalleOrdenVentaDAO dao;

    public List<DetalleOrdenVenta> listar() {
        return dao.findAll();
    }

    public DetalleOrdenVenta guardar(DetalleOrdenVenta detalle) {
        return dao.save(detalle);
    }

    public Optional<DetalleOrdenVenta> buscarPorId(Integer id) {
        return dao.findById(id);
    }

    public void eliminar(Integer id) {
        dao.deleteById(id);
    }
}
