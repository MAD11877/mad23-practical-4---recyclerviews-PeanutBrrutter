package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.userRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        userList.add(new User("Name34567890", "Description45678901", 1, true));
        userList.add(new User("Name23456789", "Description34567890", 2, false));
        userList.add(new User("Name12345678", "Description23456789", 3, true));
        userList.add(new User("Name56789012", "Description67890123", 4, false));
        userList.add(new User("Name45678901", "Description56789012", 5, true));
        userList.add(new User("Name89012345", "Description78901234", 6, false));
        userList.add(new User("Name78901234", "Description67890123", 7, true));
        userList.add(new User("Name67890123", "Description56789012", 8, false));
        userList.add(new User("Name01234567", "Description89012345", 9, true));
        userList.add(new User("Name90123456", "Description78901234", 10, false));
        userList.add(new User("Name78901234", "Description67890123", 11, true));
        userList.add(new User("Name67890123", "Description56789012", 12, false));
        userList.add(new User("Name12345678", "Description23456789", 13, true));
        userList.add(new User("Name34567890", "Description45678901", 14, false));
        userList.add(new User("Name45678901", "Description56789012", 15, true));
        userList.add(new User("Name23456789", "Description34567890", 16, false));
        userList.add(new User("Name56789012", "Description67890123", 17, true));
        userList.add(new User("Name89012345", "Description78901234", 18, false));
        userList.add(new User("Name90123456", "Description78901234", 19, true));
        userList.add(new User("Name01234567", "Description89012345", 20, false));

        adapter = new MyAdapter(userList);
        recyclerView.setAdapter(adapter);
    }
}