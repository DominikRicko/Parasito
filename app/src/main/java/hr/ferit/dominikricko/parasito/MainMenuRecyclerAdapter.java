package hr.ferit.dominikricko.parasito;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainMenuRecyclerAdapter extends RecyclerView.Adapter<MainMenuButton> implements MainMenuClickListener{

    private List<String> names = new ArrayList<>();
    private List<Class> activityClasses =  new ArrayList<>();
    private Context activityContext;

    MainMenuRecyclerAdapter(Context whatActivity){
        this.activityContext = whatActivity;
    }

    @NonNull
    @Override
    public MainMenuButton onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cellView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.main_menu_button, parent, false);
        return new MainMenuButton(cellView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuButton holder, int position) {
        holder.setName(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    void addData(String buttonName, Class activityClass){
        names.add(buttonName);
        activityClasses.add(activityClass);
        notifyItemInserted(names.size());
    }

    @Override
    public void onButtonClick(int position) {
        Intent intent = new Intent(activityContext, activityClasses.get(position));
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        activityContext.startActivity(intent);
    }
}
