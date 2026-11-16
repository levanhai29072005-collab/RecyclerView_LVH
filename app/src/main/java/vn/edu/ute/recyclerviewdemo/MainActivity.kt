package vn.edu.ute.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vn.edu.ute.recyclerviewdemo.adapter.StudentAdapter
import vn.edu.ute.recyclerviewdemo.model.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvStudents = findViewById<RecyclerView>(R.id.rvStudents)

        val dsSinhVien = listOf(
            Student("2415053122316", "Lê Văn Hải", "Công nghệ thông tin"),
            Student("2415053122301", "Nguyễn Văn An", "Công nghệ thông tin"),
            Student("2415053122302", "Trần Thị Bình", "Kỹ thuật phần mềm"),
            Student("2415053122303", "Phạm Quốc Dũng", "Mạng máy tính"),
            Student("2415053122304", "Hoàng Minh Khoa", "An toàn thông tin"),
            Student("2415053122305", "Đặng Thu Hà", "Hệ thống thông tin")
        )

        rvStudents.layoutManager = LinearLayoutManager(this)
        rvStudents.adapter = StudentAdapter(dsSinhVien)
    }
}