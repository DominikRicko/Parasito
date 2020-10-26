package hr.ferit.dominikricko.parasito;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomStuff.SetActionBar(this,getString(R.string.app_name),30);

        RecyclerView mainMenuRecycler = findViewById(R.id.rv_mainMenu);
        mainMenuRecycler.setLayoutManager(new LinearLayoutManager(this));
        MainMenuRecyclerAdapter mainMenuAdapter =  new MainMenuRecyclerAdapter(this);
        mainMenuRecycler.setAdapter(mainMenuAdapter);

        mainMenuAdapter.addData(getString(R.string.for_new_players), ForNewPlayersActivity.class);
        mainMenuAdapter.addData(getString(R.string.how_to_play_human), HowToPlayHumanActivity.class);
        mainMenuAdapter.addData(getString(R.string.how_to_play_alien), HowToPlayAlienActivity.class);
        mainMenuAdapter.addData(getString(R.string.how_to_play_psion), HowToPlayPsionActivity.class);
        mainMenuAdapter.addData(getString(R.string.how_to_play_android), HowToPlayAndroidActivity.class);
        mainMenuAdapter.addData(getString(R.string.how_to_play_syndicate), HowToPlaySyndicateActivity.class);
    }
}
