package com.example.FashionAssistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.FashionAssistant.databinding.ActivityAboutusBinding;
import com.example.FashionAssistant.databinding.ActivityShoppingBinding;

public class Shopping extends DrawerbaseActivity {

    private CardView Bewakoof,FirstCry,Giva,HandM,LifeStyle,LimeRoad,MandS,Max,Myntra,Nykaa,NykaaMen,ShoppersStop,TataCliq,TataOnline,Tira,UrbanCompnay,Zivame,adidas;
    ActivityShoppingBinding activityShoppingBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityShoppingBinding = ActivityShoppingBinding.inflate(getLayoutInflater());
        setContentView(activityShoppingBinding.getRoot());

        Bewakoof = (CardView) findViewById(R.id.Bewakoof);
        Bewakoof.setOnClickListener(v-> {
            gotoUrl("https://www.bewakoof.com/");
        });
        FirstCry = (CardView) findViewById(R.id.FirstCry);
        FirstCry.setOnClickListener(v-> {
            gotoUrl("https://www.firstcry.com/?&ref=SEM_GSN_Brand_FirstCry_India");
        });
        Giva = (CardView) findViewById(R.id.Giva);
        Giva.setOnClickListener(v-> {
            gotoUrl("https://www.giva.co/?&utm_campaign=");
        });

        HandM = (CardView) findViewById(R.id.HandM);
        HandM.setOnClickListener(v-> {
            gotoUrl("https://www2.hm.com/en_in/index.html/");
        });

        LifeStyle = (CardView) findViewById(R.id.LifeStyle);
        LifeStyle.setOnClickListener(v-> {
            gotoUrl("https://www.lifestylestores.com/in/en/search?discount=50,100");
        });

        LimeRoad = (CardView) findViewById(R.id.LimeRoad);
        LimeRoad.setOnClickListener(v-> {
            gotoUrl("https://www.limeroad.com/");
        });

        MandS = (CardView) findViewById(R.id.MandS);
        MandS.setOnClickListener(v-> {
            gotoUrl("https://www.marksandspencer.in/?adgroupid=100463569196");
        });

        Max = (CardView) findViewById(R.id.Max);
        Max.setOnClickListener(v-> {
            gotoUrl("https://www.maxfashion.in/in/en/search?q=%3Abadge.title.en%3ABuy%202%20Get%201&&adgroupid=54250473527");
        });

        Myntra = (CardView) findViewById(R.id.Myntra);
        Myntra.setOnClickListener(v-> {
            gotoUrl("https://www.myntra.com/");
        });

        Nykaa = (CardView) findViewById(R.id.Nykaa);
        Nykaa.setOnClickListener(v-> {
            gotoUrl("https://www.nykaa.com/?tagtag_uid=dd87a079b0b7255a219370838a37ff62");
        });

        NykaaMen = (CardView) findViewById(R.id.NykaaMen);
        NykaaMen.setOnClickListener(v-> {
            gotoUrl("https://www.nykaaman.com/");
        });

        ShoppersStop = (CardView) findViewById(R.id.ShoppersStop);
        ShoppersStop.setOnClickListener(v-> {
            gotoUrl("https://www.shoppersstop.com/?ef_id=CjwKCAjwscGjBhAXEiwAswQqNBA6TZ9WExDPPXrg9jacWoB2Vmca6mVoVrvF47cAO75c6UjFNAqyXhoCz8AQAvD_BwE:G:s");
        });

        TataCliq = (CardView) findViewById(R.id.TataCliq);
        TataCliq.setOnClickListener(v-> {
            gotoUrl("https://www.tatacliq.com/?cid=ps:Tata_Brand_Top_Regions_12102022:google:TopRegions_Exact:brand");
        });
        TataOnline = (CardView) findViewById(R.id.TataOnline);
        TataOnline.setOnClickListener(v-> {
            gotoUrl("https://www.tatacliq.com/?cid=ps:Tata_Brand_Top_Regions_12102022:google:TopRegions_Exact:brand");
        });

        Tira = (CardView) findViewById(R.id.Tira);
        Tira.setOnClickListener(v-> {
            gotoUrl("https://www.tirabeauty.com/");
        });

        UrbanCompnay = (CardView) findViewById(R.id.UrbanCompnay);
        UrbanCompnay.setOnClickListener(v-> {
            gotoUrl("https://www.urbancompany.com/surat");
        });

        Zivame = (CardView) findViewById(R.id.Zivame);
        Zivame.setOnClickListener(v-> {
            gotoUrl("https://www.zivame.com/?%243p=a_google_adwords&%24always_deeplink=false&~ad_set_id=134366376169&~campaign_id=15697371507&~channel=g&~keyword=zivame&~placement&~campaign=Zivame_Brand_Exact_Dec%2721&_branch_match_id=1190553553449776586&_branch_referrer=H4sIAAAAAAAAA02Oz26DMAyHnyY9QknaRJ0UTfvDpB76ArtYbuICIoSI0Ibu6UfYZZIP9vfpZ7ud5xBfylIseCswhMJ1vi%2Fv5486Xga%2BpOsr4wcRNEIzjo0jQJvGycbditElfEawRCGn9A1dpCzWxl3R9HCfnG7zBSbeGP9aK6VU%2FHQPHKgw47CCHVM1Wog0Q2d1JQ5CSqFkJU%2FZGBwCdo3f3FGelFDVca821aL35HSTh56e%2BS39t%2Fp%2FUn9vCN4n9BbqBc0Mn2QYV7z6BaXKGkD9AAAA");
        });

        adidas = (CardView) findViewById(R.id.adidas);
        adidas.setOnClickListener(v-> {
            gotoUrl("https://www.adidas.co.in/outlet?cm_mmc=AdieSEM_Google-_-adidas-Brand-B-Exact-_-Search-_--_-dv%3AeCom-_-cn%3Aadidas-Brand-B-Exact-_-pc%3AGoogle&cm_mmc1=IN&cm_mmc2=PPC-Multiple--Multiple-Multiple-IN-EMEA-eCom-Paid_Search");
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse((s));
        startActivity(new Intent(Intent.ACTION_VIEW,uri));


    }
}