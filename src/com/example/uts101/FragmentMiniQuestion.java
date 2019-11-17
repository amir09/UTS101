package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentMiniQuestion extends Fragment {

	EditText ea;
	EditText eb;
	EditText ec;
	Button bsubmit;
	TextView thasil;
	String[] answer = {"Karena penting untuk masa depan", "Cristiano Ronaldo", "Aku ada"};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_miniquestion, container, false);
		ea = (EditText)rootView.findViewById(R.id.eta);
		eb = (EditText)rootView.findViewById(R.id.etb);
		ec = (EditText)rootView.findViewById(R.id.etc);
		bsubmit = (Button)rootView.findViewById(R.id.btn1);
		thasil = (TextView)rootView.findViewById(R.id.tvhasil);
		
		bsubmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String result1 = ea.getText().toString();
				if(result1.equals("True") || result1.equals("true") || result1.equals("True")) {
					Toast.makeText(getActivity(), ":) Thank You so Much", Toast.LENGTH_SHORT).show();
				} else if (result1.equals("False") || result1.equals("false") || result1.equals("false")){
					Toast.makeText(getActivity(), ":( it's Okay", Toast.LENGTH_SHORT).show();
				}
				
				String result2 = eb.getText().toString();
				if(result2.equals("yes") || result2.equals("Yes") || result2.equals("yes")) {
					Toast.makeText(getActivity(), "Stupid think if you say yes, go back to bed and sleep", Toast.LENGTH_SHORT).show();
				} else if (result2.equals("No") || result2.equals("no") || result2.equals("no")){
					Toast.makeText(getActivity(), "Good Choice because your a man", Toast.LENGTH_SHORT).show();
				}
				
				String result3 = ec.getText().toString();
				if(result3.equals("yes") || result3.equals("Yes") || result3.equals("yes")) {
					Toast.makeText(getActivity(), "Oh My God your Guy ;p", Toast.LENGTH_SHORT).show();
				} else if(result3.equals("No") || result3.equals("no") || result3.equals("no")){
					Toast.makeText(getActivity(), "No, I'm not ready yet", Toast.LENGTH_SHORT).show();
				}
			}
		});
		return rootView;
	}
		
}
