package com.example.the.algorithm.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.the.algorithm.R;
import com.example.the.algorithm.data.ChattingData;

import java.util.List;

/**
 * Created by the on 2017-08-11.
 */

public class ChattingAdapter extends ArrayAdapter<ChattingData> {
    Context mContext;
    List<ChattingData> mList;
    LayoutInflater inf;

    public ChattingAdapter(Context context, List<ChattingData> list) {
        super(context, R.layout.chatting_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.chatting_list_item, null);
        }

        ChattingData data = mList.get(position);

        LinearLayout myMessage = (LinearLayout) row.findViewById(R.id.myMessageLayout);
        LinearLayout cpuMessage = (LinearLayout) row.findViewById(R.id.cpuMessageLayout);


        if (data.isSentByme()) {
            myMessage.setVisibility(View.VISIBLE);
            cpuMessage.setVisibility(View.GONE);

            TextView myMessageTxt = (TextView) row.findViewById(R.id.myMessageTxt);
            myMessageTxt.setText(data.getMessageText());

        } else {
            myMessage.setVisibility(View.GONE);
            cpuMessage.setVisibility(View.VISIBLE);

            TextView cpuMessageTxt = (TextView) row.findViewById(R.id.cpuMessageTxt);
            cpuMessageTxt.setText(data.getMessageText());
        }


        return row;
    }
    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
