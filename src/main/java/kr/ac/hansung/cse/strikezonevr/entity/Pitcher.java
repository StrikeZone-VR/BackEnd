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
@Table(name = "pitchers")
public class Pitcher {
    @EmbeddedId
    private PitcherId id;

    @Column(name = "era")
    private Float era;

    @Column(name = "ip")
    private Float ip;

    @Column(name = "w")
    private Integer w;

    @Column(name = "l")
    private Integer l;

    @Column(name = "sv")
    private Integer sv;

    @Column(name = "so")
    private Integer so;

    @Column(name = "bb")
    private Integer bb;

    @Column(name = "h")
    private Integer h;

    @Column(name = "hr")
    private Integer hr;
}