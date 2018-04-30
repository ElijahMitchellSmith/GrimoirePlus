package com.example.elijahsmith.magicmissile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.ButterKnife;

public class MonsterAdapter extends RecyclerView.Adapter<MonsterAdapter.ViewHolder> {



    private List<Monster> monsterList;
    private AdapterCallback adapterCallback;

    public MonsterAdapter(List<Monster> monsterList, AdapterCallback adapterCallback) {
        this.monsterList = monsterList;
        this.adapterCallback = adapterCallback;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface AdapterCallback {
        //TODO:Create callback methods needed
        Context getContext();

    }
    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);

        }
    }
}
