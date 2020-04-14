package com.example.recyclerview25022020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ItemViewHolder> {
   private  ArrayList<User> mArrayUsers;

    public UserAdapter() {
        mArrayUsers = new ArrayList<>();
    }

    public void submitData(ArrayList<User> arrayUsers) {
        if (arrayUsers != null) {
            mArrayUsers.clear();
            mArrayUsers.addAll(arrayUsers);
            notifyDataSetChanged();
        }
    }

    public void addItem(User user) {
        if (user != null) {
            mArrayUsers.add(user);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override

    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_user, null, true);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        User user = mArrayUsers.get(position);
        holder.mImage.setImageResource(user.getImage());
        holder.mTvname.setText(user.getName());
        holder.mTvage.setText(String.valueOf(user.getAge()));
    }

    @Override
    public int getItemCount() {
        return mArrayUsers.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage ;
        TextView mTvname, mTvage;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.imageview);
            mTvname = itemView.findViewById(R.id.textviewName);
            mImage = itemView.findViewById(R.id.textviewAge);
        }
    }
}
