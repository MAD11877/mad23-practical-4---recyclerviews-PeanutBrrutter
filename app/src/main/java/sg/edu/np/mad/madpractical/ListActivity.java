package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mad_application.R;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView image = findViewById(R.id.androidImage);
        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setPositiveButton("view", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        openMainActivity();
                    }
                });
                builder.setNegativeButton("close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id) {}
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
    public void openMainActivity() {
        Random random = new Random();
        int randomInt = random.nextInt(90000) + 10000;
        Intent senderIntent = new Intent(ListActivity.this, MainActivity.class);
        senderIntent.putExtra("randomNumber", randomInt);
        startActivity(senderIntent);
    }
}