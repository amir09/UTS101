package com.example.uts101;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentMathQuestion extends Fragment {

	ListView lvjudul;
	String[] judul = {"Aritmatika Dasar", "Bangun Datar", "Baris dan Deret"};
	
	@Override
	public View onCreateView(LayoutInflater inflater,
    		ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_mathquestion, container, false);
		
		lvjudul = (ListView)rootView.findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, judul);
	    lvjudul.setAdapter(adapter);
        lvjudul.setOnItemClickListener(ListClick);
		
		return rootView;
		
     }
	private AdapterView.OnItemClickListener ListClick = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			if (arg2==0){
        			FragmentAritmatikaDasar fragmentaritmatikadasar = new FragmentAritmatikaDasar();
        			FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentaritmatikadasar);
        			ft.commit();
			} else if (arg2==1){
				Toast.makeText(getActivity(), "Not me :d", Toast.LENGTH_SHORT).show();
			} else if (arg3>=2){
				Toast.makeText(getActivity(), "Wrong Place :)", Toast.LENGTH_SHORT).show();	
			}
		}
	};
}
