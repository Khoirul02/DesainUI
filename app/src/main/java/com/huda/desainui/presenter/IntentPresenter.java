package com.huda.desainui.presenter;

import android.content.Context;
import android.content.Intent;

import com.huda.desainui.Main2Activity;

public class IntentPresenter {
    public void intentExplicit (Context context){
        Intent intent =  new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Intent Explicit");
        intent.putExtra(Intent.EXTRA_TITLE,"Coba Intent Explicit");
        intent.putExtra(Intent.EXTRA_SUBJECT,"Mencoba intent exsplisist gan");
        context.startActivity(Intent.createChooser(intent,"Share Image"));
    }

    public void intentImplisit(Context context){
        context.startActivity(new Intent(context,Main2Activity.class));
    }
}
