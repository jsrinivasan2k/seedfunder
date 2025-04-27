package com.seedfunder.service;

import com.seedfunder.model.Investor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InvestorService {
    private final List<Investor> investors = new ArrayList<>();

    public Investor addInvestor(Investor investor) {
        investors.add(investor);
        return investor;
    }

    public void deleteInvestor(String id) {
        investors.removeIf(investor -> investor.getId().equals(id));
    }

    public Optional<Investor> updateInvestor(String id, Investor updatedInvestor) {
        for (int i = 0; i < investors.size(); i++) {
            Investor investor = investors.get(i);
            if (investor.getId().equals(id)) {
                investors.set(i, updatedInvestor);
                return Optional.of(updatedInvestor);
            }
        }
        return Optional.empty();
    }

    public List<Investor> getAllInvestors() {
        return new ArrayList<>(investors);
    }
}
