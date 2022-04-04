package com.jsstech.testdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtUserName: EditText
    lateinit var edtUserPass: EditText
    lateinit var btnSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        edtUserName = findViewById(R.id.et_user_name)
        edtUserPass = findViewById(R.id.et_user_pass)
        btnSubmit = findViewById(R.id.bt_submit)
        btnSubmit.setOnClickListener({
            if (edtUserName.text.isNullOrBlank() && edtUserPass.text.isNullOrBlank()) {
                Toast.makeText(this, "Please Enter the value", Toast.LENGTH_SHORT).show()


            } else {
                Toast.makeText(
                    this,
                    "${edtUserName.text},${edtUserPass.text} is looged",
                    Toast.LENGTH_LONG
                ).show()
                var intent = Intent(this, EmployeeAct::class.java)
                startActivity(intent)
            }

        })
    }
}