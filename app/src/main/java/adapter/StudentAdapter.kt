package vn.edu.ute.recyclerviewdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import vn.edu.ute.recyclerviewdemo.R
import vn.edu.ute.recyclerviewdemo.model.Student

class StudentAdapter(private val studentList: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtInfo: TextView = itemView.findViewById(R.id.txtInfo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = studentList[position]
        holder.txtName.text = student.name
        holder.txtInfo.text = "MSSV: ${student.id} | Ngành: ${student.major}"

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Đã chọn: ${student.name} (${student.id})",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int = studentList.size
}