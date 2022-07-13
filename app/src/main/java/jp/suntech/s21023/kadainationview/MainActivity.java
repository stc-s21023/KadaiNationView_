package jp.suntech.s21023.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listViewオブジェクトを取得
        ListView lvkuni = findViewById(R.id.kuni);
        //ListViewにリスナを設定
        lvkuni.setOnItemClickListener(new ListItemClickListener());
    }

    //リストがタップされた時の処理が記述されたメンバクラス
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //タップされた定食名を取得
            //String item = (String)parent.getItemAtPosition(position);
            TextView tvText = (TextView)view;
            String item = tvText.getText().toString();
            //トーストで表示する文字列の生成
            String show = "あなたが選んだ国:" + item;
            //トーストの表示
            TextView output = findViewById(R.id.textView);
            output.setText(show);
            //
        }
    }
}