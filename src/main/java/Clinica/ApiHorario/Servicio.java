package Clinica.ApiHorario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public Horario grabar(Horario hor) {
        return repo.save(hor);
    }

    public Horario buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Horario> listar() {
        return repo.findAll();
    }

    public Horario actualizar(Long id, Horario hor) {
        return repo.findById(id).map(existing -> {
            existing.setIdCon(hor.getIdCon());
            existing.setIdMed(hor.getIdMed());
            existing.setIdDis(hor.getIdDis());
            existing.setIdEsp(hor.getIdEsp());
            existing.setIdEmp(hor.getIdEmp());
            existing.setFec(hor.getFec());
            existing.setHorIni(hor.getHorIni());
            existing.setHorFin(hor.getHorFin());
            existing.setPre(hor.getPre());
            existing.setEst(hor.getEst());
            return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
