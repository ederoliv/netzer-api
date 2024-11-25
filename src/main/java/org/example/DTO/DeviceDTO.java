package org.example.DTO;

import org.example.entities.Device;

import java.util.UUID;

public record DeviceDTO(
        UUID id,
        String name,
        String username,
        String operatingSystem,
        String ip,
        String mac) {

    public static DeviceDTO fromEntity(Device device) {
        return new DeviceDTO(
                device.getId(),
                device.getName(),
                device.getUsername(),
                device.getOperatingSystem(),
                device.getIp(),
                device.getMac()
        );
    }

}