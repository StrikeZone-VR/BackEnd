package kr.ac.hansung.cse.strikezonevr.controller;

import kr.ac.hansung.cse.strikezonevr.entity.Pitcher;
import kr.ac.hansung.cse.strikezonevr.service.PitcherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pitchers")
public class PitcherController {
    private final PitcherService pitcherService;

    public PitcherController(PitcherService pitcherService) {
        this.pitcherService = pitcherService;
    }

    @GetMapping
    public List<Pitcher> getAllPitchers() {
        return pitcherService.getAllPitchers();
    }

    // 상위 10명 반환 엔드포인트
    @GetMapping("/top")
    public List<Pitcher> getTopPitchers() {
        return pitcherService.getTopPitchers();
    }

}
