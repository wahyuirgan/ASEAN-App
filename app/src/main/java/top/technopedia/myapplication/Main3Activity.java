package top.technopedia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        WebView view = (WebView) findViewById(R.id.konten2);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Malaysia merupakan salah satu dari 5 negara yang menjadi pendiri dan memprakarsai ASEAN. " +
                "Malaysia menjadi salah satu dari 5 negara yang menandatangani Deklarasi Bangkok tanggal  8 Agustus 1967 di " +
                "Kota Bangkok, Thailand. Malaysia diwakili oleh wakil perdana menteri saat itu Tun Abdul Razak. Malaysia berperan " +
                "aktif dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 3 kali yaitu tahun 1977, 2005 dan 2015. Malaysia pernah " +
                "menjabat sebagai Sekretaris Jenderal ASEAN 2 kali yaitu dari 10 Juli 1978 - 30 Juli 1980 yang dipegang oleh Datuk Ali " +
                "Bin Abdullah dan dari 1 Januari 1997 - 31 Desember 1997 yang dipegang oleh Ajit Singh.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");
    }
}
