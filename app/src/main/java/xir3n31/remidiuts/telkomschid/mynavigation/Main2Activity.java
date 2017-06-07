package xir3n31.remidiuts.telkomschid.mynavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void nav1(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void nav2(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void nav3(View view) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void nav4(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
