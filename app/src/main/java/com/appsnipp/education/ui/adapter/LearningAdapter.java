

package com.appsnipp.education.ui.adapter;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appsnipp.education.ImageLoad;
import com.appsnipp.education.R;
import com.appsnipp.education.RData;

import java.util.List;
import java.util.Locale;

import io.realm.RealmResults;

public class LearningAdapter extends RecyclerView.Adapter<LearningAdapter.LearningViewHolder>{

    Context ctx;
    RealmResults<RData> list;

    public LearningAdapter(Context ctx, RealmResults<RData> list) {
        this.ctx = ctx;
        this.list = list;
    }

    @NonNull
    @Override
    public LearningAdapter.LearningViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater2 = LayoutInflater.from(ctx);
        View view2 = inflater2.inflate(R.layout.card_stack_view_layout , null);
        return new LearningAdapter.LearningViewHolder(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull LearningViewHolder holder, int position) {

        RData obj = list.get(position);
        holder.text.setText(obj.getWord().toUpperCase());
        new ImageLoad(obj.getImglink(),holder.image).execute();

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LearningViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView text;
        Button spell;
        TextToSpeech tts;
        String s;
        public LearningViewHolder(@NonNull View itemView) {

            super(itemView);
            image=itemView.findViewById(R.id.learning_stack_image);
            text=itemView.findViewById(R.id.learning_stack_word);
            spell=itemView.findViewById(R.id.spell);
            tts= new TextToSpeech(ctx.getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int i) {
                    if(i != TextToSpeech.ERROR)
                        tts.setLanguage(Locale.US);
                }
            });

            spell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    s=String.valueOf(text.getText());
                    for (int i=0;i<s.length();i++)
                    {
                        tts.speak(String.valueOf(s.charAt(i)),TextToSpeech.QUEUE_FLUSH,null);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                    Toast.makeText(ctx.getApplicationContext(),s,Toast.LENGTH_LONG).show();
                    tts.speak(s,TextToSpeech.QUEUE_FLUSH,null);


                }
            });
        }

    }
}
