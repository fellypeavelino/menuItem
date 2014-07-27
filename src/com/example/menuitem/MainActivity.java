package com.example.menuitem;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
	}
//metodo para criar menu
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuItem item = menu.add(0, 0,0,"Novo");//cada metodo menu.add
		item.setIcon(com.example.menuitem.R.drawable.novo); 
		//adicionando que esta no res/drawable-hdpi
		item = menu.add(0, 1,0,"salvar");
		item.setIcon(com.example.menuitem.R.drawable.save); 
		item = menu.add(0, 2,0,"Excluir");
		item.setIcon(com.example.menuitem.R.drawable.excluir);
		item = menu.add(0, 3,0,"suario");
		item.setIcon(com.example.menuitem.R.drawable.usr);
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		SubMenu submenu = menu.addSubMenu(0, 4,0,"outros");
		item = submenu.add(0, 5,0,"Pesquisar");
		item = submenu.add(0, 6,0,"Lipar");
		item = submenu.add(0, 7,0,"sair");
		this.onOptionsItemSelected(item);
		return true;
	}
//metodo para criar menu

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case 0:
			Toast.makeText(MainActivity.this, "Novo", 5000).show();
			return true;
		case 1:
			Toast.makeText(MainActivity.this, "Salvar", 5000).show();
			return true;
		case 2:
			Toast.makeText(MainActivity.this, "Excluir", 5000).show();
			return true;
		case 3:
			Toast.makeText(MainActivity.this, "Usuario", 5000).show();
			return true;
		default:
			break;
		}
		return true;
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	/*
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
	*/
}
