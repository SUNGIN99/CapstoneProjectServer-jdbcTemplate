package com.example.demo.src.domain.match.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MatchRecordsRes {
    private String date; // 경기날짜
    private String nickname; // 닉네임
    private String network_type; // 온,오프라인 매칭
    private int count; // 게임 인원 수
    private int team; // 팀 번호
    private String winOrLose; //승패 (settle_type)
    private int total_score; // 최종 점수
}

