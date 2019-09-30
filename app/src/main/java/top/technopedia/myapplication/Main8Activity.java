package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        WebView view = (WebView) findViewById(R.id.konten7);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Vietnam menjadi anggota ASEAN ke 7 pada 28 Juli 1995. Vietnam resmi menjadi anggota ASEAN dalam pertemuan para " +
                "Menteri Luar Negeri ASEAN yang ke 28 yang diadakan di Bandar Seri Begawan, Brunei. Vietnam berperan aktif dalam ASEAN " +
                "dengan menjadi tuan rumah ASEAN Summit 2 kali yaitu tahun 1998 dan 2010. Vietnam pernah menjabat sebagai Sekretaris " +
                "Jenderal ASEAN  1 kali yaitu dari 1 Januari 2013 - 31 Desember 2017 yang dipegang oleh Le Luong Minh.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
