package sg.edu.np.mad.madpractical;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<User> userList;

    public MyAdapter(List<User> userList) { this.userList = userList; }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == 1) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.user_profile_layout, parent, false));
        } else {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.user_profile_2_layout, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        final User data = userList.get(position);
        holder.nameView.setText(data.getName());
        holder.descView.setText(data.getDescription());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Profile");
                builder.setCancelable(true);
                builder.setMessage(data.getName());
                builder.setNegativeButton("BACK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                        intent.putExtra("user", (Serializable) data);
                        v.getContext().startActivity(intent);
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    @Override
    public int getItemViewType(int position) {
        String userName = userList.get(position).getName();
        if(userName.charAt(userName.length()-1) == '7') { return 0; }
        return 1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameView, descView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.userName);
            descView = itemView.findViewById(R.id.userDesc);
            imageView = itemView.findViewById(R.id.userImage);
        }
    }
}