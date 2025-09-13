package kr.ac.hansung.cse.strikezonevr.service;

import kr.ac.hansung.cse.strikezonevr.entity.Pitcher;
import kr.ac.hansung.cse.strikezonevr.repository.PitcherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitcherService {
    private final PitcherRepository pitcherRepository;

    public PitcherService(PitcherRepository pitcherRepository) {
        this.pitcherRepository = pitcherRepository;
    }

    public List<Pitcher> getAllPitchers() {
        return pitcherRepository.findAll();
    }
}
