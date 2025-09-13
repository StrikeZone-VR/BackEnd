package kr.ac.hansung.cse.strikezonevr.service;

import kr.ac.hansung.cse.strikezonevr.entity.Hitter;
import kr.ac.hansung.cse.strikezonevr.repository.HitterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HitterService {
    private final HitterRepository hitterRepository;

    public HitterService(HitterRepository hitterRepository) {
        this.hitterRepository = hitterRepository;
    }

    public List<Hitter> getAllHitters() {
        return hitterRepository.findAll();
    }
}
