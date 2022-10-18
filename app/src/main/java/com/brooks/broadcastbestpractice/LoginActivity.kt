package com.brooks.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
//import com.brooks.broadcastbestpractice.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener {
            val account = accountEdit.text.toString()
            val password = passwordEdit.text.toString()
            Log.d("账号和密码", "onCreate: $account $password  ")
            // 如果账号是admin且密码是123456，就认为登陆成功
            if (account == "admin" && password == "123456") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this, "account or password is invalid", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
