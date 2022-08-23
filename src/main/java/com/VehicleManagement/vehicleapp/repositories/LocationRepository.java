package com.VehicleManagement.vehicleapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VehicleManagement.vehicleapp.models.Client;
import com.VehicleManagement.vehicleapp.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
