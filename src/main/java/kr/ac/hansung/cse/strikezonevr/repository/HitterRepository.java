package kr.ac.hansung.cse.strikezonevr.repository;

import kr.ac.hansung.cse.strikezonevr.entity.Hitter;
import kr.ac.hansung.cse.strikezonevr.entity.HitterId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HitterRepository extends JpaRepository<Hitter, HitterId> {
}
