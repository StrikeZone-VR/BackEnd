package kr.ac.hansung.cse.strikezonevr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class TeamRankingId implements Serializable {
    @Column(name = "team", nullable = false)
    private String team;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TeamRankingId entity = (TeamRankingId) o;
        return Objects.equals(this.team, entity.team) &&
                Objects.equals(this.year, entity.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, year);
    }
}

