package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public ListViewAdapter(Context mContext) {
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 30;
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
        public CircleImageView cIvAvatar;
        public ImageView iVnotice;
        public TextView tvTltle;
        public TextView tvDescription;
        public TextView tvTime;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.im_list_item,null);
            viewHolder = new ViewHolder();
            viewHolder.cIvAvatar = convertView.findViewById(R.id.iv_avatar);
            viewHolder.iVnotice = convertView.findViewById(R.id.robot_notice);
            viewHolder.tvTltle = convertView.findViewById(R.id.tv_title);
            viewHolder.tvDescription = convertView.findViewById(R.id.tv_description);
            viewHolder.tvTime = convertView.findViewById(R.id.tv_time);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.cIvAvatar.setImageResource(R.drawable.icon_girl);
        viewHolder.iVnotice.setImageResource(R.drawable.im_icon_notice_official);
        viewHolder.tvTltle.setText("UserName");
        viewHolder.tvDescription.setText("2333");
        viewHolder.tvTime.setText(new Date().toString());

        return convertView;
    }
}
