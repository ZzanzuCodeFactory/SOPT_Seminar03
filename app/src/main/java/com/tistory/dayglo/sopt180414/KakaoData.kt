package com.tistory.dayglo.sopt180414

/**
 * Created by user on 2018-04-14.
 * recyclerview 하나에 들어갈 데이터들을 정의
 * Data 클래스의 경우에는 소괄호로 열고 닫음
 * 채팅방 제목, 채티방 내용 요약, 시간, 프로필 사진
 * 생성자, getter/setter 따로 만들 필요 없음(개편함)
 */

data class KakaoData(
    var profile : Int,
    var name : String,
    var preView : String,
    var date : String
)