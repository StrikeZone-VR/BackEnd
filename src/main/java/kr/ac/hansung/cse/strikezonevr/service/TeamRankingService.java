package kr.ac.hansung.cse.strikezonevr.service;

import kr.ac.hansung.cse.strikezonevr.entity.TeamRanking;
import kr.ac.hansung.cse.strikezonevr.repository.TeamRankingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamRankingService {
    private final TeamRankingRepository teamRankingRepository;

    public TeamRankingService(TeamRankingRepository teamRankingRepository) {
        this.teamRankingRepository = teamRankingRepository;
    }

    public List<TeamRanking> getAllTeamRankings() {
        return teamRankingRepository.findAll();
    }
}
