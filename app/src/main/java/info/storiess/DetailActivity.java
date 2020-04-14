package info.storiess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewCoverNovel;
    TextView textViewJudulNovel, textViewGenreNovel, textViewKaryaNovel, textViewInfoNovel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewCoverNovel = findViewById(R.id.imageViewCoverNovel);
        textViewJudulNovel = findViewById(R.id.textViewJudulNovel);
        textViewGenreNovel = findViewById(R.id.textViewGenreNovel);
        textViewKaryaNovel = findViewById(R.id.textViewKaryaNovel);
        textViewInfoNovel = findViewById(R.id.textViewInfoNovel);

        getIncomingExtra();
    }

    private void getIncomingExtra(){

                    if(
                        getIntent().hasExtra("cover_novel") &&
                        getIntent().hasExtra("judul_novel") &&
                        getIntent().hasExtra("genre_novel") &&
                        getIntent().hasExtra("karya_novel") &&
                        getIntent().hasExtra("info_novel")){

                        String coverNovel = getIntent().getStringExtra("cover_novel");
                        String judulNovel = getIntent().getStringExtra("judul_novel");
                        String genreNovel = getIntent().getStringExtra("genre_novel");
                        String karyaNovel = getIntent().getStringExtra("karya_novel");
                        String infoNovel = getIntent().getStringExtra("info_novel");

                        setDataActivity(coverNovel, judulNovel, genreNovel, karyaNovel, infoNovel);

                    }
    }

    private void setDataActivity(String coverNovel, String judulNovel, String genreNovel, String karyaNovel, String infoNovel) {

        Glide.with(this).asBitmap().load(coverNovel).into(imageViewCoverNovel);
        textViewJudulNovel.setText(judulNovel);
        textViewGenreNovel.setText(genreNovel);
        textViewKaryaNovel.setText(karyaNovel);
        textViewInfoNovel.setText(infoNovel);

    }
}
