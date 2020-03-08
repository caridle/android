package cn.edu.scuec.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MainActivity ard = this;
    private LinearLayout mainView = null;


    private TextView tv = null;
    private GridView gv = null;
    private  int id = 0x01080000;

    private void gv_init() {
        gv = (GridView) findViewById(R.id.my_gridview);
        tv = (TextView) findViewById(R.id.txt);
        ImageAdapter adapter = new ImageAdapter(MainActivity.this);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                tv.setText("图标名称："+ ard.getResources().getResourceEntryName(0x01080000+arg2)+"\n");
                tv.append("图标Id：0x"+Integer.toHexString(0x10800000+arg2)+"\n");
                tv.append("图标大小:"+arg1.getWidth()+"x"+arg1.getHeight()+"\n");
            }
        });
        gv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
                tv.setText("图标名称："+ard.getResources().getResourceEntryName(0x01080000+arg2)+"\n");
                tv.append("图标Id：0x"+Integer.toHexString(0x10800000+arg2)+"\n");
                tv.append("图标大小:"+arg1.getWidth()+"x"+arg1.getHeight()+"\n");
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv_init();

    }
    //窗口的生命周期
    //从创建，销毁，停止，恢复，开始
    //从而对应窗口生命周期的方法

    @Override
    protected void onStart() {
        super.onStart();
        if (BuildConfig.DEBUG)
            Log.d("MainActivity", "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (BuildConfig.DEBUG)
            Log.d("MainActivity", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (BuildConfig.DEBUG)
            Log.d("MainActivity", "OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (BuildConfig.DEBUG)
            Log.d("MainActivity", "OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (BuildConfig.DEBUG)
            Log.d("MainActivity", "OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (BuildConfig.DEBUG)
            Log.d("MainActivity", "OnResume");
    }
}
