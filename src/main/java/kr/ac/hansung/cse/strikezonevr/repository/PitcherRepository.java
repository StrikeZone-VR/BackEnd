package kr.ac.hansung.cse.strikezonevr.repository;

import kr.ac.hansung.cse.strikezonevr.entity.Pitcher;
import kr.ac.hansung.cse.strikezonevr.entity.PitcherId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface PitcherRepository extends JpaRepository<Pitcher, PitcherId> {
    @Query("select p from Pitcher p where p.ip >= 100 and p.era is not null order by p.era asc")
    List<Pitcher> findTopPitchers(Pageable pageable);
}
