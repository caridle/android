package cn.edu.scuec.helloworld;//应用程序的包的名称


import androidx.appcompat.app.AppCompatActivity; //输入程序包，类

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
    private int id=0x01080000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv_init();
    }
    /*gv初始化*/
    private void gv_init(){
        gv=(GridView)findViewById(R.id.my_gridview);
        tv=(TextView)findViewById(R.id.txt);
        imageAdapter adpter = new imageAdapter(MainActivity.this);
        gv.setAdapter(adpter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                tv.setText("图标名称："+ard.getResources().getResourceEntryName(0x01080000+arg2)+"\n");
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
}
