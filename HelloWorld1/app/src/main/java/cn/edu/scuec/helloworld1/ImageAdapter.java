//新建的类ImageAdapter.java
package cn.edu.scuec.helloworld1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private int id;
    private Context context;
    public ImageAdapter(Context c){
        this.context = c;
    }
    @Override
    public int getCount() {
        return 201;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv =  new ImageView(context);
        id  = 0x01080000 + position;
        if (null != context.getResources().getDrawable(id))
        {
            iv.setImageResource(id);
        } else {
          iv.setImageResource(0x01080000);
        }
        return iv;
    }
}
