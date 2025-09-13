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
@Table(name = "hitters")
public class Hitter {
    @EmbeddedId
    private HitterId id;

    @Column(name = "avg")
    private Float avg;

    @Column(name = "g")
    private Integer g;

    @Column(name = "pa")
    private Integer pa;

    @Column(name = "ab")
    private Integer ab;

    @Column(name = "r")
    private Integer r;

    @Column(name = "h")
    private Integer h;

    @Column(name = "doubles")
    private Integer doubles;

    @Column(name = "triples")
    private Integer triples;

    @Column(name = "hr")
    private Integer hr;

    @Column(name = "tb")
    private Integer tb;

    @Column(name = "rbi")
    private Integer rbi;

    @Column(name = "sac")
    private Integer sac;

    @Column(name = "sf")
    private Integer sf;
}