package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        WebView view = (WebView) findViewById(R.id.konten3);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Filiphina merupakan salah satu dari 5 negara yang menjadi pendiri dan memprakarsai ASEAN. " +
                "Filiphina menjadi salah satu dari 5 negara yang menandatangani Deklarasi Bangkok tanggal  8 Agustus 1967 di " +
                "Kota Bangkok, Thailand. Filiphina diwakili oleh menteri luar negeri saat itu Narciso Ramos. Filiphina berperan aktif" +
                "dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 3 kali yaitu tahun 1987, 2007 dan 2017. Filiphina pernah " +
                "menjabat sebagai Sekretaris Jenderal ASEAN  2 kali yaitu dari 1 Juli 1980 - 1 Juli 1982 yang dipegang oleh " +
                "Narciso G. Reyes dan dari 1 Januari 1998 - 31 Desember 2002 yang dipegang oleh Rodolfo Severino Jr..";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
