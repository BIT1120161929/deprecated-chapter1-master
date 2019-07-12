package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewNavigator extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public GridViewNavigator(Context mContext) {
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_navegation_item,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.item_image);
            viewHolder.textView = convertView.findViewById(R.id.item_tv);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        switch(position){
            case 0:
                viewHolder.imageView.setImageResource(R.drawable.icon_users);
                viewHolder.textView.setText("用户");
                break;
            case 1:
                viewHolder.imageView.setImageResource(R.drawable.icon_heart);
                viewHolder.textView.setText("喜欢");
                break;
            case 2:
                viewHolder.imageView.setImageResource(R.drawable.icon_at);
                viewHolder.textView.setText("@我的");
                break;
            case 3:
                viewHolder.imageView.setImageResource(R.drawable.icon_comments);
                viewHolder.textView.setText("消息");
                break;
        }

        return convertView;
    }
}
