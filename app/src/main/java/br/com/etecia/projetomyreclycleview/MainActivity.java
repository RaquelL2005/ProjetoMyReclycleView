package br.com.etecia.projetomyreclycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    List<Filmes> lstFilmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = new ArrayList<>();

        lstFilmes.add(new Filmes("Avatar: O Caminho da Água","Ficção Científica","Após formar uma família, Jake Sully e Ney'tiri fazem de tudo para ficarem juntos. No entanto, eles devem sair de casa e explorar as regiões de Pandora quando uma antiga ameaça ressurge, e Jake deve travar uma guerra difícil contra os humanos."));
        lstFilmes.add(new Filmes("Gato de Botas 2: O Último Pedido","Animação","O Gato de Botas descobre que sua paixão pela aventura cobrou seu preço: ele já gastou oito de suas nove vidas. Ele então parte em uma jornada épica para encontrar o mítico Último Desejo e restaurar suas nove vidas."));
        lstFilmes.add(new Filmes("Shrek para Sempre","Animação","Há muito tempo ajustado à vida de casado e totalmente domesticado, Shrek fica entediado e começa a ter saudades dos dias em que se sentia um ogro de verdade. Para recuperá-los, ele firma um pacto com Rumpelstiltskin e é levado a um mundo onde ogros são caçados e ele e Fiona nunca se conheceram, além de que seus amigos Burro e Gato de Botas também não o reconhecem. Shrek precisa encontrar um jeito de se livrar do contrato para recuperar sua vida normal e seu grande amor."));
    }
}