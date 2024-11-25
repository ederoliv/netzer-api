package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.DTO.DeviceDTO;
import org.example.entities.Device;
import org.example.repositories.DeviceRepository;
import org.example.services.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/devices")
public class DeviceController {

    private final DeviceService deviceService;

    @PostMapping
    public ResponseEntity<?> registerDevice(@RequestBody DeviceDTO deviceDTO) {

        return ResponseEntity.ok(deviceService.registerDevice(deviceDTO));

    }

    @GetMapping
    public ResponseEntity<?> getAllDevices() {
        return ResponseEntity.ok(deviceService.getAllDevices());
    }
}