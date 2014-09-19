package com.sujeet.createresume.subMenus;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

import com.sujeet.createresume.R;
import com.sujeet.createresume.constant.Constant;
import com.sujeet.createresume.util.SaveData;
import com.sujeet.createresume.view.InitView;

public class BasicInfo {

  View view;

  InitView initView;
  SaveData saveData;
  Context context;

  public BasicInfo(View v, Context context) {
    this.view = v;
    this.context = context;
    saveData = new SaveData(context);
    initView = new InitView();
    init();
  }

  public BasicInfo() {}

  EditText nameET, emailET, phoneNoET, websiteET, address1ET, address2ET, cityET, StateET,
      pinCodeET;

  String name, email, phoneNo, website, address1, address2, city, State, pinCode;

  private void init() {
    nameET = initView.initEditText(view, R.id.nameEditText);
    emailET = initView.initEditText(view, R.id.emailET);
    phoneNoET = initView.initEditText(view, R.id.phoneET);
    websiteET = initView.initEditText(view, R.id.websiteET);
    address1ET = initView.initEditText(view, R.id.addressLin1ET);
    address2ET = initView.initEditText(view, R.id.addressLine2ET);
    cityET = initView.initEditText(view, R.id.cityET);

    StateET = initView.initEditText(view, R.id.stateET);

    pinCodeET = initView.initEditText(view, R.id.pinCodeET);

    setValues();
  }

  public void saveValues() {
    System.out.println("name value out side" + nameET.getText().toString());

    if (!nameET.getText().toString().equalsIgnoreCase("") && nameET.getText().toString() != null) {
      saveData.setData(Constant.NAME, nameET.getText().toString());
      System.out.println("name value inside " + nameET.getText().toString());

    }

    if (!emailET.getText().toString().equals("") && emailET.getText().toString() != null) {
      saveData.setData(Constant.EMAIL, emailET.getText().toString());
    }

    if (!phoneNoET.getText().toString().equals("") && phoneNoET.getText().toString() != null) {
      saveData.setData(Constant.PHONE, phoneNoET.getText().toString());
    }

    if (!websiteET.getText().toString().equals("") && websiteET.getText().toString() != null) {
      saveData.setData(Constant.WEBSITE, websiteET.getText().toString());
    }

    if (!address1ET.getText().toString().equals("") && address1ET.getText().toString() != null) {
      saveData.setData(Constant.ADDRESS1, address1ET.getText().toString());
    }

    if (!address2ET.getText().toString().equals("") && address2ET.getText().toString() != null) {
      saveData.setData(Constant.ADDRESS2, address2ET.getText().toString());
    }

    if (!cityET.getText().toString().equals("") && cityET.getText().toString() != null) {
      saveData.setData(Constant.CITY, cityET.getText().toString());
    }

    if (!StateET.getText().toString().equals("") && StateET.getText().toString() != null) {
      saveData.setData(Constant.STATE, StateET.getText().toString());
    }


    if (!pinCodeET.getText().toString().equals("") && pinCodeET.getText().toString() != null)
      saveData.setData(Constant.PINCODE, pinCodeET.getText().toString());
  }

  public void setValues() {


    name = saveData.getData(Constant.NAME);
    System.out.println("name set val" + name);
    if (!name.equals("") && name != null) {
      System.out.println("name set val" + name);
      nameET.setText(name);
      nameET.setSelection(name.length());
    }

    email = saveData.getData(Constant.EMAIL);
    if (!email.equals("") && email != null) {
      emailET.setText(email);
      emailET.setSelection(email.length());
    }

    phoneNo = saveData.getData(Constant.PHONE);
    if (!phoneNo.equals("") && phoneNo != null) {
      phoneNoET.setText(phoneNo);
      phoneNoET.setSelection(phoneNo.length());
    }

    website = saveData.getData(Constant.WEBSITE);
    if (!website.equals("") && website != null) {
      websiteET.setText(website);
      websiteET.setSelection(website.length());
    }

    address1 = saveData.getData(Constant.ADDRESS1);
    if (!address1.equals("") && address1 != null) {
      address1ET.setText(address1);
      address1ET.setSelection(address1.length());
    }


    address2 = saveData.getData(Constant.ADDRESS2);
    if (!address2.equals("") && address2 != null) {
      address2ET.setText(address2);
      address2ET.setSelection(address2.length());
    }

    State = saveData.getData(Constant.STATE);
    if (!State.equals("") && State != null) {
      StateET.setText(State);
      StateET.setSelection(State.length());
    }

    city = saveData.getData(Constant.CITY);
    if (!city.equals("") && city != null) {
      cityET.setText(city);
      cityET.setSelection(city.length());
    }

    pinCode = saveData.getData(Constant.PINCODE);
    if (!pinCode.equals("") && pinCode != null) {
      pinCodeET.setText(pinCode);
      pinCodeET.setSelection(pinCode.length());
    }

  }
}
