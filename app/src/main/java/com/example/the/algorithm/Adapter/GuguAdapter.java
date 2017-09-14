package com.example.the.algorithm.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.the.algorithm.data.GuguData;
import com.example.the.algorithm.R;

import java.util.List;
import java.util.Locale;

/**
 * Created by the on 2017-08-10.
 */

public class GuguAdapter extends ArrayAdapter<GuguData> {

    Context mContext;
    List<GuguData> mList;
    LayoutInflater inf;

    public GuguAdapter(Context context, List<GuguData> list) {
        super(context, R.layout.gugulist_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.gugulist_item, null);
        }

        GuguData data = mList.get(position);


        TextView guguTxt = (TextView) row.findViewById(R.id.guguTxt);

        String countStr = String.format(Locale.KOREA, "%d X %d = %d", data.getInputNum(), data.getmNum(), data.getInputNum() * data.getmNum());
        guguTxt.setText(countStr);

        return row;
    }


}
