package com.VehicleManagement.vehicleapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VehicleManagement.vehicleapp.models.Client;
import com.VehicleManagement.vehicleapp.models.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
