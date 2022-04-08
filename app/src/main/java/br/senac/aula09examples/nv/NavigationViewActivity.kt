package br.senac.aula09examples.nv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula09examples.databinding.ActivityNvBinding

class NavigationViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityNvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNvBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}