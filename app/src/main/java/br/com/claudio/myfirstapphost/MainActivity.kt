package br.com.claudio.myfirstapphost

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.homemodule.HomeActivity
import br.com.claudio.myfirstapphost.databinding.ActivityMainBinding
import br.com.claudio.validation_utils.Utils

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btNavigate.setOnClickListener {
            if(Utils.isValidCPF(binding.edtCpf.text.toString())) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "CPF inválido", Toast.LENGTH_LONG).show()
            }
        }
    }
}