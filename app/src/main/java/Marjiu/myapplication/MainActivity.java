package Marjiu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.toast);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //利用Toast的靜態函式makeText來建立Toast物件
                Toast toast = Toast.makeText(MainActivity.this,
                        "Hello world!", Toast.LENGTH_LONG);
                //顯示Toast
                toast.show();



            }
        });
        final Button button2 = (Button) findViewById(R.id.alertdialog);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //產生視窗物件
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("對話視窗測試")   		//設定視窗標題
                        .setIcon(R.mipmap.ic_launcher)	//設定對話視窗圖示
                        .setMessage("這是一個對話視窗")	//設定顯示的文字
                        .setPositiveButton("關閉視窗",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })			//設定結束的子視窗
                        .show();		//呈現對話視窗



            }
        });


    }
}
