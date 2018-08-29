package ph.edu.iicsust.presnillo.jammelouise.labactivity1b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = (Button) findViewById(R.id.displayButton);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText inputNumber1 = (EditText) findViewById(R.id.inputNumber1);
                EditText inputNumber2 = (EditText) findViewById(R.id.inputNumber2);

                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int x = Integer.parseInt(inputNumber1.getText().toString());
                int y = Integer.parseInt(inputNumber2.getText().toString());

                if (x > y) {
                    resultTextView.setText(x + " is greater than " + y);
                }

                else{
                    resultTextView.setText(x + " is less than " + y);
                }



            }
        });



    }
}
