package com.seedfunder.service;

import com.seedfunder.model.Round;
import com.seedfunder.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoundService {

    @Autowired
    private RoundRepository roundRepository;

    public Round addNewRound(Round round) {
        return roundRepository.save(round);
    }

    public Optional<Round> getRound(Long id) {
        return roundRepository.findById(id);
    }

    public Round updateRound(Long id, Round updatedRound) {
        return roundRepository.findById(id).map(round -> {
            round.setCompany(updatedRound.getCompany());
            round.setInvestors(updatedRound.getInvestors());
            round.setTargetAmount(updatedRound.getTargetAmount());
            round.setRaisedAmount(updatedRound.getRaisedAmount());
            round.setStatus(updatedRound.getStatus());
            return roundRepository.save(round);
        }).orElseThrow(() -> new RuntimeException("Round not found"));
    }

    public void deleteRound(Long id) {
        roundRepository.deleteById(id);
    }

    public Round completeRound(Long id) {
        return roundRepository.findById(id).map(round -> {
            round.setStatus(RoundStatus.COMPLETED);
            return roundRepository.save(round);
        }).orElseThrow(() -> new RuntimeException("Round not found"));
    }
}