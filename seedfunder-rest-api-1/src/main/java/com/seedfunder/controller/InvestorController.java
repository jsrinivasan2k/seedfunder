import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.seedfunder.model.Investor;
import com.seedfunder.service.InvestorService;

import java.util.List;

@RestController
@RequestMapping("/api/investors")
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    @PostMapping
    public ResponseEntity<Investor> addInvestor(@RequestBody Investor investor) {
        Investor createdInvestor = investorService.addInvestor(investor);
        return new ResponseEntity<>(createdInvestor, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvestor(@PathVariable String id) {
        investorService.deleteInvestor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investor> updateInvestor(@PathVariable String id, @RequestBody Investor investor) {
        Investor updatedInvestor = investorService.updateInvestor(id, investor);
        return new ResponseEntity<>(updatedInvestor, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Investor>> getAllInvestors() {
        List<Investor> investors = investorService.getAllInvestors();
        return new ResponseEntity<>(investors, HttpStatus.OK);
    }
}