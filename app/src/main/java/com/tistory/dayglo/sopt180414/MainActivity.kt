package com.tistory.dayglo.sopt180414

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/*
*
* lateinit var 당장 초기화 안하고 일단 넘어갈 경우
*/

class MainActivity : AppCompatActivity() {

    lateinit var kakaoItems : ArrayList<KakaoData> // 여기서 초기화를 하는 방법 or lateinit var
//    var kakaoItems : ArrayList<KakaoData> =  ArrayList()

    lateinit var  kakaoAdapter : KakaoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kakaoItems = ArrayList()

        // 객체화 된 것들을 넣어야하기 때문에 사전에 DataClass의 데이터들을 객체화해야됨.
        kakaoItems.add(KakaoData(R.drawable.img01, "이찬주", "채팅 프리뷰임", "오후 3:19"))
        kakaoItems.add(KakaoData(R.drawable.img02, "유현호", "채팅 프리뷰임!", "오후 4:19"))
        kakaoItems.add(KakaoData(R.drawable.img03, "박재영", "채팅 프리뷰임@", "오후 5:19"))
        kakaoItems.add(KakaoData(R.drawable.img04, "김이현", "채팅 프리뷰임#", "오후 6:19"))
        kakaoItems.add(KakaoData(R.drawable.img05, "유승렬", "채팅 프리뷰임$", "오후 7:19"))
        kakaoItems.add(KakaoData(R.drawable.img06, "김우진", "채팅 프리뷰임%", "오후 8:19"))
        kakaoItems.add(KakaoData(R.drawable.img07, "변진우", "채팅 프리뷰임^", "오후 9:19"))
        kakaoItems.add(KakaoData(R.drawable.img08, "김민상", "채팅 프리뷰임7", "오후 10:19"))
        kakaoItems.add(KakaoData(R.drawable.img09, "임태완", "채팅 프리뷰임!", "오후 11:19"))
        kakaoItems.add(KakaoData(R.drawable.img10, "안도익", "채팅 프리뷰임@", "오후 12:19"))

    }
}
