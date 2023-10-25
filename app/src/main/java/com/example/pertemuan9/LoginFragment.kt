package com.example.pertemuan9

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import com.example.pertemuan9.databinding.ActivityHomeBinding
import com.example.pertemuan9.databinding.FragmentLoginBinding
import com.example.pertemuan9.registrasiFragment.Companion.password
import com.example.pertemuan9.registrasiFragment.Companion.username

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        with(binding) {
            btnLogin.setOnClickListener {
                val username = loginUsername.text.toString()
                val password = loginPassword.text.toString()

                if (username.isEmpty()) {
                    loginUsername.error = "Masukkan username"
                    return@setOnClickListener
                }

                if (password.isEmpty()) {
                    loginPassword.error = "Masukkan password"
                    return@setOnClickListener
                }

                if (!username.isEmpty() && !password.isEmpty()) {
                    val intent = Intent(this@LoginFragment.requireActivity(), HomeActivity::class.java)

                    loginUsername.text.clear()
                    loginPassword.text.clear()

                    binding.checkRemember.isChecked = false
                    startActivity(intent)

                }
            }
            // Set click listener for the "Register" text
            binding.textViewRegister.setOnClickListener {
                MainActivity.viewPager2a.setCurrentItem(0)
            }
            return binding.root
        }
    }
}

