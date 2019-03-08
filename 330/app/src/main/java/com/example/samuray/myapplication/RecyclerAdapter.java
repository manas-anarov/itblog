package com.example.samuray.myapplication;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private ArrayList<Integer> mId = new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>();


    private Context mContext;

    public RecyclerAdapter(Context context, ArrayList<Integer> idShowPost, ArrayList<String> Date) {
        mId = idShowPost;
        mTitle = Date;

        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem_show_post, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.TTitle.setText(String.valueOf(mTitle.get(position)));

    }

    @Override
    public int getItemCount() {
        return mId.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView TTitle;


        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            TTitle = itemView.findViewById(R.id.date);

            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

