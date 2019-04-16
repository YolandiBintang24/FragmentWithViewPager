package com.example.fragementwithviewpage;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class STATUS extends Fragment {
    TextView txtPesan;


    public STATUS() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment = inflater.inflate(R.layout.fragment_statu, container, false);
        txtPesan = (TextView) viewFragment.findViewById(R.id.txtTerimaPesan);
        return  viewFragment;
    }
    protected void displayReceivedData(String message)
    {
        txtPesan.setText("Data received: "+message);
    }

}
