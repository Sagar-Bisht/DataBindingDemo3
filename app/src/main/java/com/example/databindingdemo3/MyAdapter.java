package com.example.databindingdemo3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingdemo3.databinding.SingleRowDesignBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    List<Student> slist ;
    public  MyAdapter( List<Student> slist){
        this.slist = slist ;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SingleRowDesignBinding binding = SingleRowDesignBinding.inflate(inflater ,parent,false);

        return new MyViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Student sCurrent = slist.get(position);
        holder.singleRowDesignBinding.setStudentobject(sCurrent);
    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        SingleRowDesignBinding singleRowDesignBinding ;
        public MyViewHolder(@NonNull SingleRowDesignBinding singleRowDesignBinding) {
            super(singleRowDesignBinding.getRoot());
            this.singleRowDesignBinding = singleRowDesignBinding ;
        }
    }
}
