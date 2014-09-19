package com.sujeet.createresume;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.sujeet.createresume.subMenus.BasicInfo;
import com.sujeet.createresume.view.DatePickerFragment;
import com.sujeet.createresume.view.SlidingTabLayout;


public class MainActivity extends FragmentActivity {
  private SlidingTabLayout mSlidingTabLayout;

  /**
   * A {@link ViewPager} which will be used in conjunction with the {@link SlidingTabLayout} above.
   */
  private ViewPager mViewPager;

  private SamplePagerAdapter spa;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    
    mViewPager = (ViewPager) findViewById(R.id.viewpager);
    spa=new SamplePagerAdapter(MainActivity.this);
    mViewPager.setAdapter(spa);
    // END_INCLUDE (setup_viewpager)

    // BEGIN_INCLUDE (setup_slidingtablayout)
    // Give the SlidingTabLayout the ViewPager, this must be done AFTER the ViewPager has had
    // it's PagerAdapter set.
    mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
    mSlidingTabLayout.setViewPager(mViewPager);
  }

  @Override
  protected void onResume() {
    // TODO Auto-generated method stub
    super.onResume();
    if (spa!=null) {
      spa=new SamplePagerAdapter(MainActivity.this);
      mViewPager.setAdapter(spa);
    }
  
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
  
  @Override
  protected void onPause() {
    // TODO Auto-generated method stub
    super.onPause();
    if (spa.basicInfo!=null) {
      spa.basicInfo.saveValues();
    }
    
    
  }
  
  public void populateDateDialogView() {
    DialogFragment newStartFragment = new DatePickerFragment();
    newStartFragment.show(getSupportFragmentManager(), "datePicker");
  }
}
