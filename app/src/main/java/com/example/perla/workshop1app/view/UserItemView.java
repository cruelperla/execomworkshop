package com.example.perla.workshop1app.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.perla.workshop1app.R;
import com.example.perla.workshop1app.model.User;
import com.example.perla.workshop1app.protocol.UserSelectedListener;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Perla on 29.4.2017.
 */

public class UserItemView extends RelativeLayout {
    private User user;
    private final TextView lastName;
    private final TextView firstName;
    private final SimpleDraweeView thumbnail;
    private final CardView cardView;

    public UserItemView(Context context, final UserSelectedListener userSelectedListener) {
        super(context);
        inflate(context, R.layout.item_view_user, this);

        firstName = (TextView) findViewById(R.id.first_name);
        lastName = (TextView) findViewById(R.id.last_name);
        thumbnail = (SimpleDraweeView) findViewById(R.id.thumbnail);
        cardView = (CardView) findViewById(R.id.card);

        cardView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                userSelectedListener.userSelected(user);
            }
        });
    }

    public void bind(User user) {
        this.user = user;
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
        thumbnail.setImageURI(user.getIconUrl());
    }


}
