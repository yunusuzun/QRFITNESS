package com.yunusuzun.qrcodereader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private Button tekrarTara;  // viewımızdaki buton
    private TextView text;
    private TextView baslik; // viewımızdaki textview
    private String stringExtra; // bir önceki activityden gelen string
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        logo = findViewById(R.id.logo);
        tekrarTara = findViewById(R.id.tekrarTara);
        text = findViewById(R.id.text);
        baslik = findViewById(R.id.baslik);

        stringExtra = getIntent().getStringExtra("text");

        switch(stringExtra){

            case "birincialet":
                baslik.setText("KOL VE BİLEK ÇALIŞTIRMA");
                text.setText("Aleti elinizi üstüne koyduktan sonra çevirerek kullanabilirsiniz. Tekrar sayısının önemi yok. Hareketin etkili olması için 1.5-2 dakika süreyle yapabilir, daha sonra ise dönüş yönünü değiştirerek bir sete daha başlayabilirsiniz. ");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.bir));
                break;
            case "ikincialet":
                baslik.setText("TEKLİ YÜRÜYÜŞ ALETİ");
                text.setText("Yağ yakmaya yarayan, hem ön bacak kaslarını hem de geriye doğru çekiş yapması sebebiyle kalçayı çok iyi çalıştıran bir alet. Bacaklar arasındaki denge ve koordinasyon bu hareketi yaparken çok önemli; yoksa düşebilir ya da sakatlanabilirsiniz.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.iki));
                break;
            case "ucuncualet":
                baslik.setText("STEP VE BEL ÇEVİRME");
                text.setText("Bacak ve kalça kaslarını çalıştıran ve yağ yakmayı sağlayan bir spor aleti. İdeal süre 15-20 dakika. Merdiven çıkmaya benzer bir hareket yapıyorsunuz. Kalçayı vücudun gerisine atmaya ve diz kapaklarının parmak ucunu geçmemesine dikkat edilmesi gerek.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.uc));
                break;
            case "dorduncualet":
                baslik.setText("MAKAS");
                text.setText("Hareketi yaparken omuzları mümkün olduğu kadar dik tutup kürek kemiklerini birbirine yaklaştırmaya, çeneyle göğüs arasında da bir yumruk kadar mesafe bırakmaya dikkat edin. Bacaklarınızı dışarıya doğru açtığınızda nefes verin, kaparken nefes alın.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.dort));
                break;
            case "besincialet":
                baslik.setText("MEKİK ALETİ");
                text.setText("Derin bir nefes alarak harekete başlıyorsunuz. Nefes verdiğinizde aleti bacaklarınızla kaldırıyor, nefes verirken indiriyorsunuz. Makineyi kullanırken bacaklarınız düz, dizleriniz hafif bükülü olmalı.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.bes));
                break;
            case "altincialet":
                baslik.setText("BEL ÇEVİRME");
                text.setText("Karın kası, yan kaslar ve arka bel kasları bu hareket ile çalışır. Vücudun üst tarafını sabit tutmanız gerekiyor ki belden aşağı tarafı çalıştırdığınız zaman ilgili kaslar etkilensin. Hareketi yaparken dönüş açılarını dar tutmaya dikkat etmelisiniz.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.alti));
                break;
            case "yedincialet":
                baslik.setText("BİSİKLET VE BEL ÇEVİRME");
                text.setText("Bel ve bacak güçlendirmek için kullanabileceğiniz bir alet. Aynı anda hem bisiklet sürerek tüm bacak kaslarınızı çalıştırıyorsunuz hem de üst vücut sabit ve ayakları çevirerek bel kaslarınızı çalıştırıyorsunuz.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.yedi));
                break;
            case "sekizincialet":
                baslik.setText("İKİLİ YÜRÜYÜŞ");
                text.setText("Bacak kaslarını çalıştırmaya yarayan bir alet. Aynı anda iki kişi yapabilirsiniz. Ayaklarınızı gösterilen turuncu bölgeye koyarak ileri geri hareket ettirin. Bu hareket sizin zayıflamanıza ve eklemlerinizin açılmasına yardımcı olacaktır.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.sekiz));
                break;
            case "dokuzuncualet":
                baslik.setText("SARKAÇ");
                text.setText("Belinizi güçlendirmek için kullanacağınız bir spor aletidir. Makinenin üzerine çıkarak ayaklarınızı sağa ve sola hareket ettirmeye yarar. Kullanırken çok dikkat edilmelidir. Hızlı yapıldığında felakete yol açabilir.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.dokuz));
                break;
            case "onuncualet":
                baslik.setText("VÜCUT GELİŞTİRME");
                text.setText("Makineye sırtınız dönük oturuyor ve kendinizi yukarı doğru çekip indiriyorsunuz. Bu harekette de vücudun duruşu çok önemli, dik durmaya ve karın kaslarını iyice sıkmaya dikkat etmelisiniz.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.a));
                break;
            case "onbirincialet":
                baslik.setText("BACAK GÜÇLENDİRME");
                text.setText("15 tekrardan oluşan 3 setlik bir programı her gün uygulayabilirsiniz. Bu sayede bacaklarınızın üst kısmını çalıştırabilirsiniz. Ayaklarınızın açısını değiştirdikçe çalıştırdığınız kasları da değiştirebilirsiniz.");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.b));
                break;
            case "onikincialet":
                baslik.setText("İKİLİ BİSİKLET");
                text.setText("Bisiklet de yağ yakmak için ideal aletlerden. 20-25 dakika arasında kullanılması tavsiye ediliyor. Dizinde problem olanlar ya da dizinin arasındaki eklem sıvısı azalanlara önerilmiyor. Bel fıtığı olanlar ise arkasında desteği olan bisikletleri kullanmalı. ");
                logo.setImageDrawable(getResources().getDrawable(R.drawable.c));
                break;
            default:
                //nothing
        }

        tekrarTara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeActivity();

            }
        });

    }

    private void changeActivity(){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();

    }
}
