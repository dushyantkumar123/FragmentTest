package com.source.administrator.fragementtest;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements WorkoutListFragement.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.app.Fragment fragement=(android.app.Fragment)getFragmentManager().findFragmentById(R.id.WorkoutDetailFragement);

    }
    /*public void onSaveInstanceState(Bundle onSaveInstance)
    {
        onSaveInstance.
    }*/

    @Override
    public void itemClicked(long id) {
       /* WorkoutDetailFragement detail=new WorkoutDetailFragement();
        android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        detail.setWorkoutId(id);
        ft.replace(R.id.frag_container,detail);
        ft.addToBackStack(null);
        ft.setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();


*/

    }
}
