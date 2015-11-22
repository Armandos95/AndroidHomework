package com.rbezliudko.sixthhomework.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rbezliudko.sixthhomework.Activities.SixthHomeworkAdditionalActivity;
import com.rbezliudko.sixthhomework.Activities.SixthHomeworkMainActivity;
import com.rbezliudko.sixthhomework.Interfaces.ButtonMethodsInterfaceSix;
import com.rbezliudko.sixthhomework.R;

public class SixthHomeworkAFragment extends Fragment {

    private ButtonMethodsInterfaceSix buttonMethodsInterfaceSix;

    private Button zerglingButton;
    private Button marauderButton;
    private Button queenButton;
    private Button zealotButton;
    private Button stalkerButton;
    private Button infestorButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sixth_homework_a, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            buttonMethodsInterfaceSix = (ButtonMethodsInterfaceSix) activity;
        } catch (ClassCastException exception) {
            throw new ClassCastException(activity.toString() +  " ButtonMethodsInterfaceSix");
        }
    }
    
    public void onViewCreated(View view, Bundle savedInstanceState) {

        zerglingButton = (Button) view.findViewById(R.id.button_6_zergling);
        marauderButton = (Button) view.findViewById(R.id.button_6_marauder);
        queenButton = (Button) view.findViewById(R.id.button_6_queen);
        zealotButton = (Button) view.findViewById(R.id.button_6_zealot);
        stalkerButton = (Button) view.findViewById(R.id.button_6_stalker);
        infestorButton = (Button) view.findViewById(R.id.button_6_infestor);

        zerglingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceSix.showZergling();
            }
        });

        marauderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceSix.showMarauder();
            }
        });

        queenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceSix.showQueen();
            }
        });

        zealotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceSix.showZealot();
            }
        });

        stalkerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceSix.showStalker();
            }
        });

        infestorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceSix.showInfestor();
            }
        });
    }
}
