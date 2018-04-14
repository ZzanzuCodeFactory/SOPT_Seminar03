package com.tistory.dayglo.sopt180414

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by user on 2018-04-14.
 * View를 정의
 * kakao_item.xml
 */

class KakaoViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var kakaoProfile : ImageView = itemView!!.findViewById(R.id.item_profile_img)
    var kakaoName : TextView = itemView!!.findViewById(R.id.item_name_tv)
    var kakaoDate : TextView = itemView!!.findViewById(R.id.item_date_tv)
    var kakaoPreview : TextView = itemView!!.findViewById(R.id.item_preview_tv)
}