package com.example.bookmakerhelper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by ch on 2020-06-29
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Match extends BaseEntity{

    Club homeTeam;
    Club awayTeam;

    Integer FirstTeamPoints;
    Integer SecondTeamPoints;
}
