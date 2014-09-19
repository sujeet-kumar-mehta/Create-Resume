package com.sujeet.createresume;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.sujeet.createresume.subMenus.BasicInfo;
import com.sujeet.createresume.subMenus.EducationFragment;
import com.sujeet.createresume.subMenus.InterestFragment;
import com.sujeet.createresume.view.SlidingTabLayout;

/**
 * The {@link android.support.v4.view.PagerAdapter} used to display pages in this sample. The
 * individual pages are simple and just display two lines of text. The important section of this
 * class is the {@link #getPageTitle(int)} method which controls what is displayed in the
 * {@link SlidingTabLayout}.
 */
public class SamplePagerAdapter extends PagerAdapter {



  private Activity activity;

  private int Layouts[] = {R.layout.view_basic_information, R.layout.view_education,
      R.layout.view_education, R.layout.view_experience, R.layout.view_interest, R.layout.view_reference};

  public BasicInfo basicInfo;
  
  public EducationFragment educationFragment;
  
  public InterestFragment interestFragment;

  public SamplePagerAdapter(Activity activity) {
    // TODO Auto-generated constructor stub
    this.activity = activity;


  }

  @Override
  public int getCount() {
    return com.sujeet.createresume.constant.Constant.RESUME_SUB_PART.length;
  }


  /**
   * @return true if the value returned from {@link #instantiateItem(ViewGroup, int)} is the same
   *         object as the {@link View} added to the {@link ViewPager}.
   */
  @Override
  public boolean isViewFromObject(View view, Object o) {
    return o == view;
  }

  // BEGIN_INCLUDE (pageradapter_getpagetitle)
  /**
   * Return the title of the item at {@code position}. This is important as what this method returns
   * is what is displayed in the {@link SlidingTabLayout}.
   * <p>
   * Here we construct one using the position value, but for real application the title should refer
   * to the item's contents.
   */
  @Override
  public CharSequence getPageTitle(int position) {
    return com.sujeet.createresume.constant.Constant.RESUME_SUB_PART[position];
  }

  // END_INCLUDE (pageradapter_getpagetitle)

  /**
   * Instantiate the {@link View} which should be displayed at {@code position}. Here we inflate a
   * layout from the apps resources and then change the text view to signify the position.
   */


  @Override
  public Object instantiateItem(ViewGroup container, int position) {
    // Inflate a new layout from our resources
    View view =
        activity.getLayoutInflater().inflate(Layouts[position], container, false);
    container.addView(view);

    switch (position) {
      case 0:
       basicInfo= new BasicInfo(view, activity);
       basicInfo.setValues();
        break;
      case 1:
        educationFragment=new EducationFragment(view, activity);
        break;
        
      case 2:
        interestFragment=new InterestFragment(view, activity);
        break;
        

      default:
        break;
    }


    return view;
  }


  /**
   * Destroy the item from the {@link ViewPager}. In our case this is simply removing the
   * {@link View}.
   */
  @Override
  public void destroyItem(ViewGroup container, int position, Object object) {
    container.removeView((View) object);
  }

}
