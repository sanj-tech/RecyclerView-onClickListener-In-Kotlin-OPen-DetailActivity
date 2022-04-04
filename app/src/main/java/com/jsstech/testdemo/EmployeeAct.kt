package com.jsstech.testdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmployeeAct : AppCompatActivity() {
    lateinit var empRecv: RecyclerView
    var empList: MutableList<empDataModel> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)
        initView()
    }

    private fun initView() {
        empRecv = findViewById(R.id.emp_recv)
        empList.add(empDataModel(1111, "Anupama", "Mumbai", 655687768,R.drawable.logo,"55678"))
        empList.add(empDataModel(1112, "Priya", "Pune", 978655768,R.drawable.logo,"8000"))
        empList.add(empDataModel(1113, "Priyam", "Mumbai", 67655768,R.drawable.logo,"70000"))
        empList.add(empDataModel(1114, "Priyanshu", "Khopoli", 45655768,R.drawable.yoma,"65908"))
        empList.add(empDataModel(1115, "Priyanka", "Kolhapur", 89655768,R.drawable.logo,"70000"))
        empList.add(empDataModel(1116, "Sanj", "Nigadi", 98655768,R.drawable.logo,"70000"))
        empList.add(empDataModel(1117, "Aniket", "Ambernath", 78655768,R.drawable.yoma,"70000"))
        empList.add(empDataModel(1118, "Amit", "Mumbai", 90655768,R.drawable.logo,"70000"))
        empList.add(empDataModel(1119, "Ashnu", "Mumbai", 99655768,R.drawable.yoma,"70000"))
        empList.add(empDataModel(11110, "Abilasha", "Mumbai", 98655768,R.drawable.logo,"70000"))
        empList.add(empDataModel(11111, "Ankit", "Solapur", 97655768,R.drawable.yoma,"70000"))
        empList.add(empDataModel(11112, "aayush", "GandhiNager", 77655768,R.drawable.yoma,"70000"))

        var myAdapter = EmpAdapter(this, empList)
        empRecv.layoutManager = LinearLayoutManager(this)
        empRecv.adapter = myAdapter
    }
}