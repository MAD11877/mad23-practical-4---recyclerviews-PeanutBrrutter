package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mad_application.R;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Name15901", "12893",1, false));
        userList.add(new User("Name72313", "34685",2, false));
        userList.add(new User("Name44325", "89785",3, false));
        userList.add(new User("Name77573", "45836",4, false));
        userList.add(new User("Name49745", "96573",5, false));
        userList.add(new User("Name95901", "95632",6, false));
        userList.add(new User("Name26807", "54635",7, false));
        userList.add(new User("Name97567", "85674",8, false));
        userList.add(new User("Name45797", "86743",9, false));
        userList.add(new User("Name10986", "86345",10, false));
        userList.add(new User("Name95776", "54637",11, false));
        userList.add(new User("Name67845", "54765",12, false));
        userList.add(new User("Name97656", "67453",13, false));
        userList.add(new User("Name96785", "85733",14, false));
        userList.add(new User("Name94574", "85672",15, false));
        userList.add(new User("Name94563", "23466",16, false));
        userList.add(new User("Name85632", "97856",17, false));
        userList.add(new User("Name34674", "56234",18, false));
        userList.add(new User("Name26456", "65423",19, false));
        userList.add(new User("Name74562", "76534",20, false));
    }
    public void openMainActivity() {
        Random random = new Random();
        int randomInt = random.nextInt(90000) + 10000;
        Intent senderIntent = new Intent(ListActivity.this, MainActivity.class);
        senderIntent.putExtra("randomNumber", randomInt);
        startActivity(senderIntent);
    }
}