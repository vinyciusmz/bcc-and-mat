package br.senac.aula09examples.toolbarmenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula09examples.R
import br.senac.aula09examples.databinding.ActivityToolbarMenuBinding
import br.senac.aula09examples.fragments.AlbumsFragment
import br.senac.aula09examples.fragments.ArtistsFragment
import br.senac.aula09examples.fragments.RecentsFragment

class ToolbarMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityToolbarMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.artistas -> {
                val frag = ArtistsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            R.id.albuns -> {
                val frag = AlbumsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            else -> {
                val frag = RecentsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}