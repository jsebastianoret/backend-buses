package ore.tamara.retoBackend.controller;

import ore.tamara.retoBackend.model.Bus;
import ore.tamara.retoBackend.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = "*")
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping("/listar")
    public ResponseEntity<List<Bus>> listarBuses() {
        List<Bus> buses = busService.obtenerTodosLosBuses();
        return ResponseEntity.ok(buses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> obtenerBusPorId(@PathVariable Long id) {
        return busService.obtenerBusPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
