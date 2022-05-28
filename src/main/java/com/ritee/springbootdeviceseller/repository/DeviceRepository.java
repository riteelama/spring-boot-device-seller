package com.ritee.springbootdeviceseller.repository;

import com.ritee.springbootdeviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long>
{

}
