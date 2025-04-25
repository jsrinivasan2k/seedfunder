package com.seedfunder.controller;

import com.seedfunder.model.Round;
import com.seedfunder.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rounds")
public class RoundController {

    @Autowired
    private RoundService roundService;

    @PostMapping
    public ResponseEntity<Round> addNewRound(@RequestBody Round round) {
        Round createdRound = roundService.addNewRound(round);
        return ResponseEntity.status(201).body(createdRound);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Round> updateRound(@PathVariable Long id, @RequestBody Round updatedRound) {
        try {
            Round round = roundService.updateRound(id, updatedRound);
            return ResponseEntity.ok(round);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRound(@PathVariable Long id) {
        roundService.deleteRound(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/complete")
    public ResponseEntity<Round> completeRound(@PathVariable Long id) {
        try {
            Round round = roundService.completeRound(id);
            return ResponseEntity.ok(round);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Round>> getAllRounds() {
        List<Round> rounds = roundService.getAllRounds();
        return ResponseEntity.ok(rounds);
    }
}