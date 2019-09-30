package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        WebView view = (WebView) findViewById(R.id.konten5);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Thailand merupakan salah satu dari 5 negara yang menjadi pendiri dan memprakarsai ASEAN. " +
                "Thailand menjadi tuan rumah Deklarasi Bangkok tanggal  8 Agustus 1967 dan ikut menandatanganinya. " +
                "Thailand diwakili oleh menteri luar negeri saat itu Thanat Khoman. Thailand berperan aktif" +
                "dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 2 kali yaitu tahun 1995 dan 2009. Thailand pernah " +
                "menjabat sebagai Sekretaris Jenderal ASEAN  2 kali yaitu dari 16 Juli 1984 - 15 Juli 1986 yang dipegang oleh " +
                "Phan Wannamethee dan dari 1 Januari 2008 - 31 Desember 2012 yang dipegang oleh Surin Pitsuwan.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
