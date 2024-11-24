package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "devices")
public class Device {

    @Id
    private UUID id;

    private String name;

    private String username;

    private String operatingSystem;

    //private String processor;

    //private String storage;

    //private String freeSpace;

    //private String ram;

    private String ip;

    private String mac;

}
