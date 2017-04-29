package com.example.perla.workshop1app.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.perla.workshop1app.generic.RecyclerViewAdapterBase;
import com.example.perla.workshop1app.generic.ViewWrapper;
import com.example.perla.workshop1app.model.User;
import com.example.perla.workshop1app.protocol.UserSelectedListener;
import com.example.perla.workshop1app.view.UserItemView;

import java.util.List;

/**
 * Created by Perla on 29.4.2017.
 */

public class UserAdapter extends RecyclerViewAdapterBase<User, UserItemView> {

    private final UserSelectedListener userSelectedListener;

    public UserAdapter(Context context, List<User> items, UserSelectedListener userSelectedListener){
        super(context, items);
        this.userSelectedListener = userSelectedListener;
    }

    @Override
    protected UserItemView onCreateItemView(ViewGroup parent, int viewType) {
        return new UserItemView(context, userSelectedListener);
    }

    @Override
    public void onBindViewHolder(ViewWrapper<UserItemView> viewHolder, int position) {
        final UserItemView view = viewHolder.getView();
        final User user = items.get(position);
        view.bind(user);
    }
}
