package hr.ferit.dominikricko.parasito;

import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;


public class CustomStuff {

    public static void SetActionBar(AppCompatActivity activity, String title, float textSize){

        LayoutInflater layoutInflater = activity.getLayoutInflater();
        TextView v = (TextView) layoutInflater.inflate(R.layout.custom_text_view,null);
        v.setText(title);
        v.setTextSize(textSize);

        ActionBar ab = activity.getSupportActionBar();
        ab.setDisplayShowTitleEnabled(false);
        ab.setDisplayShowCustomEnabled(true);
        ab.setCustomView(v);

    }

    public static void ApplyTabTitleStyle(AppCompatActivity activity, TabLayout tabLayout){
        LayoutInflater LL = LayoutInflater.from(activity);
        for(int i = 0; i < tabLayout.getTabCount();i++){
            TabLayout.Tab t = tabLayout.getTabAt(i);
            CharSequence title = t.getText();
            TextView v = (TextView) LL.inflate(R.layout.custom_text_view,null);
            v.setText(title);
            t.setCustomView(v);
        }
    }
}
