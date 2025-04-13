package ore.tamara.retoBackend.service;

import ore.tamara.retoBackend.model.Bus;
import ore.tamara.retoBackend.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;

    public List<Bus> obtenerTodosLosBuses() {
        return busRepository.findAll();
    }

    public Optional<Bus> obtenerBusPorId(Long id) {
        return busRepository.findById(id);
    }


}
