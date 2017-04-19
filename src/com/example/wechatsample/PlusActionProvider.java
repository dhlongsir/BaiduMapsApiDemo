package com.example.wechatsample;
 

import baidumapsdk.demo.BMapApiDemoMain;

import com.example.wechatsample.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

@SuppressLint("NewApi") public class PlusActionProvider extends ActionProvider {

	@SuppressLint("NewApi") private Context context;

	public PlusActionProvider(Context context) {
		super(context);
		this.context = context;
	}

	@Override
	public View onCreateActionView() {
		return null;
	}

	@Override
	public void onPrepareSubMenu(SubMenu subMenu) {
		subMenu.clear();
		subMenu.add(context.getString(R.string.plus_group_chat))
				.setIcon(R.drawable.ofm_group_chat_icon1)
				.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					@Override
					public boolean onMenuItemClick(MenuItem item) {
					 
						return true;
					}
				});
		subMenu.add(context.getString(R.string.plus_add_friend))
				.setIcon(R.drawable.ofm_add_icon)
				.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						return false;
					}
				});
		
		subMenu.add(context.getString(R.string.plus_take_photo))
				.setIcon(R.drawable.ofm_camera_icon)
				.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						return false;
					}
				});
	}

	@Override
	public boolean hasSubMenu() {
		return true;
	}

}