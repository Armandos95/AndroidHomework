package com.rbezliudko.sixthhomework.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rbezliudko.sixthhomework.Interfaces.ButtonMethodsInterfaceFour;
import com.rbezliudko.sixthhomework.R;


public class FourthHomeworkMainFragment extends android.support.v4.app.Fragment {

    private Button buttonNext;
    private Button buttonPrevious;

    private ButtonMethodsInterfaceFour buttonMethodsInterfaceFour;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth_homework_main, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            buttonMethodsInterfaceFour = (ButtonMethodsInterfaceFour) activity;
        } catch (ClassCastException exception) {
            throw new ClassCastException(activity.toString() +  " ButtonMethodsInterfaceFour");
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        buttonNext = (Button) view.findViewById(R.id.button_next);
        buttonPrevious = (Button) view.findViewById(R.id.button_previous);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceFour.showNext();
            }
        });

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMethodsInterfaceFour.showPrevious();
            }
        });
    }
}