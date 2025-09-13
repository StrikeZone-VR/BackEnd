package kr.ac.hansung.cse.strikezonevr.controller;

import kr.ac.hansung.cse.strikezonevr.entity.Hitter;
import kr.ac.hansung.cse.strikezonevr.service.HitterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hitters")
public class HitterController {
    private final HitterService hitterService;

    public HitterController(HitterService hitterService) {
        this.hitterService = hitterService;
    }

    @GetMapping
    public List<Hitter> getAllHitters() {
        return hitterService.getAllHitters();
    }

    // 상위 10명 반환 엔드포인트
    @GetMapping("/top")
    public List<Hitter> getTopHitters() {
        return hitterService.getTopHitters();
    }

}
