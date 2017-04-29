package com.example.perla.workshop1app.generic;

import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by Perla on 29.4.2017.
 */


    public class ViewWrapper<V extends View> extends RecyclerView.ViewHolder {

        private V view;

        public ViewWrapper(V itemView) {
            super(itemView);
            view = itemView;
        }

        public V getView() {
            return view;
        }
    }



