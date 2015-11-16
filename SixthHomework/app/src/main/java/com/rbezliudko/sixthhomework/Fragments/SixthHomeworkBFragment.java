package com.rbezliudko.sixthhomework.Fragments;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.rbezliudko.sixthhomework.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SixthHomeworkBFragment extends Fragment {

    private ImageView unitPicture;

    private String chosenUnit;

    public SixthHomeworkBFragment() {
        chosenUnit = "zergling";
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sixth_homework_b, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Intent intent = activity.getIntent();
        chosenUnit = intent.getStringExtra("chosenUnit");
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        unitPicture = (ImageView) view.findViewById(R.id.picture_fragment_b);
        //if (chosenUnit.equals("zergling")) unitPicture.setImageResource(R.drawable.zergling);
        //else
        if (chosenUnit.equals("queen")) unitPicture.setImageResource(R.drawable.queen);
        else if (chosenUnit.equals("infestor")) unitPicture.setImageResource(R.drawable.infestor);
        else if (chosenUnit.equals("zealot")) unitPicture.setImageResource(R.drawable.zealot);
        else if (chosenUnit.equals("stalker")) unitPicture.setImageResource(R.drawable.stalker);
        else if (chosenUnit.equals("marauder")) unitPicture.setImageResource(R.drawable.marauder);
    }

    public void updateContent (String chosenUnit) {
        //if (chosenUnit.equals("zergling")) unitPicture.setImageResource(R.drawable.zergling);
        //else
        if (chosenUnit.equals("queen")) unitPicture.setImageResource(R.drawable.queen);
        else if (chosenUnit.equals("infestor")) unitPicture.setImageResource(R.drawable.infestor);
        else if (chosenUnit.equals("zealot")) unitPicture.setImageResource(R.drawable.zealot);
        else if (chosenUnit.equals("stalker")) unitPicture.setImageResource(R.drawable.stalker);
        else if (chosenUnit.equals("marauder")) unitPicture.setImageResource(R.drawable.marauder);
    }
}
