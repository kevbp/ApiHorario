package Clinica.ApiHorario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/horario")
public class Control {

    @Autowired
    private Servicio serv;

    @PostMapping("/grabar")
    public Horario grabar(@RequestBody Horario hor) {
        return serv.grabar(hor);
    }

    @GetMapping("/buscar/{id}")
    public Horario buscar(@PathVariable Long id) {
        return serv.buscar(id);
    }

    @GetMapping("/listar")
    public List<Horario> listar() {
        return serv.listar();
    }

    @PutMapping("/actualizar/{id}")
    public Horario actualizar(@PathVariable Long id, @RequestBody Horario hor) {
        return serv.actualizar(id, hor);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serv.eliminar(id);
    }
}
