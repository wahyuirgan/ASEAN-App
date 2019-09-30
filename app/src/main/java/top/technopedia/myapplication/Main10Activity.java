package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        WebView view = (WebView) findViewById(R.id.konten9);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Myanmar menjadi anggota ASEAN ke 9 pada 23 Juli 1997 bersamaan dengan masuknya Laos. Myanmar resmi menjadi anggota " +
                "ASEAN dalam pertemuan para Menteri Luar Negeri ASEAN yang ke 30 yang diadakan di Subang Jaya, Malaysia. Myanmar " +
                "berperan aktif dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 2 kali yaitu tahun 2002 dan 2012.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
