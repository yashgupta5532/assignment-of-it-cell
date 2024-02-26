package com.codewithyash.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithyash.springrest.payload.AspirantDto;
import com.codewithyash.springrest.services.AspirantService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/aspirants")
public class AspirantController {

    @Autowired
    private AspirantService aspirantService;

    @PostMapping("/create-aspirant")
    public ResponseEntity<AspirantDto> createAspirant(@RequestBody AspirantDto aspirantDto) {
        AspirantDto createdAspirantDto = this.aspirantService.createAspirant(aspirantDto);
        return new ResponseEntity<>(createdAspirantDto, HttpStatus.CREATED);
    }

    @PutMapping("/{aspirantId}")
    public ResponseEntity<AspirantDto> updateAspirant(@RequestBody AspirantDto aspirantDto,
            @PathVariable Integer aspirantId) {
        AspirantDto updatedAspirant = this.aspirantService.updateAspirant(aspirantDto, aspirantId);
        return new ResponseEntity<>(updatedAspirant, HttpStatus.OK);
    }

    @DeleteMapping("/{aspirantId}")
    public ResponseEntity<?> DeleteAspirant(@PathVariable Integer aspirantId) {
        this.aspirantService.deleteAspirant(aspirantId);
        return new ResponseEntity(Map.of("message", "Aspirant Deleted successfully"), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AspirantDto>> getAllAspirants() {
        return ResponseEntity.ok(this.aspirantService.getAllAspirants());
    }

    @GetMapping("/{aspirantId}")
    public ResponseEntity<AspirantDto> getSingleAspirant(@PathVariable Integer aspirantId) {
        return ResponseEntity.ok(this.aspirantService.getAspirantById(aspirantId));
    }
}
