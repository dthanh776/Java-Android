package com.example.frarment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class FrgKetQua extends Fragment {
    ListView kp ;
    public static CustomerKetQua customerKetQua;
    MainActivity activity;
    ArrayList<ketqua> dulieu=new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity=(MainActivity) context;
    }

    @Override
    public void onStart() {
        super.onStart();
        dulieu=activity.getDulieu();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frg_ket_qua, container, false);
        onStart();
        customerKetQua = new CustomerKetQua(getContext(), R.layout.layout_item_ketqua, dulieu);
        kp=view.findViewById(R.id.lvDS);
        kp.setAdapter(customerKetQua);
        customerKetQua.notifyDataSetChanged();
        return view;
    }
}