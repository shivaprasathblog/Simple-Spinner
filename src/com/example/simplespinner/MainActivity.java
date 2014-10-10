package com.example.simplespinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity
{
	Spinner sp;
	
	String[]cars={"Ferrari","BMW","Mercedes","Audi","Lamborghini","Ford","Rolls-Royce","Porsche","Volkswagen"};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sp=(Spinner)findViewById(R.id.spinner1);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,cars);
		
		sp.setAdapter(adapter);
		
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			/**Callback method to be invoked when an item in this view has been selected. This callback is invoked only when the newly selected position is different from the previously selected position or if there was no selected item.
			public abstract void onItemSelected (AdapterView<?> parent, View view, int position, long id)
			Impelmenters can call getItemAtPosition(position) if they need to access the data associated with the selected item.
			Parameters
			parent	The AdapterView where the selection happened
			view	The view within the AdapterView that was clicked
			position	The position of the view in the adapter
			id	The row id of the item that is selected
			public abstract void onNothingSelected (AdapterView<?> parent)
			
			**/
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3)
			
			{
				/**Toast message to show the selected item**/
				Toast.makeText(getApplicationContext(), cars[arg2], Toast.LENGTH_SHORT).show();
				
				/**Toast message to show selected item with a message Eg: Your favourite is BMW **/
				//Toast.makeText(getBaseContext(), "Your favourite is "+cars[arg2] ,Toast.LENGTH_SHORT).show();
				
				/**Toast message to show the selected item**/
				//Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0)
			{
				// TODO Auto-generated method stub
				
			}
		});
	}

	

}
