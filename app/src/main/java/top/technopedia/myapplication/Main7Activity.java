package top.technopedia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        WebView view = (WebView) findViewById(R.id.konten6);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Brunei menjadi anggota ASEAN ke 6 pada 7 Januari 1984 atau satu minggu setelah kemerdekaannya. " +
                "Brunei resmi menjadi anggota ASEAN dalam Sidang Khusus Menteri - Menteri Luar Negeri ASEAN atau ASEAN Ministrial " +
                "Meeting / AMM yang diadakan di Jakarta, Indonesia. Brunei berperan aktif dalam ASEAN dengan menjadi tuan rumah " +
                "ASEAN Summit 2 kali yaitu tahun 2001 dan 2013. Brunei pernah menjabat sebagai Sekretaris Jenderal ASEAN  2 kali " +
                "yaitu dari 16 Juli 1986 - 16 Juli 1989 yang dipegang oleh Roderick Yong dan dari 1 Januari 2018 - sekarang yang " +
                "dipegang oleh Lim Jock Hoi.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
