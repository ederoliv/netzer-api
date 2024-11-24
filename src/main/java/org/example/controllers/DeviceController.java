package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.entities.Device;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/devices")
public class DeviceController {

    @PostMapping
    public ResponseEntity<?> registerDevice(@RequestBody Device device) {

        return ResponseEntity.ok(device);

    }

}
