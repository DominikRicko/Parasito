package hr.ferit.dominikricko.parasito;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.material.tabs.TabLayout;

import static com.google.android.material.tabs.TabLayout.MODE_SCROLLABLE;

public class HowToPlaySyndicateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = getLayoutInflater();
        setContentView(layoutInflater.inflate(R.layout.tab_layout,null));

        CustomStuff.SetActionBar(this,getString(R.string.how_to_play_syndicate),25);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),MODE_SCROLLABLE);
        viewPager.setAdapter(myPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_syndicate_early_game);
        myPagerAdapter.addPage(getString(R.string.early_game),new RecyclerViewFragment(myRecyclerAdapter));

        myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_syndicate_general_tactic);
        myPagerAdapter.addPage(getString(R.string.general_tactics),new RecyclerViewFragment(myRecyclerAdapter));

        myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_syndicate_sabotage);
        myPagerAdapter.addPage(getString(R.string.sabotage),new RecyclerViewFragment(myRecyclerAdapter));

        myRecyclerAdapter = new MyRecyclerAdapter(this);
        myRecyclerAdapter.addData(MyRecyclerAdapter.NOTHING,MyRecyclerAdapter.NOTHING,0,R.string.how_to_play_syndicate_tips);
        myPagerAdapter.addPage(getString(R.string.tips),new RecyclerViewFragment(myRecyclerAdapter));

        CustomStuff.ApplyTabTitleStyle(this,tabLayout);
    }
}
