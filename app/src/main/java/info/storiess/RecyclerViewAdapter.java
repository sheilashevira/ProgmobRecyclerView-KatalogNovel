package info.storiess;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> coverNovel = new ArrayList<>();
    private ArrayList<String> judulNovel = new ArrayList<>();
    private ArrayList<String> genreNovel = new ArrayList<>();
    private ArrayList<String> infoNovel = new ArrayList<>();
    private ArrayList<String> karyaNovel = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> coverNovel, ArrayList<String> judulNovel, ArrayList<String> genreNovel, ArrayList<String> infoNovel, ArrayList<String> karyaNovel, Context context) {
        this.coverNovel = coverNovel;
        this.judulNovel = judulNovel;
        this.genreNovel = genreNovel;
        this.infoNovel = infoNovel;
        this.karyaNovel = karyaNovel;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(coverNovel.get(position)).into(holder.imageViewCoverNovel);
        holder.textViewJudulNovel.setText(judulNovel.get(position));
        holder.textViewGenreNovel.setText(genreNovel.get(position));
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, judulNovel.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("cover_novel", coverNovel.get(position));
                intent.putExtra("judul_novel", judulNovel.get(position));
                intent.putExtra("karya_novel", karyaNovel.get(position));
                intent.putExtra("genre_novel", genreNovel.get(position));
                intent.putExtra("info_novel", infoNovel.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return judulNovel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewCoverNovel;
        TextView textViewJudulNovel;
        TextView textViewGenreNovel;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCoverNovel = itemView.findViewById(R.id.imageViewCoverNovel);
            textViewJudulNovel = itemView.findViewById(R.id.textViewJudulNovel);
            textViewGenreNovel = itemView.findViewById(R.id.textViewGenreNovel);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
