package com.source.administrator.fragementtest;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragement extends android.app.Fragment {

private long workoutId;
    public WorkoutDetailFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /* FragmentTransaction ft=getChildFragmentManager().beginTransaction();
        StopwatchFragment sm=new StopwatchFragment();
        ft.replace(R.id.stopwatch_container,sm);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();*/
        return inflater.inflate(R.layout.fragment_workout_detail_fragement, container, false);

    }
    public void setWorkoutId(long id)
    {
        this.workoutId=id;
    }
    @Override
    public void onStart()
    {
        super.onStart();
        View view=getView();
        if(view!=null)
        {
            TextView title= (TextView) view.findViewById(R.id.textTitle );
            Workout workout=Workout.workouts[(int)workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    public void buttonClicked(View v, LayoutInflater inflater){
        Toast.makeText(inflater.getContext(),"Button Clicked!", Toast.LENGTH_SHORT).show();
    }




}
