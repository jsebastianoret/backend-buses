package ore.tamara.retoBackend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "marca_bus")
public class MarcaBus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMarcaBus;
    private String nombreMarca;

    @OneToMany(mappedBy = "marcaBus")
    private List<Bus> buses;

    // Getters y setters


    public MarcaBus() {
    }

    public MarcaBus(Long idMarcaBus, String nombreMarca) {
        this.idMarcaBus = idMarcaBus;
        this.nombreMarca = nombreMarca;
    }

    public Long getIdMarcaBus() {
        return idMarcaBus;
    }

    public void setIdMarcaBus(Long idMarcaBus) {
        this.idMarcaBus = idMarcaBus;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
}
