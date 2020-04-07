package com.example.soporte.myapplogin;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by soporte on 13/12/2017.
 */

public class GenericoFragment extends Fragment {

    public static Fragment FragmentBuilder(String texto){
        Fragment F = new GenericoFragment();
        Bundle B = new Bundle();
        B.putString("texto",texto);
        F.setArguments(B);
        return F;
    }


    public GenericoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View V=inflater.inflate(R.layout.fragment_generico, container, false);
        ((TextView)V.findViewById(R.id.texto_fragment)).setText(getArguments().getString("texto"));

        return V;
    }

}