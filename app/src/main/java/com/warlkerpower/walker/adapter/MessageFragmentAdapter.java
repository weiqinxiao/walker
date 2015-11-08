package com.warlkerpower.walker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.warlkerpower.walker.R;

import java.util.ArrayList;

/**
 * Created by weiqinxiao on 15/11/8.
 */
public class MessageFragmentAdapter extends BaseAdapter {
    private ArrayList<String> items = new ArrayList<String>();;
    private Context context;

    public MessageFragmentAdapter(Context context) {
        this.context = context;
        items.add("Ajax Amsterdam");
        items.add("Barcelona");
        items.add("Manchester United");
        items.add("Chelsea");
    }

    public class ViewHolder {
        public String id;
        public TextView name;
    }

    /**
     * Loads the data.
     */
    public void loadData() {

        // Here add your code to load the data for example from a webservice or DB

        items = new ArrayList<String>();

        items.add("Ajax Amsterdam");
        items.add("Barcelona");
        items.add("Manchester United");
        items.add("Chelsea");
        items.add("Real Madrid");
        items.add("Bayern Munchen");
        items.add("Internazionale");
        items.add("Valencia");
        items.add("Arsenal");
        items.add("AS Roma");
        items.add("Tottenham Hotspur");
        items.add("PSV");
        items.add("Olympique Lyon");
        items.add("AC Milan");
        items.add("Dortmund");
        items.add("Schalke 04");
        items.add("Twente");
        items.add("Porto");
        items.add("Juventus");

        // MANDATORY: Notify that the data has changed
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        String record = (String) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null){
            rowView = inflater.inflate(R.layout.listview_message_item, null);
            viewHolder.name = (TextView) rowView.findViewById(R.id.text);
            rowView.setTag(viewHolder);
        }

        final ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.name.setText(record);
        return rowView;
    }
}
