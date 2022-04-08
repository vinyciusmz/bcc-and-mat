package br.senac.aula09examples.toolbarmenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula09examples.databinding.ActivityToolbarMenuBinding

class ToolbarMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityToolbarMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}