package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mad_application.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setting random user number from ListActivity
        Intent receiverIntent = getIntent();
        int randomNumber = receiverIntent.getIntExtra("randomNumber", 0);
        TextView username = this.findViewById(R.id.username);
        username.setText("MAD " + randomNumber);

        // checking if follow button is pressed
        Button followBtn = this.findViewById(R.id.followBtn);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText = followBtn.getText().toString();
                if(!User.Followed)
                {
                    followBtn.setText("Unfollow");
                    User.Followed = true;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
                else {
                    followBtn.setText("Follow");
                    User.Followed = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // checking if message button is pressed
        Button messageBtn = this.findViewById(R.id.messageBtn);
        messageBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent senderIntent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(senderIntent);
            }
        });
    }
}