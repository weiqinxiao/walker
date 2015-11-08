package com.warlkerpower.walker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by weiqinxiao on 15/11/7.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mUser;
    private TextView mPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.login);
        Button login = (Button)findViewById(R.id.btn_login);
        login.setOnClickListener(this);

        mUser = (TextView)findViewById(R.id.user_login);
        mPwd = (TextView)findViewById(R.id.pwd_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                if(TextUtils.isEmpty(mUser.getText()) ||
                        TextUtils.isEmpty(mPwd.getText())) {

                }

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
