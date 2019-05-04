package com.example.vollyhomworktwo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>{
    List<Persons> persons;
    Context context;

    public MyAdapter(List<Persons> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.persons_layout,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder myViewHolder, int i) {
        Persons person = persons.get(i);
        myViewHolder.textViewFname.setText(person.getfName());
        myViewHolder.textViewLname.setText(person.getlName());
        myViewHolder.textViewAge.setText(person.getAge());

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewFname, textViewLname, textViewAge;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewFname = itemView.findViewById(R.id.textViewFname);
            textViewLname = itemView.findViewById(R.id.textViewLname);
            textViewAge = itemView.findViewById(R.id.textViewAge);
        }
    }
}
