package ore.tamara.retoBackend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBus;
    @Column(name = "numerobus", nullable = false)
    private String numeroBus;
    @Column(nullable = false)
    private String placa;
    @Column(columnDefinition = "TEXT")
    private String caracteristicas;
    private boolean activo;

    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fecha_creacion;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private MarcaBus marcaBus;

    public Bus() {
    }

    public Bus(Long idBus, String numeroBus, String placa, String caracteristicas, boolean activo, LocalDateTime fecha_creacion, MarcaBus marcaBus) {
        this.idBus = idBus;
        this.numeroBus = numeroBus;
        this.placa = placa;
        this.caracteristicas = caracteristicas;
        this.activo = activo;
        this.fecha_creacion = fecha_creacion;
        this.marcaBus = marcaBus;
    }

    // Getters y setters

    public Long getIdBus() {
        return idBus;
    }

    public void setIdBus(Long idBus) {
        this.idBus = idBus;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public MarcaBus getMarcaBus() {
        return marcaBus;
    }

    public void setMarcaBus(MarcaBus marcaBus) {
        this.marcaBus = marcaBus;
    }
}
