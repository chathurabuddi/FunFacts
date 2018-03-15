package lk.chathurabuddi.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {
    private final String TAG = FunFactsActivity.class.getName();
    // declare view variables
    private TextView factTextView;
    private Button showFactsButton;
    private RelativeLayout factLayout;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // assign views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactsButton = findViewById(R.id.showFactButton);
        factLayout = findViewById(R.id.factLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = colorWheel.getColor();
                factLayout.setBackgroundColor(color);
                showFactsButton.setTextColor(color);
                factTextView.setText(factBook.getFact());
            }
        };
        showFactsButton.setOnClickListener(listener);

        // Toast.makeText(this, "The activity was created!!", Toast.LENGTH_SHORT).show();
        // Log.d(TAG, "We're Logging from the OnCreate() method");
    }
}
