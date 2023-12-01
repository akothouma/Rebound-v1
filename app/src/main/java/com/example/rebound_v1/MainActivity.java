 package com.example.rebound_v1;

import static com.google.android.material.navigation.NavigationBarView.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

 public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {
     FragmentManager fragmentManager;
     NavigationBarView bottomNavigationBarView;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         bottomNavigationBarView = findViewById(R.id.bottom_navigation);

         if (savedInstanceState == null) {
             fragmentManager = getSupportFragmentManager();
             fragmentManager.beginTransaction()
                     .replace(R.id.fragmentlayout, PotentialBusiness.class, null)
                     .setReorderingAllowed(true)
                     .addToBackStack(null)
                     .commit();
         }
     }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.bottom_navigation_menu,menu);
         return true;
     }

     @Override
     public boolean onNavigationItemSelected(@NonNull MenuItem item) {
         if (item.getItemId() == R.id.potentialbusiness) {
            fragmentManager.beginTransaction()
                     .replace(R.id.fragmentlayout, PotentialBusiness.class,null)
                     .setReorderingAllowed(true)
                     .commit();

             // Respond to navigation item 1 click
             return true;
         }
         if (item.getItemId() == R.id.current_listings) {
             fragmentManager.beginTransaction()
                     .replace(R.id.fragmentlayout, Currentlistings.class,null)
                     .setReorderingAllowed(true)
                     .commit();
             // Respond to navigation item 2 click
             return true;
         }
         if (item.getItemId() == R.id.addlisting) {
             fragmentManager.beginTransaction()
                     .replace(R.id.fragmentlayout, Addlisting.class,null)
                     .setReorderingAllowed(true)
                     .commit();
             // Respond to navigation item 3 click
             return true;
         }
         return false;
     }


 }





