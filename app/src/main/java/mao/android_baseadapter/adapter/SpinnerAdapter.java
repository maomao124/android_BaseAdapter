package mao.android_baseadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import mao.android_baseadapter.R;
import mao.android_baseadapter.entity.SpinnerInfo;

/**
 * Project name(项目名称)：android_BaseAdapter
 * Package(包名): mao.android_baseadapter.adapter
 * Class(类名): SpinnerAdapter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/3
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)： SpinnerAdapter
 */

public class SpinnerAdapter extends BaseAdapter
{

    /**
     * 上下文
     */
    private final Context context;

    /**
     * 列表
     */
    private final List<SpinnerInfo> list;

    public SpinnerAdapter(Context context, List<SpinnerInfo> list)
    {
        this.context = context;
        this.list = list;
    }


    /**
     * 获取列表项的个数
     *
     * @return int
     */
    @Override
    public int getCount()
    {
        return list.size();
    }

    /**
     * 获取列表项的数据
     *
     * @param position 位置
     * @return {@link Object}
     */
    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }

    /**
     * 获取列表项的编号
     *
     * @param position 位置
     * @return long
     */
    @Override
    public long getItemId(int position)
    {
        return position;
    }

    /**
     * 获取指定位置的列表项视图
     *
     * @param position    位置
     * @param convertView 转换视图
     * @param parent      ViewGroup对象
     * @return {@link View}
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder;
        if (convertView == null)
        {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_baseadaper, null);
            viewHolder.icon = convertView.findViewById(R.id.icon);
            viewHolder.title = convertView.findViewById(R.id.title);
            viewHolder.content = convertView.findViewById(R.id.content);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        SpinnerInfo spinnerInfo = list.get(position);
        viewHolder.icon.setImageResource(spinnerInfo.getIcon());
        viewHolder.title.setText(spinnerInfo.getTitle());
        viewHolder.content.setText(spinnerInfo.getContent());
        return convertView;
    }


    private static final class ViewHolder
    {
        public ImageView icon;
        public TextView title;
        public TextView content;
    }
}
