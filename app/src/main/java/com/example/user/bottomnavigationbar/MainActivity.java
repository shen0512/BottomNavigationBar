package com.example.user.bottomnavigationbar;

import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textView);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                switch(item.getItemId()){
                    case R.id.action_home:
                        textView.setText("目前位置\"首頁\"");
                        break;
                    case R.id.action_laser:
                        textView.setText("目前位置\"雷色筆\"");
                        break;
                    case R.id.action_file:
                        textView.setText("目前位置\"檔案上傳下載區\"");
                        break;
                    case R.id.action_vote:
                        textView.setText("目前位置\"投票區\"");
                        break;
                    case R.id.action_paint:
                        textView.setText("目前位置\"小畫家\"");
                        break;
                }
                return true;
            }
        });
    }
}