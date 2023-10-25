package com.example.pertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import com.example.pertemuan9.MainActivity.Companion.viewPager2a


class registrasiFragment : Fragment() {
    companion object {
        var username = ""
        var password = ""
        var email = ""
        var phone = ""
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registrasi, container, false)

        val inputUsername = view.findViewById<EditText>(R.id.input_username)
        val inputPassword = view.findViewById<EditText>(R.id.input_password)
        val inputPhone = view.findViewById<EditText>(R.id.input_phone)
        val inputEmail = view.findViewById<EditText>(R.id.input_email)

        view.findViewById<View>(R.id.btn_register).setOnClickListener(){
            if (inputUsername.text.toString().isEmpty()) {
                view.findViewById<EditText>(R.id.input_username).error = "Masukkan username"
                return@setOnClickListener
            }

            if (inputEmail.text.toString().isEmpty()) {
                view.findViewById<EditText>(R.id.input_email).error = "Masukkan email"
                return@setOnClickListener

            }

            if (inputPhone.text.toString().isEmpty()) {
                view.findViewById<EditText>(R.id.input_phone).error = "Masukkan phone"
                return@setOnClickListener
            }
                if (inputPassword.text.toString().isEmpty()) {
                    view.findViewById<EditText>(R.id.input_password).error = "Masukkan password"
                    return@setOnClickListener
            }

            username = inputUsername.text.toString()
            password = inputPassword.text.toString()
            phone = inputPhone.text.toString()
            email = inputEmail.text.toString()

            inputUsername.text.clear()
            inputPassword.text.clear()
            inputEmail.text.clear()
            inputPhone.text.clear()

            with(view){
                findViewById<CheckBox>(R.id.check_agree).isChecked = false
            }

            viewPager2a.setCurrentItem(1)
        }

        view.findViewById<View>(R.id.text_view_login).setOnClickListener(){
            viewPager2a.setCurrentItem(1)
        }

        return view
    }
}



