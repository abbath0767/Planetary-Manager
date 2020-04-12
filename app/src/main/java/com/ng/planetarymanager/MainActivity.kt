package com.ng.planetarymanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter
import com.ng.planetarymanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomNav: AHBottomNavigation
    private val tabManager = TabManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNav()
    }

    private fun initBottomNav() {
        bottomNav = binding.mainBottomBar.apply {
            titleState = AHBottomNavigation.TitleState.ALWAYS_SHOW

            setOnTabSelectedListener { pos, wasSelect ->
                if (!wasSelect) showFragment(pos, currentItem)
                true
            }

            setCurrentItem(0, false)
        }
        AHBottomNavigationAdapter(this, R.menu.main_bottom_menu).apply {
            setupWithBottomNavigation(bottomNav)
        }
        setUpFragmentManager()
    }

    private fun showFragment(newPos: Int, oldPos: Int) {
        supportFragmentManager.beginTransaction()
            .hide(tabManager.getFragment(oldPos))
            .show(tabManager.getFragment(newPos))
            .commit()
    }

    private fun setUpFragmentManager() {
        supportFragmentManager.beginTransaction()
            .add(R.id.main_screen_container, tabManager.getFragment(0), tabManager.getKey(0))
            .add(R.id.main_screen_container, tabManager.getFragment(1), tabManager.getKey(0))
            .add(R.id.main_screen_container, tabManager.getFragment(2), tabManager.getKey(0))
            .add(R.id.main_screen_container, tabManager.getFragment(3), tabManager.getKey(0))
            .add(R.id.main_screen_container, tabManager.getFragment(4), tabManager.getKey(0))
            .hide(tabManager.getFragment(1))
            .hide(tabManager.getFragment(2))
            .hide(tabManager.getFragment(3))
            .hide(tabManager.getFragment(4))
            .commitNow()
    }
}
