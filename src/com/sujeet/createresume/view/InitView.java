package com.sujeet.createresume.view;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class InitView {


  public TextView initTextView(View v, int id) {
    return (TextView) v.findViewById(id);

  }

  public EditText initEditText(View v, int id) {
    return (EditText) v.findViewById(id);

  }

  public LinearLayout initLinearLayout(View v, int id) {
    return (LinearLayout) v.findViewById(id);

  }

  public ScrollView initScrollView(View v, int id) {
    return (ScrollView) v.findViewById(id);

  }

  public Button initButton(View v, int id) {
    return (Button) v.findViewById(id);

  }
  
  public ImageButton initImageButton(View v, int id) {
    return (ImageButton) v.findViewById(id);

  }

}
