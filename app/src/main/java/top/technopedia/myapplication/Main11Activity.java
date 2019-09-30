package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        WebView view = (WebView) findViewById(R.id.konten10);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Kamboja menjadi anggota ASEAN ke 10 pada 16 Desember 1998. Kamboja resmi menjadi anggota ASEAN dalam upacara Khusus " +
                "Penerimaan tanggal 30 April 1999 yang diadakan di Hanoi, Vietnam. Kamboja berperan aktif dalam ASEAN dengan menjadi " +
                "tuan rumah ASEAN Summit 1 kali yaitu tahun 2014.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
