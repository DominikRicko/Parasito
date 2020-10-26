package hr.ferit.dominikricko.parasito;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> pages = new ArrayList<>();;
    private List<String> pageTitles = new ArrayList<>();;

    MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position > pages.size() || position < 0)
            throw new IllegalArgumentException("Position cannot be lower than 0 or higher or equal to the amount of data stored in the Adapter.");

        return pages.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }

    public void addPage(String title, Fragment whatFragment){
        pages.add(whatFragment);
        pageTitles.add(title);
        notifyDataSetChanged();
    }
}
