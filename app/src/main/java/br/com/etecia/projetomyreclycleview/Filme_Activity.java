package br.com.etecia.projetomyreclycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Filme_Activity extends AppCompatActivity {
    private TextView txtTitulo, txtDescricao, txtCategoria;
    private ImageView imagemLivro;
    Toolbar idToolBar;


    @Override
    protected void  onCreate(Bundle saveInstancesStage){
    super.onCreate(saveInstancesStage);
    setContentView(R.layout.filme_layout);

    txtTitulo = findViewById(R.id.txtFilmeTitulo);
    txtCategoria = findViewById(R.id.txtFilmeCartegoria);
    txtDescricao = findViewById(R.id.txtFilmeDescricao);
    imagemLivro = findViewById(R.id.idImgFilme);
    idToolBar = findViewById(R.id.idToolBarLivros);

    idToolBar.


}


}
