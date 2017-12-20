package cn.zkw.dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import cn.zkw.dialog.listener.OnMenuItemClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view){
        final BottomSheet bottomSheet = BottomSheet
                .Builder
                .newBuilder(this)
                .setItem(new BottomSheet.MenuItem("店铺", R.drawable.d_01,"店铺"))
                .setItem(new BottomSheet.MenuItem("主页", R.drawable.d_02,"主页"))
                .setItem(new BottomSheet.MenuItem("修改", R.drawable.d_03,"修改"))
                .setItem(new BottomSheet.MenuItem("联系人", R.drawable.d_05,"联系人"))
                .build();
        bottomSheet.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            @Override
            public void onItemClick(BottomSheet.MenuItem item) {
                bottomSheet.dismiss();
                Toast.makeText(MainActivity.this,item.name,Toast.LENGTH_SHORT).show();
            }
        });
        bottomSheet.show();
    }
}

