
package com.easycare.controller;

import com.easycare.model.entity.Vehicle;
import com.easycare.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @PostMapping
    public Vehicle create(@RequestBody Vehicle v) {
        return service.save(v);
    }

    @GetMapping
    public List<Vehicle> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Vehicle get(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
