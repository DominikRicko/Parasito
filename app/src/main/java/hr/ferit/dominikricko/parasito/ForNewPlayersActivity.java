package hr.ferit.dominikricko.parasito;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.material.tabs.TabLayout;

import static com.google.android.material.tabs.TabLayout.MODE_SCROLLABLE;

public class ForNewPlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = getLayoutInflater();
        setContentView(layoutInflater.inflate(R.layout.tab_layout,null));

        CustomStuff.SetActionBar(this,getString(R.string.for_new_players),25);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),MODE_SCROLLABLE);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        pagerAdapter.addPage(getString(R.string.about), new LayoutFragment(R.layout.fragment_for_new_players_about));
        pagerAdapter.addPage(getString(R.string.modes), new LayoutFragment(R.layout.fragment_for_new_players_modes));

        MyRecyclerAdapter myAdapter = new MyRecyclerAdapter(this);
        myAdapter.addData(R.string.station,R.color.colorAccent,0,R.string.for_new_players_places_station);
        myAdapter.addData(R.string.level1,R.color.colorLevel1,R.drawable.level1,R.string.for_new_players_places_level1);
        myAdapter.addData(R.string.level2,R.color.colorLevel2,R.drawable.marshall,R.string.for_new_players_places_level2);
        myAdapter.addData(R.string.level3,R.color.colorLevel3,0,R.string.for_new_players_places_level3);
        myAdapter.addData(R.string.level4,R.color.colorLevel4,0,R.string.for_new_players_places_level4);
        myAdapter.addData(R.string.level5,R.color.colorLevel5,0,R.string.for_new_players_places_level5);
        myAdapter.addData(R.string.level6,R.color.colorLevel6,0,R.string.for_new_players_places_level6);
        myAdapter.addData(R.string.level7,R.color.colorLevel7,0,R.string.for_new_players_places_level7);
        myAdapter.addData(R.string.reactorLevel,R.color.colorReactorLevel,0,R.string.for_new_players_places_reactorLevel);
        myAdapter.addData(R.string.coreLevel,R.color.colorCoreLevel,0,R.string.for_new_players_places_theCore);
        myAdapter.addData(R.string.spaceWalk,R.color.colorSpaceWalk,0,R.string.for_new_players_places_spaceWalk);
        myAdapter.addData(R.string.vents,R.color.colorVents,0,R.string.for_new_players_places_ventilationShafts);
        myAdapter.addData(R.string.planet,R.color.colorPlanet,0,R.string.for_new_players_places_planet);
        myAdapter.addData(R.string.thor,R.color.colorThor,R.drawable.thor,R.string.for_new_players_places_thor);
        pagerAdapter.addPage(getString(R.string.places), new RecyclerViewFragment(myAdapter));

        myAdapter = new MyRecyclerAdapter(this);
        myAdapter.addData(R.string.DSM,R.color.colorLevel1,0,R.string.for_new_players_roles_DSM);
        myAdapter.addData(R.string.SG,R.color.colorLevel2,0,R.string.for_new_players_roles_SG);
        myAdapter.addData(R.string.Doc,R.color.colorLevel4,0,R.string.for_new_players_roles_Doc);
        myAdapter.addData(R.string.CWO,R.color.colorLevel5,0,R.string.for_new_players_roles_CWO);
        myAdapter.addData(R.string.CMO,R.color.colorLevel6,0,R.string.for_new_players_roles_CMO);
        myAdapter.addData(R.string.CIO,R.color.colorLevel3,0,R.string.for_new_players_roles_CIO);
        myAdapter.addData(R.string.Captain,R.color.colorLevel7,0,R.string.for_new_players_roles_Captain);
        myAdapter.addData(R.string.CEO,R.color.colorReactorLevel,0,R.string.for_new_players_roles_CEO);
        pagerAdapter.addPage(getString(R.string.sub_roles), new RecyclerViewFragment(myAdapter));

        CustomStuff.ApplyTabTitleStyle(this,tabLayout);
    }
}
