package hr.ferit.dominikricko.parasito;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerContent extends RecyclerView.ViewHolder{

    TextView tvTitle;
    ImageView ivImage;
    TextView tvParagraph;

    public RecyclerContent(@NonNull View itemView){
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        ivImage = itemView.findViewById(R.id.ivImage);
        tvParagraph = itemView.findViewById(R.id.tvParagraph);
    }

    public void setTitle(String title, int color){ tvTitle.setText(title); tvTitle.setTextColor(color);}
    public void setImage(int imageID){ivImage.setImageResource(imageID);}
    public void setParagraph(String paragraph){tvParagraph.setText(paragraph);}

}
