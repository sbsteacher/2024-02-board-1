package com.green.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
/*
    @Service - 빈 등록

    빈 등록: 스프링 컨테이너에게 객체 생성을 대리로 맡기는 것, 기본적으로
            싱글톤으로 객체화

 */

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;
}
