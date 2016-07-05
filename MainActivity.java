package com.source.administrator.fragementtest;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.widget.Toast;

public class MainActivity extends Activity implements WorkoutListFragement.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //android.app.Fragment fragement=(android.app.Fragment)getFragmentManager().findFragmentById(R.id.WorkoutDetailFragement);

    }
    /*public void onSaveInstanceState(Bundle onSaveInstance)
    {
        onSaveInstance.
    }*/

    @Override
    public void itemClicked(long id) {
       // Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_SHORT).show();

        WorkoutDetailFragement detail=new WorkoutDetailFragement();

        FragmentTransaction ft=getFragmentManager().beginTransaction();
        detail.setWorkoutId(id);
        //detail.onStart();
        ft.replace(R.id.frag_container,detail);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();




    }
}
