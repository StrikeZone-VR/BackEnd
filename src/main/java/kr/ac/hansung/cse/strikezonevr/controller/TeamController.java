package kr.ac.hansung.cse.strikezonevr.controller;

import kr.ac.hansung.cse.strikezonevr.entity.TeamRanking;
import kr.ac.hansung.cse.strikezonevr.service.TeamRankingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/team-rankings")
public class TeamController {
    private final TeamRankingService teamRankingService;

    public TeamController(TeamRankingService teamRankingService) {
        this.teamRankingService = teamRankingService;
    }

    @GetMapping
    public List<TeamRanking> getAllTeamRankings() {
        return teamRankingService.getAllTeamRankings();
    }
}
