package kr.co.tjoeun.listviewpractice_jickbangcopy_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200711.adapters.RoomAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200711.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mRoomList.add(Room(26700, "서울시 은평구", 4, "서울시 은평구의 4층 방입니다."))
        mRoomList.add(Room(7500, "서울시 도봉구", -2, "서울시 도봉구의 지하 2층 방입니다."))
        mRoomList.add(Room(53100, "서울시 동대문구", 13, "서울시 동대문구의 13층 방입니다."))
        mRoomList.add(Room(9400, "서울시 서대문구", -1, "서울시 서대구의 지하 1층 방입니다."))
        mRoomList.add(Room(10800, "서울시 송파구", 0, "서울시 송파구의 반지하 방입니다."))
        mRoomList.add(Room(25000, "서울시 양천구", 0, "서울시 양천구의 반지하 방입니다."))
        mRoomList.add(Room(4500, "서울시 용산구", 4, "서울시 용산구의 4층 방입니다."))
        mRoomList.add(Room(3800, "서울시 종로구", 3, "서울시 종로구의 3층 방입니다."))
        mRoomList.add(Room(16500, "서울시 강서구", 5, "서울시 강서구의 5층 방입니다."))
        mRoomList.add(Room(8900, "서울시 금천구", 2, "서울시 금천구의 2층 방입니다."))

        mRoomAdapter = RoomAdapter(mContext, R.layout.room_list_item, mRoomList)

        roomListView.adapter = mRoomAdapter

    }


}