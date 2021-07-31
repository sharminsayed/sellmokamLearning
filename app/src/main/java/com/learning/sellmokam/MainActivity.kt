package com.learning.sellmokam


import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.learning.sellmokam.authentication.ProfileFragment
import com.learning.sellmokam.chat.MessageFragment
import com.learning.sellmokam.home.HomeFragment
import com.learning.sellmokam.settings.SettingsFragment


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var bottomNavigationView: BottomNavigationView? = null
    var navController: NavController? = null
    lateinit var floatingActionButton: FloatingActionButton
    var toolbar: Toolbar? = null
    var actionBar: ActionBar? = null
    lateinit var bottomNavigation: MeowBottomNavigation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeItem()
        handleBottomNavigation()
    }
    private fun initializeItem() {
        toolbar = findViewById<View>(R.id.toolbar) as Toolbar

    }


    private fun handleBottomNavigation() {
        bottomNavigation = findViewById(R.id.bnv_Main)
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_baseline_home_24))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_baseline_chat_24))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_baseline_settings_24))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ic_baseline_person_24))
        bottomNavigation.show(1,true);
        replace(HomeFragment())
        bottomNavigation.setOnClickMenuListener { model: MeowBottomNavigation.Model ->
            when (model.id) {
                1 -> replace(HomeFragment())
                2 -> replace(MessageFragment())
                3 -> replace(SettingsFragment())
                4 -> replace(ProfileFragment())

            }

        }
        bottomNavigation.setCount(2, 0.toString())
      //  bottomNavigation.clearCount(2)




    }



 /*   private fun handleDrawerActionBar() {
        setSupportActionBar(toolbar)
        actionBar = supportActionBar
        actionBar!!.setDisplayShowTitleEnabled(false)
        actionBar!!.setDisplayShowHomeEnabled(false)
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.isDrawerIndicatorEnabled = false
        toggle.toolbarNavigationClickListener =
            View.OnClickListener { drawer.openDrawer(GravityCompat.START) }
       // toggle.setHomeAsUpIndicator(R.drawable.ic_drawer_menu)
        toggle.syncState()
      //  val navigationView = findViewById<View>(R.id.side_nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }*/

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
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
       /* if (id == R.id.notification) {
            // do something here for go to notification page
        }*/
        return super.onOptionsItemSelected(item)
    }
    private fun replace(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)
        transaction.commit()
    }
}