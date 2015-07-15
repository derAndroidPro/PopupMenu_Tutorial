package de.derandroidpro.popupmenu_tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class PopupActivity extends Activity implements OnClickListener {
	public Button btn1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.popup_layout);
		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.button1: {
			PopupMenu popupmenu = new PopupMenu (this, btn1);
			popupmenu.getMenuInflater().inflate(R.menu.popup_menufile, popupmenu.getMenu());
			popupmenu.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					switch (item.getItemId()){
					case R.id.item1: {
						Toast.makeText(getApplicationContext(), "Du hast auf das erste Item gedrückt!!!", Toast.LENGTH_SHORT).show();
						
						break;
					}
					
					case R.id.item2: {
						Toast.makeText(getApplicationContext(), "Du hast auf das zweite Item gedrückt!!!", Toast.LENGTH_SHORT).show();
						
						break;
					}

					case R.id.item3: {
						Toast.makeText(getApplicationContext(), "Du hast auf das dritte Item gedrückt!!!", Toast.LENGTH_SHORT).show();
	
						break;
					}

					case R.id.item4: {
						Toast.makeText(getApplicationContext(), "Du hast auf das vierte Item gedrückt!!!", Toast.LENGTH_SHORT).show();
	
						break;
					}
					
					
					
					}
					
					
					
					return false;
				}
			});
			
			popupmenu.show();
			
			break;
		}
		
		}
		
	}


}
