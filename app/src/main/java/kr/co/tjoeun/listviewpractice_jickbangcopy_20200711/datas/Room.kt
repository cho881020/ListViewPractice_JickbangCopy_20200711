package kr.co.tjoeun.listviewpractice_jickbangcopy_20200711.datas

class Room(
    val price:Int,
    val address:String,
    val floor:Int,
    val description:String) {

    fun getFormattedFloor() : String {
        if (floor > 0) {
            return "${this.floor}층"
        }
        else if (floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }
    }

}