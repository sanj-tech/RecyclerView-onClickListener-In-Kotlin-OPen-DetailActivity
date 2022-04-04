package com.jsstech.testdemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class EmpAdapter(var context: Context, var empList: MutableList<empDataModel>) :
    RecyclerView.Adapter<EmpAdapter.empViewHolder>() {

    //lateinit var onItemClickInterface: MainActivity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): empViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false)
        return empViewHolder(view)
    }

    override fun onBindViewHolder(holder: empViewHolder, position: Int) {
        val model = empList.get(position)
        holder.emptxtId.text = empList[position].id.toString()
        holder.emptxtName.text = empList[position].name
        holder.emptxtAddress.text = empList[position].address
        holder.emptxtMobileNo.text = empList[position].mobileNo.toString()
        holder.empImageView.setImageResource(empList[position].image)
        holder.emptxtSalary.text=empList[position].salary
        holder.itemView.setOnClickListener({
            Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
            var intent = Intent(context, DetailActivity::class.java)

            intent.putExtra("id", model.id)
            intent.putExtra("Name", model.name)
            intent.putExtra("Address", model.address)
            intent.putExtra("Mobile", model.mobileNo)
            intent.putExtra("image",model.image)
            intent.putExtra("Salary",model.salary)

            context.startActivity(intent)


        })
    }

    override fun getItemCount(): Int {
        return empList.size
    }

    class empViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var emptxtId = itemView.findViewById<TextView>(R.id.txt_id)
        var emptxtName = itemView.findViewById<TextView>(R.id.txt_name)
        var emptxtAddress = itemView.findViewById<TextView>(R.id.txt_address)
        var emptxtMobileNo = itemView.findViewById<TextView>(R.id.txt_mobileNo)
        var empImageView=itemView.findViewById<ImageView>(R.id.image_view)
        var emptxtSalary = itemView.findViewById<TextView>(R.id.txt_salary_custom)



    }


//    interface OnItemClickInterface{
//        fun onClick(position: Int)
//jjhjjhjkjkjkkk
//    }
//
//    fun setOnClickListener(onItemClickInterface: MainActivity){
//        this.onItemClickInterface=onItemClickInterface
//    }

}