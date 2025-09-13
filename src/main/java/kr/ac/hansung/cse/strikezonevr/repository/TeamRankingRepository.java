package kr.ac.hansung.cse.strikezonevr.repository;

import kr.ac.hansung.cse.strikezonevr.entity.TeamRanking;
import kr.ac.hansung.cse.strikezonevr.entity.TeamRankingId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRankingRepository extends JpaRepository<TeamRanking, TeamRankingId> {
}
