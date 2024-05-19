package com.example.project.demo.Machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineService {
    @Autowired
    public MachineRepository repo;


//    @Value("${file.path}")
//    private String FOLDER_PATH;
    public List<MachineEntity> getAllMaterial() {
        return repo.findAll();
    }

    public MachineEntity getMachineId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public MachineEntity saveMachine(MachineEntity machine) {
        return this.repo.save(machine);
    }

    public Boolean deleteMachine(Long id) {
        if (repo.findById(id).isPresent()) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Long countMachine() {
        return repo.count();
    }
}
