package com.example.tutorfinder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tutorfinder.R;
import com.example.tutorfinder.models.Teacher;

import java.util.List;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder> {
    public TeacherAdapter(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    private List<Teacher> teachers;
    @NonNull
    @Override
    public TeacherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.row_teacher,parent,false);
        return new TeacherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherViewHolder holder, int position) {
        holder.bindItems(teachers.get(position));
    }

    @Override
    public int getItemCount() {
        return teachers.size();
    }

    public static class TeacherViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewName;
        TextView textViewDegree;
        TextView textViewExperience;
        TextView textViewCourse;
        TextView textViewReview;
        public TeacherViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textViewName=itemView.findViewById(R.id.textViewName);
            textViewDegree=itemView.findViewById(R.id.textViewDegree);
            textViewExperience=itemView.findViewById(R.id.textViewExperience);
            textViewCourse=itemView.findViewById(R.id.textViewCourse);
            textViewReview=itemView.findViewById(R.id.textViewReview);
        }

        public void bindItems(Teacher teacher){
            imageView.setImageDrawable(teacher.getImage());
            textViewName.setText(teacher.getName());
            textViewDegree.setText(teacher.getDegree());
            textViewExperience.setText(teacher.getExperience());
            textViewCourse.setText(teacher.getCourse());
            textViewReview.setText(teacher.getReview());

        }
    }
}
