package kr.ac.hansung.cse.strikezonevr.repository;

import kr.ac.hansung.cse.strikezonevr.entity.Pitcher;
import kr.ac.hansung.cse.strikezonevr.entity.PitcherId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PitcherRepository extends JpaRepository<Pitcher, PitcherId> {
}
