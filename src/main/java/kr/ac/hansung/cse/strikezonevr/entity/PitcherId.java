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
public class PitcherId implements Serializable {
    @Column(name = "player_name", nullable = false)
    private String playerName;

    @Column(name = "team")
    private String team;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PitcherId entity = (PitcherId) o;
        return Objects.equals(this.playerName, entity.playerName) &&
                Objects.equals(this.team, entity.team) &&
                Objects.equals(this.year, entity.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, team, year);
    }
}

