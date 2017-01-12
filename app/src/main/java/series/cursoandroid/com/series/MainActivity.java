package series.cursoandroid.com.series;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarID);
        imagem = (ImageView) findViewById(R.id.imagemID);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorOregresso = progress;

                if (progress == 1 ) {
                    imagem.setImageResource(R.drawable.pouco);
                }
                if (progress == 2 ) {
                    imagem.setImageResource(R.drawable.medio);
                }
                if (progress == 3 ) {
                    imagem.setImageResource(R.drawable.muito);
                }
                if (progress == 4 ) {
                    imagem.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}
