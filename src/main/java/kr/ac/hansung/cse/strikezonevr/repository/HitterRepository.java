package kr.ac.hansung.cse.strikezonevr.repository;

import kr.ac.hansung.cse.strikezonevr.entity.Hitter;
import kr.ac.hansung.cse.strikezonevr.entity.HitterId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface HitterRepository extends JpaRepository<Hitter, HitterId> {
    @Query("select h from Hitter h where h.avg is not null and h.g >= 90 order by h.avg desc")
    List<Hitter> findTopHitters(Pageable pageable);
}
