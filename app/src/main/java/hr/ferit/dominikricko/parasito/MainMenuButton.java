package hr.ferit.dominikricko.parasito;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MainMenuButton extends RecyclerView.ViewHolder implements View.OnClickListener{

    private Button button;
    private MainMenuClickListener clickListener;

    MainMenuButton(@NonNull View itemView, MainMenuClickListener whatClickListener) {
        super(itemView);
        button = itemView.findViewById(R.id.btnMainMenu);
        button.setOnClickListener(this);
        this.clickListener = whatClickListener;
    }

    void setName(String name){
        button.setText(name);
    }

    @Override
    public void onClick(View v) {
        clickListener.onButtonClick(getAdapterPosition());
    }
}
