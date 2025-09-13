package kr.ac.hansung.cse.strikezonevr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "team_rankings")
public class TeamRanking {
    @EmbeddedId
    private TeamRankingId id;

    @Column(name = "games")
    private Integer games;

    @Column(name = "rank")
    private Integer rank;

    @Column(name = "wins")
    private Integer wins;

    @Column(name = "losses")
    private Integer losses;

    @Column(name = "draws")
    private Integer draws;

    @Column(name = "pct")
    private Float pct;

    @Column(name = "gb")
    private Float gb;

    @Column(name = "streak")
    private String streak;

    @Column(name = "last10")
    private String last10;

    @Column(name = "home_record")
    private String homeRecord;

    @Column(name = "away_record")
    private String awayRecord;
    }
