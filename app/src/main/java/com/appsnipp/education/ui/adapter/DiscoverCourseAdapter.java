



package com.appsnipp.education.ui.adapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appsnipp.education.LearningActivity;
import com.appsnipp.education.R;
import com.appsnipp.education.ui.model.MatchCourse;

import java.util.List;


public class DiscoverCourseAdapter extends RecyclerView.Adapter<DiscoverCourseAdapter.DiscoverHolder>{
    Context ctx;
    List<MatchCourse> course_list;

    public DiscoverCourseAdapter(Context ctx, List<MatchCourse> course_list) {
        this.ctx=ctx;
        this.course_list=course_list;

    }

    @NonNull
    @Override
    public DiscoverCourseAdapter.DiscoverHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater2 = LayoutInflater.from(ctx);
        View view2 = inflater2.inflate(R.layout.discover_card , null);
        return new DiscoverHolder(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoverHolder holder, int position) {
        MatchCourse matchCourse = course_list.get(position);
        Drawable d = ctx.getResources().getDrawable(matchCourse.getImageResource());
        Drawable d2 = ctx.getResources().getDrawable(matchCourse.getImageResource2());
        holder.imageView.setImageDrawable(d);
        holder.courseName.setText(matchCourse.getName());
        holder.caption.setText(matchCourse.getNumberOfCourses());
        holder.fun.setImageDrawable(d2);
        holder.id.setText(String.valueOf(matchCourse.getId()));
        holder.img_id.setText(String.valueOf(matchCourse.getImageResource2()));
    }

    @Override
    public int getItemCount() {
        return course_list.size();
    }


    class DiscoverHolder extends RecyclerView.ViewHolder {

        TextView courseName,caption,id,img_id;
        ImageView imageView,fun;
        public DiscoverHolder(@NonNull View itemView) {
            super(itemView);
            courseName= itemView.findViewById(R.id.course_name);
            caption = itemView.findViewById(R.id.caption);
            imageView=itemView.findViewById(R.id.discover_image);
            fun=itemView.findViewById(R.id.fun_image);
            id=itemView.findViewById(R.id.course_id);
            img_id=itemView.findViewById(R.id.img_id);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(ctx, LearningActivity.class);
                    String s=id.getText().toString();
                    String s2=img_id.getText().toString();
                    i.putExtra("ID",Integer.parseInt(s));
                    i.putExtra("pic",Integer.parseInt(s2));
                    ctx.startActivity(i);

                }
            });
        }
    }
}
