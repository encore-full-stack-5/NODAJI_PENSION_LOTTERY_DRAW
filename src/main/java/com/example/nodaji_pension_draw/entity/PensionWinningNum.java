package com.example.nodaji_pension_draw.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "PENSION_WINNING_NUMS")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PensionWinningNum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WINNING_NUM_ID")
    private Long id;

    @Column(name = "DRAW_ROUND")
    private int draw_round;

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


    @Column(name = "GROUP_NUM")
    private int groupNum;


    @Column(name = "DRAW_DATE")
    private LocalDate drawDate;
}
