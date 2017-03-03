package com.unicornheight.rollingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit_name, mEdit_phone,mEdit_adrress, mEdit_email,mEdit_crush,mEdit_flaws,mEdit_favourite;
    private String nName, nPhone, nAddy, nEmail, nCrush, nFlaws, nFavourite;
    private  TickerView viewName,viewPhone, viewAddress, viewEmail,viewCrush,viewFlaws,viewFavourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTemporaryText();
        getItems();
    }
    private void getItems(){
        mEdit_name = (EditText) findViewById(R.id.nameEditText);

        mEdit_phone = (EditText) findViewById(R.id.phoneEditText);

        mEdit_adrress = (EditText) findViewById(R.id.addyEditText);

        mEdit_email = (EditText) findViewById(R.id.emailEditText);

        mEdit_crush = (EditText) findViewById(R.id.crushEditText);

        mEdit_flaws= (EditText) findViewById(R.id.flawEditText);

        mEdit_favourite = (EditText) findViewById(R.id.favouriteEditText);


    }

    private void setTemporaryText(){
        viewName = (TickerView) findViewById(R.id.nameAction);
        viewName.setCharacterList(TickerUtils.getDefaultNumberList());
        viewName.setText(getString(R.string.temp));

        viewPhone = (TickerView) findViewById(R.id.phoneAction);
        viewPhone.setCharacterList(TickerUtils.getDefaultNumberList());
        viewPhone.setText(getString(R.string.temp));

        viewAddress = (TickerView) findViewById(R.id.addyAction);
        viewAddress.setCharacterList(TickerUtils.getDefaultNumberList());
        viewAddress.setText(getString(R.string.temp));

        viewEmail = (TickerView) findViewById(R.id.emailAction);
        viewEmail.setCharacterList(TickerUtils.getDefaultNumberList());
        viewEmail.setText(getString(R.string.temp));

        viewCrush = (TickerView) findViewById(R.id.crushAction);
        viewCrush.setCharacterList(TickerUtils.getDefaultNumberList());
        viewCrush.setText(getString(R.string.temp));

        viewFlaws = (TickerView) findViewById(R.id.flawAction);
        viewFlaws.setCharacterList(TickerUtils.getDefaultNumberList());
        viewFlaws.setText(getString(R.string.temp));

        viewFavourite = (TickerView) findViewById(R.id.favouriteAction);
        viewFavourite.setCharacterList(TickerUtils.getDefaultNumberList());
        viewFavourite.setText(getString(R.string.temp));


    }

    private void startTextActivity(){

        nName = mEdit_name.getText().toString();
        nPhone = mEdit_phone.getText().toString();
        nAddy = mEdit_adrress.getText().toString();
        nEmail = mEdit_email.getText().toString();
        nCrush = mEdit_crush.getText().toString();
        nFlaws = mEdit_flaws.getText().toString();
        nFavourite = mEdit_favourite.getText().toString();

        viewName.setText(nName);


        viewPhone.setText(nPhone);


        viewAddress.setText(nAddy);


        viewEmail.setText(nEmail);


        viewCrush.setText(nCrush);


        viewFlaws.setText(nFlaws);


        viewFavourite.setText(nFavourite);

    }

    public void startTransformation(View v){
        startTextActivity();
    }

}
