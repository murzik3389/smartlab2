package murzik.smartlab;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class analyse extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyse);


        LinearLayout linearLayout;
        linearLayout = findViewById(R.id.linearLayout);
        for (int i = 0; i < 10; i++) {
            Button button1 = new Button(this);
            button1.setText("Button" + i);
            linearLayout.addView(button1);

        }
    }
}