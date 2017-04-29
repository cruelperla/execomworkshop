package com.example.perla.workshop1app.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.perla.workshop1app.R;
import com.example.perla.workshop1app.adapter.UserAdapter;
import com.example.perla.workshop1app.dao.mock.UserDao;
import com.example.perla.workshop1app.model.User;
import com.example.perla.workshop1app.protocol.UserSelectedListener;

public class MainActivity extends AppCompatActivity implements UserSelectedListener {

    @Override
    public void userSelected(User user) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        final UserAdapter adapter = new UserAdapter(this, UserDao.fetchUsers(), this);

        recyclerView.setAdapter(adapter);


    }
}
