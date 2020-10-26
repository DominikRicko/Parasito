package hr.ferit.dominikricko.parasito;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

import static com.google.android.material.tabs.TabLayout.MODE_SCROLLABLE;

public class HowToPlayPsionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater layoutInflater = getLayoutInflater();
        setContentView(layoutInflater.inflate(R.layout.tab_layout,null));


        CustomStuff.SetActionBar(this, getString(R.string.how_to_play_psion),30);

        TabLayout tableLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),MODE_SCROLLABLE);
        viewPager.setAdapter(myPagerAdapter);
        tableLayout.setupWithViewPager(viewPager);

        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING, 0,R.string.how_to_play_psion_general_tactic);
        myPagerAdapter.addPage(getString(R.string.general_tactics),new RecyclerViewFragment(myRecyclerAdapter));

        myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_psion_alignment);
        myPagerAdapter.addPage(getString(R.string.alignment),new RecyclerViewFragment(myRecyclerAdapter));

        myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_psion_abilities);
        myPagerAdapter.addPage(getString(R.string.abilities),new RecyclerViewFragment(myRecyclerAdapter));

        myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_psion_tips);
        myPagerAdapter.addPage(getString(R.string.abilities),new RecyclerViewFragment(myRecyclerAdapter));

        CustomStuff.ApplyTabTitleStyle(this,tableLayout);
    }
}
