package com.example.test2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewholder {
    ImageView itemImage;
    TextView programTitle;
    TextView programDescrip;
    ProgramViewholder(View v){
        itemImage = v.findViewById(R.id.imageView);
        programTitle = v.findViewById(R.id.textview1);
        programDescrip = v.findViewById(R.id.textview2);


    }

}
