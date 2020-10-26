package hr.ferit.dominikricko.parasito;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerContent>{

    public static final int NOTHING = 0;

    private Context context;
    private List<Integer> titleIDs =  new ArrayList<>();
    private List<Integer> titleColorIds = new ArrayList<>();
    private List<Integer> imageIDs =  new ArrayList<>();
    private List<Integer> paragraphIDs =  new ArrayList<>();

    MyRecyclerAdapter(Context whatContext){context = whatContext;}

    @NonNull
    @Override
    public RecyclerContent onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cellView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recycler_content,parent,false);
        return new RecyclerContent(cellView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerContent holder, int position) {
        if(titleIDs.get(position) != NOTHING) holder.setTitle(context.getString(titleIDs.get(position)),context.getResources().getColor(titleColorIds.get(position)));
        holder.setImage(imageIDs.get(position));
        if(paragraphIDs.get(position) != NOTHING) holder.setParagraph(context.getString(paragraphIDs.get(position)));

    }

    @Override
    public int getItemCount() {
        return titleIDs.size();
    }

    void addData(int titleStringID, int titleColorID, @Nullable int imageID, int paragraphStringID){

        titleIDs.add(titleStringID);
        titleColorIds.add(titleColorID);
        imageIDs.add(imageID);
        paragraphIDs.add(paragraphStringID);
        notifyItemInserted(titleIDs.size() - 1);
    }
}
