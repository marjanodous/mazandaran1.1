package com.example.mazandaran;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

public class tabs extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    public static String Transaction_type;
    public static boolean flag_tarikhche,flag_marasem, flag_akhlaqi, flag_eteqadat, flag_makan_ziarati,flag_qaza, flag_shirini, flag_ahang, flag_film = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        toolbar=findViewById(R.id.toolbar);
        //for tab
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);


        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        adapter.addFrg(new tarikhche(), "گذري بر فرهنگ مازندران");
        adapter.addFrg(new marasem(), "آداب و رسوم مازندران");
        adapter.addFrg(new akhlaqi(), "خصوصیات اخلاقی مازندران");
        adapter.addFrg(new eteqadat(), "اعتقاد و باورهای مردم مازندران");
        adapter.addFrg(new makan_ziarati(), "مکان های زیارتی  مازندران");
        adapter.addFrg(new qaza(), "غذاهای محلی مازندران ");
        adapter.addFrg(new shirini(), "شیرینی های محلی مازندران");
        adapter.addFrg(new ahang(), "آهنگ های محلی مازندران");
        adapter.addFrg(new film(), "فیلم محلی مازندران");
        viewPager.setAdapter(adapter);

        if (tabLayout.getSelectedTabPosition() == 0) {
            Transaction_type = ChosoeTabs.getChooseTab_tarikhche();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.green));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.colorPrimaryDark));
        } else if (tabLayout.getSelectedTabPosition() == 2) {
            Transaction_type = ChosoeTabs.getChooseTab_marasem();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.yellow_dark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.yellow));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.yellow_dark));
        } else if (tabLayout.getSelectedTabPosition() == 1) {
            Transaction_type = ChosoeTabs.getChooseTab_akhlaqi();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.blue_dark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.blue));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.blue_dark));
        } else if (tabLayout.getSelectedTabPosition() == 3) {
            Transaction_type = ChosoeTabs.getChooseTab_eteqadat();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.purple_dark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.purple));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.purple_dark));
        } else if (tabLayout.getSelectedTabPosition() == 4) {
            Transaction_type = ChosoeTabs.getChooseTab_makan_ziarati();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark2));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.colorPrimary));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.colorPrimaryDark2));
        } else if (tabLayout.getSelectedTabPosition() == 5) {
            Transaction_type = ChosoeTabs.getChooseTab_qaza();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.orange_dark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.orange));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.orange_dark));


        } else if (tabLayout.getSelectedTabPosition() == 6) {
            Transaction_type = ChosoeTabs.getChooseTab_shirini();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.red_dark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.red));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.red_dark));
        } else if (tabLayout.getSelectedTabPosition() == 7) {
            Transaction_type = ChosoeTabs.getChooseTab_ahang();
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.pink_dark));
            toolbar.setBackgroundColor(ContextCompat.getColor(tabs.this,
                    R.color.pink));
//            tabLayout.setBackgroundColor(ContextCompat.getColor(tabs.this,
//                    R.color.red));
            tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(tabs.this,
                    R.color.pink_dark));
        } else if (tabLayout.getSelectedTabPosition() == 8) {
            Transaction_type = ChosoeTabs.getChooseTab_film();
        }
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    public void setTab() {
        if (flag_tarikhche) {
            viewPager.setCurrentItem(0);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_marasem) {
            viewPager.setCurrentItem(2);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_akhlaqi) {
            viewPager.setCurrentItem(3);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_eteqadat) {
            viewPager.setCurrentItem(4);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_makan_ziarati) {
            viewPager.setCurrentItem(5);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_qaza) {
            viewPager.setCurrentItem(6);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_shirini) {
            viewPager.setCurrentItem(7);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_ahang) {
            viewPager.setCurrentItem(8);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }
        if (flag_film) {
            viewPager.setCurrentItem(9);
            flag_tarikhche = false;
            flag_marasem = false;
            flag_akhlaqi = false;
            flag_eteqadat = false;
            flag_makan_ziarati = false;
            flag_qaza = false;
            flag_shirini = false;
            flag_ahang = false;
            flag_film = false;
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
        setTab();

    }
}
