package com.example.elans.youtubeapidemo.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.elans.youtubeapidemo.R;
import com.example.elans.youtubeapidemo.service.ListFetchService;
import com.example.elans.youtubeapidemo.utilites.Constants;

/**
 * Created by elans on 8/25/2016.
 */
public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private EditText editText;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.videos_list);
        editText = (EditText) rootView.findViewById(R.id.edit);
        button = (Button) rootView.findViewById(R.id.button);

        initSearchButton();

        return rootView;
    }

    private void initSearchButton(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchQuery = editText.getText().toString();
                if(searchQuery.trim().length() > 0) {
                    Intent intent = new Intent(getContext(), ListFetchService.class);
                    intent.setAction(Constants.ACTION_SEARCH_YOUTUBE);
                    intent.putExtra(Constants.SEARCH_QUERY_KEY,searchQuery);
                    getContext().startService(intent);
                }
                else{
                    Toast.makeText(getContext(),"Search Failed ; Empty query",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
