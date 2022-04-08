package br.senac.aula09examples.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula09examples.databinding.ActivityBottomNavigationBinding

class BottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}