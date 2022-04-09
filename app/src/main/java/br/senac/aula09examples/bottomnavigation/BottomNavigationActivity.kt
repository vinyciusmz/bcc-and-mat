package br.senac.aula09examples.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula09examples.R
import br.senac.aula09examples.databinding.ActivityBottomNavigationBinding
import br.senac.aula09examples.fragments.AlbumsFragment
import br.senac.aula09examples.fragments.ArtistsFragment
import br.senac.aula09examples.fragments.RecentsFragment

class BottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
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
            
            true
        }
    }

}