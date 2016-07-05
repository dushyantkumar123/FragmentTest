package com.source.administrator.fragementtest;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ALL")
public class WorkoutListFragement extends ListFragment {


    public WorkoutListFragement() {
        // Required empty public constructor
    }
    public interface  WorkoutListListener{
        void itemClicked(long id);
    }
            private WorkoutListListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names= new String[Workout.workouts.length];
        for(int i=0;i<names.length;i++)
            names[i]=Workout.workouts[i].getName();
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener=(WorkoutListListener)activity;
    }


    @Override
    public void onListItemClick(ListView l,View v,int position,long id) {
        super.onListItemClick(l,v,position,id);
        if(listener!=null)
            listener.itemClicked(id);
    }

}
