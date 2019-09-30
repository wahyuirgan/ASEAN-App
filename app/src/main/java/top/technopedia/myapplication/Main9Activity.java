package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        WebView view = (WebView) findViewById(R.id.konten8);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Laos menjadi anggota ASEAN ke 8 pada 23 Juli 1997 bersamaan dengan masuknya Myanmar. Laos resmi menjadi anggota " +
                "ASEAN dalam pertemuan para Menteri Luar Negeri ASEAN yang ke 30 yang diadakan di Subang Jaya, Malaysia. Laos " +
                "berperan aktif dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 2 kali yaitu tahun 2004 dan 2016.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
