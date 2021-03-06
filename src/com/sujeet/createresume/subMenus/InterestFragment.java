package com.sujeet.createresume.subMenus;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.sujeet.createresume.R;
import com.sujeet.createresume.util.SaveData;
import com.sujeet.createresume.view.InitView;

public class InterestFragment implements OnClickListener {

  View view;

  InitView initView;
  SaveData saveData;
  Context context;

  EditText courseNameET, institueET, startDateET, endDateET, otherInfoET;

  String course, institue, startdate, enddate, otherinfo;

  ScrollView scrollView;
  LinearLayout scrollviewlinearLayout, eduLinearLayout;

  ImageButton addButton;

  Animation rotateanimation, fadeAnimation;

  private int id = 0;

  public InterestFragment(View v, Context context) {
    this.view = v;
    this.context = context;

    fadeAnimation= AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
    rotateanimation = AnimationUtils.loadAnimation(context, R.anim.rotate_anim);
    initView = new InitView();
    init();
  }

  public InterestFragment() {}


  View linView;

  private void init() {



    onAddMore(view);
//    courseNameET = initView.initEditText(view, R.id.courceET);
//    institueET = initView.initEditText(view, R.id.instituteET);
//    startDateET = initView.initEditText(view, R.id.startDateET);
//    endDateET = initView.initEditText(view, R.id.endDateET);
//    otherInfoET = initView.initEditText(view, R.id.OtherInfoET);


    setValues();
  }

  InputFilter filter_global = new InputFilter() {
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart,
        int dend) {
      for (int i = start; i < end; i++) {
        // if (!Character.isLetterOrDigit(source.charAt(i))) {
        if (source.charAt(i) == ':' || source.charAt(i) == '#' || source.charAt(i) == ',') {
          // Character.is
          return "";
        }
      }
      return null;
    }
  };

  public void onAddMore(View v) {

    
    scrollView = initView.initScrollView(view, R.id.educationscrollView);
    scrollviewlinearLayout = initView.initLinearLayout(view, R.id.scrollLinearLayout);
    
    linView =
        LayoutInflater.from(context).inflate(R.layout.view_interest,
            scrollviewlinearLayout, false);



    // ((TextView) ((LinearLayout) linView).getChildAt(0))
    // .setFilters(new InputFilter[] {filter_global});
    scrollviewlinearLayout.addView(linView);
    scrollviewlinearLayout.setAnimation(fadeAnimation);
    eduLinearLayout = initView.initLinearLayout(linView, R.id.interest_layout);
    eduLinearLayout.setId(id);
    eduLinearLayout = initView.initLinearLayout(linView, id);
    addButton = initView.initImageButton(linView, R.id.add);

    addButton.setOnClickListener(this);
    addButton.startAnimation(rotateanimation);
    scrollView.smoothScrollTo(0, scrollView.getBottom()+1);
    id = id + 1;
  }

  public void onLessClick(View v) {

    eduLinearLayout = initView.initLinearLayout(linView, id - 1);
    id = id - 1;
    scrollviewlinearLayout.removeView(eduLinearLayout);
  }

  public void saveValues() {}

  public void setValues() {}

  @Override
  public void onClick(View v) {
    // TODO Auto-generated method stub

    onAddMore(view);

  }
}
