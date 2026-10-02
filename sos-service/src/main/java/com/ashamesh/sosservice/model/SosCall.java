package com.ashamesh.sosservice.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Table(name="sos_calls")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SosCall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String victimName;
    private String phoneNumber;
    private String emergencyType; // e.g. , Flood , Accident , Medical

    private double latitude;
    private double longitude;

    private String status;
    private LocalDateTime timestamp;
}
