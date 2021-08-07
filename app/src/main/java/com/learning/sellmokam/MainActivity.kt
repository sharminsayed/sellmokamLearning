package com.learning.sellmokam


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.google.android.material.navigation.NavigationView
import com.learning.sellmokam.chat.MessageFragment
import com.learning.sellmokam.home.HomeFragment
import com.learning.sellmokam.post.CreatePostFragment
import com.learning.sellmokam.profile.ProfileFragment


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

   private lateinit var drawer: DrawerLayout



    private  lateinit var bottomNavigation: MeowBottomNavigation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawer=findViewById(R.id.drawer_layout)
        handleBottomNavigation()
        handleDrawerActionBar()

    }


    private fun handleBottomNavigation() {
        bottomNavigation = findViewById(R.id.bnv_Main)
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_baseline_home_24))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_baseline_chat_24))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_baseline_create_24))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ic_baseline_person_24))
        bottomNavigation.show(1,true)
        replace(HomeFragment())
        bottomNavigation.setOnClickMenuListener { model: MeowBottomNavigation.Model ->
            when (model.id) {
                1 -> replace(HomeFragment())
                2 -> replace(MessageFragment())
                3 -> replace(CreatePostFragment())
                4 -> replace(ProfileFragment())

            }

        }
        bottomNavigation.setCount(2, 0.toString())
      //  bottomNavigation.clearCount(2)




    }


      fun handleDrawerActionBar() {
          val toolbar: Toolbar = findViewById(R.id.toolbar)
          setSupportActionBar(toolbar)
          supportActionBar!!.setDisplayShowTitleEnabled(false)
          supportActionBar!!.setDisplayShowHomeEnabled(false)
          toolbar.inflateMenu(R.menu.main)
          val toggle = ActionBarDrawerToggle(
              this,
              drawer,
              toolbar,
              R.string.navigation_drawer_open,
              R.string.navigation_drawer_close
          )
          drawer.addDrawerListener(toggle)
          toggle.isDrawerIndicatorEnabled = false
          toggle.setHomeAsUpIndicator(R.drawable.ic_nav)
          toggle.toolbarNavigationClickListener =
              View.OnClickListener { drawer.openDrawer(GravityCompat.START) }

          toggle.syncState()
          val navigationView = findViewById<NavigationView>(R.id.side_nav_view) as NavigationView
          navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")

        // Handle navigation view item clicks here.
        val id = item.itemId
        /* if (id == R.id.nav_coupon) {
            Navigation.findNavController(MainActivity.this, R.id.mainlayout).navigate(R.id.CouponFragment);

        } else if (id == R.id.nav_chat) {
            Navigation.findNavController(this, R.id.mainlayout).navigate(R.id.conversationFragment);

        } else if (id == R.id.nav_share) {
            shareApp();

        } else if (id == R.id.nav_call) {
            Navigation.findNavController(this, R.id.mainlayout).navigate(R.id.contact);

        } else if (id == R.id.nav_aboutUs) {
            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {
            sharedPrefUtils.clearToken();
            Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_policy) {
            Intent intent = new Intent(getApplicationContext(), TermsAndConditionActivity.class);
            startActivity(intent);
        }*/
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPointerCaptureChanged(hasCapture: Boolean) {}

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)


        }
    }
    private fun replace(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)
        transaction.commit()
    }
}
