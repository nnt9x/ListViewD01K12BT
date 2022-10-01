package com.bkacad.nnt.listviewd01k12bt.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bkacad.nnt.listviewd01k12bt.R;
import com.bkacad.nnt.listviewd01k12bt.model.Country;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    // Context
    private Context context;
    // Dữ liệu
    private List<Country> dataSource;

    // Phương thức khởi tạo
    public MyAdapter(Context context, List<Country> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Mỗi 1 đối tượng Country -> ứng với 1 itemview bên listview
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_view, viewGroup, false);
        }
        // Bind id cho view
        ImageView imgFlag = view.findViewById(R.id.imgFlag);
        TextView tvCountry = view.findViewById(R.id.tvCountry);
        TextView tvCapital = view.findViewById(R.id.tvCapital);
        // đổ dữ liệu vào view
        Country item = dataSource.get(i);
        tvCountry.setText(item.getName());
        tvCapital.setText(item.getCapital());

        Picasso.get().load(item.getFlagURL())
                .placeholder(R.drawable.cat)
                .error(R.drawable.error)
                .into(imgFlag);

        return view;
    }
}
