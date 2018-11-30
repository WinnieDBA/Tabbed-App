package com.winnie.tabbed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.

 */
public class StudentskFragment extends Fragment {
Button gusa;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   View root = inflater.inflate(R.layout.fragment_studentsk, container, false);
   gusa = root.findViewById(R.id.btnstud);
   gusa.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Toast.makeText(getContext(), "Umenigusa", Toast.LENGTH_SHORT).show();
       }
   });
   return root;

    }


}
