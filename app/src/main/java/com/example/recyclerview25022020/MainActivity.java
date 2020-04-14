package com.example.recyclerview25022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerview ;
    UserAdapter mUserAdapter;
    ArrayList<User> mUserArrayList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerview = findViewById(R.id.recylerview);
        mUserArrayList = new ArrayList<>();
        mUserAdapter = new UserAdapter();
        mRecyclerview.setItemViewCacheSize(20);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRecyclerview.setAdapter(mUserAdapter);

        mUserArrayList.add(new User("Nguyen Van A",20,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van B",35,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van C",24,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van D",40,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van E",15,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van F",56,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van G",45,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van H",60,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van I",22,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen Van I",22,R.mipmap.ic_launcher));

        mUserAdapter.submitData(mUserArrayList);

    }
}
