package com.example.project.demo.Machine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class MachineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long machine_id;
    private String country;
    private String status;
    private Long pmProduction;
    private String employeeID;
//  @Lob
//    @Column(name = "imagedata",length = 1000)
//    private byte[] imageData;

//    @OneToMany(mappedBy = "machineEntity")
//    private Set<Employees> employees;

}
