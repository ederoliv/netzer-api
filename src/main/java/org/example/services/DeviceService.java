package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.DTO.DeviceDTO;
import org.example.entities.Device;
import org.example.repositories.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class DeviceService {

    public final DeviceRepository deviceRepository;

    public DeviceDTO getDeviceById(DeviceDTO deviceDTO) {
        Device device = deviceRepository.findById(deviceDTO.id()).orElse(null);

        if (device != null) {

            return DeviceDTO.fromEntity(device);

        }
        return null;
    }

    public DeviceDTO registerDevice(DeviceDTO deviceDTO) {
        Device device = deviceRepository.findById(deviceDTO.id()).orElse(null);

        if (device == null) {

            device = Device.fromDTO(deviceDTO);
            deviceRepository.save(device);
            return deviceDTO;
        }
        return null;
    }


    public List<DeviceDTO> getAllDevices() {

        List<Device> devices = deviceRepository.findAll();

        List<DeviceDTO> dtos = new ArrayList<>();

        for (Device device : devices) {
            dtos.add(DeviceDTO.fromEntity(device));
        }

        return dtos;
    }
}
