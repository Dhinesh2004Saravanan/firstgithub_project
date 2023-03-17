package com.example.recycler_view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
{
    private ListView listView;
    ArrayList l=new ArrayList();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l.add("alpha");
        l.add("beta");
        l.add("gamma");
        l.add("femta"+"\n\n"+"dhinesh");
        l.add("devi");
        l.add("vicky");
        l.add("radha");
        listView=findViewById(R.id.list);
        myAdapter adapter=new myAdapter();
        listView.setAdapter(adapter);

    }

    public class myAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return l.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        // in getView function only we need to write our codes (i.e) the views
        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            // this line is used to represent which layout file has to be implemented
            convertView=getLayoutInflater().inflate(R.layout.layout,parent,false);
            TextView te=convertView.findViewById(R.id.textView1);
            te.setText(l.get(position).toString());

            return convertView;
        }
    }



}