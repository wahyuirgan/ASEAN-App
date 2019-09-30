package top.technopedia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView view = (WebView) findViewById(R.id.konten1);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Indonesia merupakan salah satu dari 5 negara yang menjadi pendiri dan memprakarsai ASEAN. " +
                "Indonesia menjadi salah satu dari 5 negara yang menandatangani Deklarasi Bangkok tanggal  8 Agustus 1967 di " +
                "Kota Bangkok, Thailand. Indonesia diwakili oleh menteri luar negeri saat itu Adam Malik. Indonesia berperan aktif" +
                "dalam ASEAN dengan menjadi tuan rumah ASEAN Summit 3 kali yaitu tahun 1976, 2003 dan 2011. Kantor Sekretariat Jenderal " +
                "ASEAN juga berada di Jakarta. Indonesia pernah menjabat sebagai Sekretaris Jenderal ASEAN  3 kali yaitu dari 7 Juni 1976 - 18 " +
                "Februari 1978 yang dipegang oleh Hartono Rekso Dharsono, dari 19 Februari 1978 - 30 Juni 1978 yang dipegang oleh Umarjadi " +
                "Notowijono dan dari 17 Juli 1989 - 1 Januari 1993 yang dipegang oleh Rusli Noor.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }
}
