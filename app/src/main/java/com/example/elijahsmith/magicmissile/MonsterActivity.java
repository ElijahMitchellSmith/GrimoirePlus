package com.example.elijahsmith.magicmissile;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.ButterKnife;

public class MonsterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);
        ButterKnife.bind(this);

    }

    private void setUpRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        videoGameAdapter = new VideoGameAdapter(videoGameDatabase.videoGameDao().getGames(), this);
        gameRecyclerView.setLayoutManager(linearLayoutManager);
        gameRecyclerView.setAdapter(videoGameAdapter);
        videoGameAdapter.notifyDataSetChanged();
}
