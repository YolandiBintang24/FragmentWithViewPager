package com.example.fragementwithviewpage;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class CHAT extends Fragment {
static EditText inputMsg;
    SendMessage SM;
    public CHAT() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(R.layout.fragment_chat,container,false);
        inputMsg =(EditText) viewFragment.findViewById(R.id.InputText);
        Button btnSend =(Button)viewFragment.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SM.sendData(inputMsg.getText().toString());
            }
        });
        // Inflate the layout for this fragment
        return viewFragment;
    }

    interface SendMessage {
        void sendData(String message);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            SM = (SendMessage) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }

}
