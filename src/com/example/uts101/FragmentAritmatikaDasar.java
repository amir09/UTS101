package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentAritmatikaDasar extends Fragment {

	EditText e1;
	EditText e2;
	EditText e3;
	Button bhasil, bhasil2, bhasil3;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_aritmatikadasar, container, false);
		e1 = (EditText)rootView.findViewById(R.id.et1);
		e2 = (EditText)rootView.findViewById(R.id.et2);
		e3 = (EditText)rootView.findViewById(R.id.et3);
		bhasil = (Button)rootView.findViewById(R.id.btnhasil);
		bhasil2 = (Button)rootView.findViewById(R.id.btnhasil2);
		bhasil3 = (Button)rootView.findViewById(R.id.btnhasil3);
		
		bhasil.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int hasil1 = Integer.parseInt(e1.getText().toString());
				if(hasil1==6) {
					Toast.makeText(getActivity(), "Great", Toast.LENGTH_SHORT).show();
				} else {
						Toast.makeText(getActivity(), "Dont Give Up, Try Again", Toast.LENGTH_SHORT).show();
					}
			}
		});
		
		bhasil2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int hasil2 = Integer.parseInt(e2.getText().toString());
				if(hasil2==2) {
					Toast.makeText(getActivity(), "Great", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getActivity(), "Dont Give Up, Try Again", Toast.LENGTH_SHORT).show();
				}			
			}
		});
		
		bhasil3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int hasil3 = Integer.parseInt(e3.getText().toString());
				if (hasil3==9){
					Toast.makeText(getActivity(), "Great", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getActivity(), "Dont Give Up, Try Again", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		return rootView;
		
		
	}
}
