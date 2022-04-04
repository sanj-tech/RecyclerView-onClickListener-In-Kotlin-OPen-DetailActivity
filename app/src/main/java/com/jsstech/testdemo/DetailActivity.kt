package com.jsstech.testdemo

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    lateinit var showQualification:Button
    lateinit var alertdialog:AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initView()
        initListener()

    }

    private fun initListener() {
        showQualification=findViewById(R.id.bt_qualication)

        showQualification.setOnClickListener({
            var dialog=AlertDialog.Builder(this)
            dialog.setView(R.layout.pop_up_layout)
            dialog.setPositiveButton("Ok") { dialogInterface: DialogInterface, i: Int ->
                var intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
            //Toast.makeText(baseContext,"",Toast.LENGTH_LONG).show()


            alertdialog=dialog.create()
            alertdialog.setCancelable(true)
           // alertdialog.setMessage("Here is your Educational Details"
            alertdialog.show()

        })
    }

    private fun initView() {


        var intent = intent
        var id = intent.getIntExtra("id", 0)
        var name = intent.getStringExtra("Name")
        var address = intent.getStringExtra("Address")
        var mobile = intent.getIntExtra("Mobile", 0)
        var image=intent.getIntExtra("image",0)
        var Sal=intent.getStringExtra("Salary")


        var txtDtId = findViewById<TextView>(R.id.txtId_detail)
        var txtDtName = findViewById<TextView>(R.id.txtName_detail)
        var txtDtAddress = findViewById<TextView>(R.id.txtAddress_detail)
        var txtDtMobileNo = findViewById<TextView>(R.id.txt_mobileNo_detail)
        var dImage=findViewById<ImageView>(R.id.detail_img)
        var txtDtSal = findViewById<TextView>(R.id.txt_salary_detail)

        txtDtId.text = id.toString()
        txtDtName.text = name
        txtDtAddress.text = address
        txtDtMobileNo.text = mobile.toString()
        dImage.setImageResource(image)
        txtDtSal.text=Sal
    }
}

