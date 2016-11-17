package com.app.vpgroup.fragmenthopthoai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDangNhap = (Button)findViewById(R.id.btndangnhapMain);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHopThoai fragmentHopThoai = new FragmentHopThoai();
                fragmentHopThoai.show(getFragmentManager(), "fragment_dialog");
            }
        });
    }
}
