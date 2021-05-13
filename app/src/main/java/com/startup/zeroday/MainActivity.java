package com.startup.zeroday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button pindah, pindahData, telpHandle, vGroupsPage, dHal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah = findViewById(R.id.pindah);
        pindah.setOnClickListener(this);

        pindahData = findViewById(R.id.pindahData);
        pindahData.setOnClickListener(this);

        telpHandle = findViewById(R.id.panggil_sistem);
        telpHandle.setOnClickListener(this);

        vGroupsPage = findViewById(R.id.vviewsGroup);
        vGroupsPage.setOnClickListener(this);

        dHal = findViewById(R.id.recyclerv);
        dHal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.pindah:

                Intent moveIntent = new Intent(MainActivity.this, Hello.class);
                startActivity(moveIntent);

                break;
            case R.id.pindahData:

                Intent moveData = new Intent(MainActivity.this, Hello.class);
                moveData.putExtra(Hello.EXTRA_NAME, "M Yusuf Haryadi");
                moveData.putExtra(Hello.EXTRA_AGE, 19);
                startActivity(moveData);

                break;
            case R.id.panggil_sistem:

                String phoneNumber = "082115299534";
                Intent callSystem = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(callSystem);

                break;
            case R.id.vviewsGroup:

                Intent pageView = new Intent(MainActivity.this, MyView.class);
                startActivity(pageView);

                break;
            case R.id.recyclerv:

                Intent toList = new Intent(MainActivity.this, ListHeroes.class);
                startActivity(toList);

                break;
        }
    }
}