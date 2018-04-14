package com.tistory.dayglo.sopt180414

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by user on 2018-04-14.
 */
class KakaoAdapter(private var kakaoItems : ArrayList<KakaoData>) : RecyclerView.Adapter<KakaoViewHolder>() {
    override fun onBindViewHolder(holder: KakaoViewHolder?, position: Int) {
        holder!!.kakaoProfile.setImageResource(kakaoItems[position].profile)
        holder!!.kakaoName.text = kakaoItems[position].name
        holder!!.kakaoDate.text = kakaoItems[position].date
        holder!!.kakaoPreview.text = kakaoItems[position].preview
    }

    override fun getItemCount(): Int = kakaoItems.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): KakaoViewHolder {
        val mainView : View = LayoutInflater.from(parent?.context)
                .inflate(R.layout.kakao_item, parent, false)
        return KakaoViewHolder(mainView)
    }
}