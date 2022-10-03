package mao.android_baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mao.android_baseadapter.adapter.SpinnerAdapter;
import mao.android_baseadapter.entity.SpinnerInfo;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.Spinner);

        List<SpinnerInfo> list = new ArrayList<>(6);
        {
            SpinnerInfo spinnerInfo = new SpinnerInfo();
            spinnerInfo.setIcon(R.drawable.ic_launcher_foreground)
                    .setTitle("标题1")
                    .setContent("这是内容1....");
            list.add(spinnerInfo);
        }
        {
            SpinnerInfo spinnerInfo = new SpinnerInfo();
            spinnerInfo.setIcon(R.drawable.ic_launcher_foreground)
                    .setTitle("标题2")
                    .setContent("这是内容2....");
            list.add(spinnerInfo);
        }
        {
            SpinnerInfo spinnerInfo = new SpinnerInfo();
            spinnerInfo.setIcon(R.drawable.ic_launcher_foreground)
                    .setTitle("标题3")
                    .setContent("这是内容3....");
            list.add(spinnerInfo);
        }
        {
            SpinnerInfo spinnerInfo = new SpinnerInfo();
            spinnerInfo.setIcon(R.drawable.ic_launcher_foreground)
                    .setTitle("标题4")
                    .setContent("这是内容4....");
            list.add(spinnerInfo);
        }
        {
            SpinnerInfo spinnerInfo = new SpinnerInfo();
            spinnerInfo.setIcon(R.drawable.ic_launcher_foreground)
                    .setTitle("标题5")
                    .setContent("这是内容5....");
            list.add(spinnerInfo);
        }
        {
            SpinnerInfo spinnerInfo = new SpinnerInfo();
            spinnerInfo.setIcon(R.drawable.ic_launcher_foreground)
                    .setTitle("标题6")
                    .setContent("这是内容6....");
            list.add(spinnerInfo);
        }

        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(this, list);

        spinner.setAdapter(spinnerAdapter);
        spinner.setSelection(3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                toastShow("当前选中的是第" + (position + 1) + "项");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }

    /**
     * 显示消息
     *
     * @param message 消息
     */
    private void toastShow(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}