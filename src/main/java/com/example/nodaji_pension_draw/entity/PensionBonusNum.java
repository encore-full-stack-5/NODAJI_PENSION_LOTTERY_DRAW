package com.example.nodaji_pension_draw.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Entity
@Table(name = "PENSION_BONUS_NUMS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PensionBonusNum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "BONUS_NUM_ID")
    @Column(name = "BONUS_NUM_ID")
    private Long id;


    @Column(name = "DRAW_ROUND")
    private int drawRound;


    @Column(name = "FIRST_NUM")
    private int firstNum;


    @Column(name = "SECOND_NUM")
    private int secondNum;


    @Column(name = "THIRD_NUM")
    private int thirdNum;


    @Column(name = "FOURTH_NUM")
    private int fourthNum;


    @Column(name = "FIFTH_NUM")
    private int fifthNum;


    @Column(name = "SIXTH_NUM")
    private int sixthNum;


    @Column(name = "DRAW_DATE")
    private LocalDate drawDate;

//    @OneToOne
//    @JoinColumn(name = "BONUS_NUM_ID")
//    private PensionWinNum pensionWinNum;


}
