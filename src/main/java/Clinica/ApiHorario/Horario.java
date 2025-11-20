
package Clinica.ApiHorario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Horario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCon;
    private Long idMed;
    private Long idDis;
    private Long idEsp;
    private Long idEmp;
    private String fec;
    private String horIni;
    private String horFin;
    private double pre;
    private String est;

    public Horario() {
    }

    public Horario(Long id, Long idCon, Long idMed, Long idDis, Long idEsp, Long idEmp, String fec, String horIni, String horFin, double pre, String est) {
        this.id = id;
        this.idCon = idCon;
        this.idMed = idMed;
        this.idDis = idDis;
        this.idEsp = idEsp;
        this.idEmp = idEmp;
        this.fec = fec;
        this.horIni = horIni;
        this.horFin = horFin;
        this.pre = pre;
        this.est = est;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }

    public Long getIdDis() {
        return idDis;
    }

    public void setIdDis(Long idDis) {
        this.idDis = idDis;
    }

    public Long getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(Long idEsp) {
        this.idEsp = idEsp;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHorIni() {
        return horIni;
    }

    public void setHorIni(String horIni) {
        this.horIni = horIni;
    }

    public String getHorFin() {
        return horFin;
    }

    public void setHorFin(String horFin) {
        this.horFin = horFin;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

}
