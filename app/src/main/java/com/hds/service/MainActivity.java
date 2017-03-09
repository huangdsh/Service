package com.hds.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button start;
    private Button stop;

ServiceConnection connection = new ServiceConnection() {
    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {

    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
};
   @Override
    public void initView() {
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
       start.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,MyService.class);
               startService(intent);
           }
       });
       stop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,MyService.class);
               stopService(intent);
           }
       });
    }

}
