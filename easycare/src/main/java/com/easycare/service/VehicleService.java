
package com.easycare.service;

import com.easycare.model.entity.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle vehicle);
    List<Vehicle> findAll();
    Vehicle findById(Long id);
    void delete(Long id);
}
