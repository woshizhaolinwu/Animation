package jrdcom.com.animation;

import android.graphics.drawable.Animatable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn_two_line;
    ImageView imageView_two_line;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_two_line = (Button)findViewById(R.id.btn_two_line);
        imageView_two_line = (ImageView)findViewById(R.id.image_two_line);
        btn_two_line.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_two_line:
                    ((Animatable)imageView_two_line.getDrawable()).start();
                    break;
            }
        }
    };
}
