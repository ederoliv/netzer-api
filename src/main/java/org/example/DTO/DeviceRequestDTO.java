package org.example.DTO;

import java.util.UUID;

public record DeviceRequestDTO(
        UUID id,
        String name,
        String username,
        String operatingSystem,
        String ip,
        String mac) { }