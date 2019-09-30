package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        WebView view = (WebView) findViewById(R.id.konten4);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Singapura merupakan salah satu dari 5 negara yang menjadi pendiri dan memprakarsai ASEAN. " +
                "Singapura menjadi salah satu dari 5 negara yang menandatangani Deklarasi Bangkok tanggal  8 Agustus 1967 di " +
                "Kota Bangkok, Thailand. Singapura diwakili oleh menteri luar negeri saat itu S. Rajaratnam. Singapura berperan aktif" +
                "dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 3 kali yaitu tahun 1992, 2007 dan 2018. Singapura pernah " +
                "menjabat sebagai Sekretaris Jenderal ASEAN  2 kali yaitu dari 18 Juli 1982 - 15 Juli 1984 yang dipegang oleh " +
                "Chan Kai Yau dan dari 1 Januari 2003 - 31 Desember 2007 yang dipegang oleh Ong Keong Yong.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
