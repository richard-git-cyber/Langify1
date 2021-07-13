package com.example.langify1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private MediaPlayer mediaPlayer;
    private TextView nameofvariable;
    private TextView level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sets the first screen as the home page
        setContentView(R.layout.home_page_main);

    }
//when a button is clicked it will come here
    public void click(View v) {
        Intent intent;
        //switch statment with the many buttons in the app it will come here
        switch (v.getId()) {
            //when the button with the id button
            case R.id.button:
                //when the button with the id elb is pushed
            case R.id.elb:
                //when the button with the id of mlb is pushed
            case R.id.mlb:
                //when the button hlb is pushed
            case R.id.hlb:
                //when the button emotionsNext11 is pushed
            case R.id.emotionsNext11:
                //when the button emotionNext11
            case R.id.emotionNext11:
                //When the buttons above the difficulties screen is pulled up
                setContentView(R.layout.hard);
                break;
                //when the button with the id of easy is pushed
            case R.id.easy:
                //when the button with the id of brownNext is pushed
            case R.id.brownNext:
                //when the button brownNext2 is pushed
            case R.id.brownNext2:
                //when the button purpleNext is pushed
            case R.id.purpleNext:
            case R.id.purpleNext2:
            case R.id.numbereNext5:
            case R.id.numbersNext5:
            case R.id.numbersNext11:
            case R.id.numbereNext11:
            case R.id.numbereNext16:
            case R.id.numbersNext16:
            case R.id.numbersNext21:
            case R.id.numbereNext21:
            case R.id.weeksNext7:
            case R.id.weekNext7:
            case R.id.monthsNext6:
            case R.id.monthNext6:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.medium:
            case R.id.eln:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.mln:
            case R.id.hards:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.el1:
            case R.id.pinkflip2:
                setContentView(R.layout.pink);
                break;
            case R.id.pinkflip:
                setContentView(R.layout.pink2);
                break;
            case R.id.pinkNext:
            case R.id.pinkNext2:
            case R.id.redflip2:
                setContentView(R.layout.red);
                break;
            case R.id.redflip:
                setContentView(R.layout.red2);
                break;
            case R.id.redNext:
            case R.id.redNext2:
            case R.id.blueflip2:
                setContentView(R.layout.blue);
                break;
            case R.id.blueflip:
                setContentView(R.layout.blue2);
                break;
            case R.id.blueNext:
            case R.id.blueNext2:
            case R.id.greenflip2:
                setContentView(R.layout.green);
                break;
            case R.id.greenflip:
                setContentView(R.layout.green2);
                break;
            case R.id.greenNext:
            case R.id.greenNext2:
            case R.id.brownflip2:
                setContentView(R.layout.brown);
                break;
            case R.id.brownflip:
                setContentView(R.layout.brown2);
                break;
            case R.id.el2:
            case R.id.whiteflip2:
                setContentView(R.layout.white);
                break;
            case R.id.whiteflip:
                setContentView(R.layout.white2);
                break;
            case R.id.whiteNext:
            case R.id.whiteNext2:
            case R.id.blackflip2:
                setContentView(R.layout.black);
                break;
            case R.id.blackflip:
                setContentView(R.layout.black2);
                break;
            case R.id.blackNext:
            case R.id.blackNext2:
            case R.id.greyflip2:
                setContentView(R.layout.grey);
                break;
            case R.id.greyflip:
                setContentView(R.layout.grey2);
                break;
            case R.id.greyNext:
            case R.id.greyNext2:
            case R.id.orangeflip2:
                setContentView(R.layout.orange);
                break;
            case R.id.orangeflip:
                setContentView(R.layout.orange2);
                break;
            case R.id.orangeNext:
            case R.id.orangeNext2:
            case R.id.yellowflip2:
                setContentView(R.layout.yellow);
                break;
            case R.id.yellowflip:
                setContentView(R.layout.yellow2);
                break;
            case R.id.yellowNext:
            case R.id.yellowNext2:
            case R.id.purpleflip2:
                setContentView(R.layout.purple);
                break;
            case R.id.purpleflip:
                setContentView(R.layout.purple2);
                break;
            case R.id.el3:
            case R.id.numbersflip:
                setContentView(R.layout.numbere);
                break;
            case R.id.numbereflip:
                setContentView(R.layout.numbers);
                break;
            case R.id.numbersNext:
            case R.id.numbereNext:
            case R.id.numbersflip2:
                setContentView(R.layout.numbere2);
                break;
            case R.id.numbereflip2:
                setContentView(R.layout.numbers2);
                break;
            case R.id.numbereNext2:
            case R.id.numbersNext2:
            case R.id.numbersflip3:
                setContentView(R.layout.numbere3);
                break;
            case R.id.numbereflip3:
                setContentView(R.layout.numbers3);
                break;
            case R.id.numbersNext3:
            case R.id.numbereNext3:
            case R.id.numbersflip4:
                setContentView(R.layout.numbere4);
                break;
            case R.id.numbereflip4:
                setContentView(R.layout.numbers4);
                break;
            case R.id.numbereNext4:
            case R.id.numbersNext4:
            case R.id.numbersflip5:
                setContentView(R.layout.numbere5);
                break;
            case R.id.numbereflip5:
                setContentView(R.layout.numbers5);
                break;
            case R.id.el4:
            case R.id.numbersflip6:
                setContentView(R.layout.numbere6);
                break;
            case R.id.numbereflip6:
                setContentView(R.layout.numbers6);
                break;
            case R.id.numbereNext6:
            case R.id.numbersNext6:
            case R.id.numbersflip7:
                setContentView(R.layout.numbere7);
                break;
            case R.id.numbereflip7:
                setContentView(R.layout.numbers7);
                break;
            case R.id.numbereNext7:
            case R.id.numbersNext7:
            case R.id.numbersflip8:
                setContentView(R.layout.numbere8);
                break;
            case R.id.numbereflip8:
                setContentView(R.layout.numbers8);
                break;
            case R.id.numbereNext8:
            case R.id.numbersNext8:
            case R.id.numbersflip9:
                setContentView(R.layout.numbere9);
                break;
            case R.id.numbereflip9:
                setContentView(R.layout.numbers9);
                break;
            case R.id.numbereNext9:
            case R.id.numbersNext9:
            case R.id.numbersflip10:
                setContentView(R.layout.numbere10);
                break;
            case R.id.numbereflip10:
                setContentView(R.layout.numbers10);
                break;
            case R.id.numbereNext10:
            case R.id.numbersNext10:
            case R.id.numbersflip11:
                setContentView(R.layout.numbere11);
                break;
            case R.id.numbereflip11:
                setContentView(R.layout.numbers11);
                break;
            case R.id.el5:
            case R.id.numbersflip12:
                setContentView(R.layout.numbere12);
                break;
            case R.id.numbereflip12:
                setContentView(R.layout.numbers12);
                break;
            case R.id.numbereNext12:
            case R.id.numbersNext12:
            case R.id.numbersflip13:
                setContentView(R.layout.numbere13);
                break;
            case R.id.numbereflip13:
                setContentView(R.layout.numbers13);
                break;
            case R.id.numbereNext13:
            case R.id.numbersNext13:
            case R.id.numbersflip14:
                setContentView(R.layout.numbere14);
                break;
            case R.id.numbereflip14:
                setContentView(R.layout.numbers14);
                break;
            case R.id.numbersNext14:
            case R.id.numbereNext14:
            case R.id.numbersflip15:
                setContentView(R.layout.numbere15);
                break;
            case R.id.numbereflip15:
                setContentView(R.layout.numbers15);
                break;
            case R.id.numbersNext15:
            case R.id.numbereNext15:
            case R.id.numbersflip16:
                setContentView(R.layout.numbere16);
                break;
            case R.id.numbereflip16:
                setContentView(R.layout.numbers16);
                break;
            case R.id.el6:
            case R.id.numbersflip17:
                setContentView(R.layout.numbere17);
                break;
            case R.id.numbereflip17:
                setContentView(R.layout.numbers17);
            case R.id.numbersNext17:
            case R.id.numbereNext17:
            case R.id.numbersflip18:
                setContentView(R.layout.numbers18);
                break;
            case R.id.numbereflip18:
                setContentView(R.layout.numbers18);
                break;
            case R.id.numbersNext18:
            case R.id.numbereNext18:
            case R.id.numbersflip19:
                setContentView(R.layout.numbere19);
                break;
            case R.id.numbereflip19:
                setContentView(R.layout.numbers19);
                break;
            case R.id.numbersNext19:
            case R.id.numbereNext19:
            case R.id.numbersflip20:
                setContentView(R.layout.numbere20);
                break;
            case R.id.numbereflip20:
                setContentView(R.layout.numbers20);
                break;
            case R.id.numbereNext20:
            case R.id.numbersNext20:
            case R.id.numbersflip21:
                setContentView(R.layout.numbere21);
                break;
            case R.id.numbereflip21:
                setContentView(R.layout.numbers21);
                break;
            case R.id.el7:
            case R.id.weeksflip:
                setContentView(R.layout.week);
                break;
            case R.id.weekflip:
                setContentView(R.layout.weeks);
                break;
            case R.id.weekNext:
            case R.id.weeksNext:
            case R.id.weeksflip2:
                setContentView(R.layout.week2);
                break;
            case R.id.weekflip2:
                setContentView(R.layout.weeks2);
                break;
            case R.id.weeksNext2:
            case R.id.weekNext2:
            case R.id.weeksflip3:
                setContentView(R.layout.week3);
                break;
            case R.id.weekflip3:
                setContentView(R.layout.weeks3);
                break;
            case R.id.weeksNext3:
            case R.id.weekNext3:
            case R.id.weeksflip4:
                setContentView(R.layout.week4);
                break;
            case R.id.weekflip4:
                setContentView(R.layout.weeks4);
                break;
            case R.id.weekNext4:
            case R.id.weeksNext4:
            case R.id.weeksflip5:
                setContentView(R.layout.week5);
                break;
            case R.id.weekflip5:
                setContentView(R.layout.weeks5);
                break;
            case R.id.weeksNext5:
            case R.id.weekNext5:
            case R.id.weeksflip6:
                setContentView(R.layout.week6);
                break;
            case R.id.weekflip6:
                setContentView(R.layout.weeks6);
                break;
            case R.id.weeksNext6:
            case R.id.weekNext6:
            case R.id.weeksflip7:
                setContentView(R.layout.week7);
                break;
            case R.id.weekflip7:
                setContentView(R.layout.weeks7);
                break;
            case R.id.el8:
            case R.id.monthsflip:
                setContentView(R.layout.month);
                break;
            case R.id.monthflip:
                setContentView(R.layout.months);
                break;
            case R.id.monthNext:
            case R.id.monthsNext:
            case R.id.monthsflip2:
                setContentView(R.layout.month2);
                break;
            case R.id.monthflip2:
                setContentView(R.layout.months2);
                break;
            case R.id.monthsNext2:
            case R.id.monthNext2:
            case R.id.monthsflip3:
                setContentView(R.layout.month3);
                break;
            case R.id.monthflip3:
                setContentView(R.layout.months3);
                break;
            case R.id.monthsNext3:
            case R.id.monthNext3:
            case R.id.monthsflip4:
                setContentView(R.layout.month4);
                break;
            case R.id.monthflip4:
                setContentView(R.layout.months4);
                break;
            case R.id.monthsNext4:
            case R.id.monthNext4:
            case R.id.monthsflip5:
                setContentView(R.layout.month5);
                break;
            case R.id.monthflip5:
                setContentView(R.layout.months5);
                break;
            case R.id.monthsNext5:
            case R.id.monthNext5:
            case R.id.monthsflip6:
                setContentView(R.layout.month6);
                break;
            case R.id.monthflip6:
                setContentView(R.layout.months6);
                break;
            case R.id.el9:
            case R.id.monthsflip7:
                setContentView(R.layout.month7);
                break;
            case R.id.monthflip7:
                setContentView(R.layout.months7);
                break;
            case R.id.monthsNext7:
            case R.id.monthNext7:
            case R.id.monthsflip8:
                setContentView(R.layout.month8);
                break;
            case R.id.monthflip8:
                setContentView(R.layout.months8);
                break;
            case R.id.monthsNext8:
            case R.id.monthNext8:
            case R.id.monthsflip9:
                setContentView(R.layout.month9);
                break;
            case R.id.monthflip9:
                setContentView(R.layout.months9);
                break;
            case R.id.monthNext9:
            case R.id.monthsNext9:
            case R.id.monthsflip10:
                setContentView(R.layout.month10);
                break;
            case R.id.monthflip10:
                setContentView(R.layout.months10);
                break;
            case R.id.monthNext10:
            case R.id.monthsNext10:
            case R.id.monthsflip11:
                setContentView(R.layout.month11);
                break;
            case R.id.monthflip11:
                setContentView(R.layout.months11);
                break;
            case R.id.monthNext11:
            case R.id.monthsNext11:
            case R.id.monthsflip12:
                setContentView(R.layout.month12);
                break;
            case R.id.monthflip12:
                setContentView(R.layout.months12);
                break;
            case R.id.monthsNext12:
            case R.id.monthNext12:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el10:
            case R.id.greetingsflip:
                setContentView(R.layout.greeting);
                break;
            case R.id.greetingflip:
                setContentView(R.layout.greetings);
                break;
            case R.id.greetingNext:
            case R.id.greetingsNext:
            case R.id.greetingsflip2:
                setContentView(R.layout.greeting2);
                break;
            case R.id.greetingflip2:
                setContentView(R.layout.greetings2);
                break;
            case R.id.greetingNext2:
            case R.id.greetingsNext2:
            case R.id.greetingsflip3:
                setContentView(R.layout.greeting3);
                break;
            case R.id.greetingflip3:
                setContentView(R.layout.greetings3);
                break;
            case R.id.greetingNext3:
            case R.id.greetingsNext3:
            case R.id.greetingsflip4:
                setContentView(R.layout.greeting4);
                break;
            case R.id.greetingflip4:
                setContentView(R.layout.greetings4);
                break;
            case R.id.greetingsNext4:
            case R.id.greetingNext4:
            case R.id.greetingsflip5:
                setContentView(R.layout.greeting5);
                break;
            case R.id.greetingflip5:
                setContentView(R.layout.greetings5);
                break;
            case R.id.greetingNext5:
            case R.id.greetingsNext5:
            case R.id.greetingsflip6:
                setContentView(R.layout.greeting6);
                break;
            case R.id.greetingflip6:
                setContentView(R.layout.greetings6);
                break;
            case R.id.greetingNext6:
            case R.id.greetingsNext6:
            case R.id.greetingsflip7:
                setContentView(R.layout.greeting7);
                break;
            case R.id.greetingflip7:
                setContentView(R.layout.greetings7);
                break;
            case R.id.greetingsNext7:
            case R.id.greetingNext7:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el11:
            case R.id.heflip2:
                setContentView(R.layout.he);
                break;
            case R.id.heflip:
                setContentView(R.layout.he2);
                break;
            case R.id.heNext:
            case R.id.heNext2:
            case R.id.sheflip2:
                setContentView(R.layout.she);
                break;
            case R.id.sheflip:
                setContentView(R.layout.she2);
                break;
            case R.id.sheNext:
            case R.id.sheNext2:
            case R.id.iflip2:
                setContentView(R.layout.i);
                break;
            case R.id.iflip:
                setContentView(R.layout.i2);
                break;
            case R.id.iNext:
            case R.id.iNext2:
            case R.id.themflip2:
                setContentView(R.layout.them);
                break;
            case R.id.themflip:
                setContentView(R.layout.them2);
                break;
            case R.id.themNext:
            case R.id.themNext2:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el12:
            case R.id.myflip2:
                setContentView(R.layout.my);
                break;
            case R.id.myflip:
                setContentView(R.layout.my2);
                break;
            case R.id.myNext:
            case R.id.myNext2:
            case R.id.nameflip2:
                setContentView(R.layout.name);
                break;
            case R.id.nameflip:
                setContentView(R.layout.name2);
                break;
            case R.id.nameNext:
            case R.id.nameNext2:
            case R.id.haveflip2:
                setContentView(R.layout.have);
                break;
            case R.id.haveflip:
                setContentView(R.layout.have2);
                break;
            case R.id.haveNext:
            case R.id.haveNext2:
            case R.id.needflip2:
                setContentView(R.layout.need);
                break;
            case R.id.needflip:
                setContentView(R.layout.need2);
                break;
            case R.id.needNext:
            case R.id.needNext2:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el13:
            case R.id.funflip2:
                setContentView(R.layout.fun);
                break;
            case R.id.funflip:
                setContentView(R.layout.fun2);
                break;
            case R.id.funNext:
            case R.id.funNext2:
            case R.id.morningflip2:
                setContentView(R.layout.morning);
                break;
            case R.id.morningflip:
                setContentView(R.layout.morning2);
                break;
            case R.id.morningNext:
            case R.id.morningNext2:
            case R.id.nightflip2:
                setContentView(R.layout.night);
                break;
            case R.id.nightflip:
                setContentView(R.layout.night2);
                break;
            case R.id.nightNext:
            case R.id.nightNext2:
            case R.id.howflip2:
                setContentView(R.layout.how);
                break;
            case R.id.howflip:
                setContentView(R.layout.how2);
                break;
            case R.id.howNext:
            case R.id.howNext2:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el14:
            case R.id.areflip2:
                setContentView(R.layout.are);
                break;
            case R.id.areflip:
                setContentView(R.layout.are2);
                break;
            case R.id.areNext:
            case R.id.areNext2:
            case R.id.youflip2:
                setContentView(R.layout.you);
                break;
            case R.id.youflip:
                setContentView(R.layout.you2);
                break;
            case R.id.youNext:
            case R.id.youNext2:
            case R.id.oldflip2:
                setContentView(R.layout.old);
                break;
            case R.id.oldflip:
                setContentView(R.layout.old2);
                break;
            case R.id.oldNext:
            case R.id.oldNext2:
            case R.id.youngflip2:
                setContentView(R.layout.young);
                break;
            case R.id.youngflip:
                setContentView(R.layout.young2);
                break;
            case R.id.youngNext:
            case R.id.youngNext2:
            case R.id.thanksflip2:
                setContentView(R.layout.thankyou);
                break;
            case R.id.thanksflip:
                setContentView(R.layout.thankyou2);
                break;
            case R.id.thanksNext:
            case R.id.thanksNext2:
            case R.id.welcomeflip2:
                setContentView(R.layout.youarewelcome);
                break;
            case R.id.welcomeflip:
                setContentView(R.layout.youarewelcome2);
                break;
            case R.id.welcomeNext:
            case R.id.welcomeNext2:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el15:
            case R.id.excusemeflip2:
                setContentView(R.layout.excuseme);
                break;
            case R.id.excusemeflip:
                setContentView(R.layout.excuseme2);
                break;
            case R.id.excusemeNext:
            case R.id.excusemeNext2:
            case R.id.pleaseflip2:
                setContentView(R.layout.please);
                break;
            case R.id.pleaseflip:
                setContentView(R.layout.please2);
                break;
            case R.id.pleaseNext:
            case R.id.pleaseNext2:
            case R.id.whatflip2:
                setContentView(R.layout.what);
                break;
            case R.id.whatflip:
                setContentView(R.layout.what2);
                break;
            case R.id.whatNext:
            case R.id.whatNext2:
            case R.id.yesflip2:
                setContentView(R.layout.yes);
                break;
            case R.id.yesflip:
                setContentView(R.layout.yes2);
                break;
            case R.id.yesNext:
            case R.id.yesNext2:
            case R.id.noflip2:
                setContentView(R.layout.no);
                break;
            case R.id.noflip:
                setContentView(R.layout.no2);
                break;
            case R.id.noNext:
            case R.id.noNext2:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el16:
            case R.id.emotionsflip:
                setContentView(R.layout.emotion);
                break;
            case R.id.emotionflip:
                setContentView(R.layout.emotions);
                break;
            case R.id.emotionsNext:
            case R.id.emotionNext:
            case R.id.emotionsflip2:
                setContentView(R.layout.emotion2);
                break;
            case R.id.emotionflip2:
                setContentView(R.layout.emotions2);
                break;
            case R.id.emotionsNext2:
            case R.id.emotionNext2:
            case R.id.emotionsflip4:
                setContentView(R.layout.emotion4);
                break;
            case R.id.emotionflip4:
                setContentView(R.layout.emotions4);
                break;
            case R.id.emotionNext4:
            case R.id.emotionsNext4:
            case R.id.emotionsflip5:
                setContentView(R.layout.emotion5);
                break;
            case R.id.emotionflip5:
                setContentView(R.layout.emotions5);
                break;
            case R.id.emotionsNext5:
            case R.id.emotionNext5:
                setContentView(R.layout.easy_levels);
                break;
            case R.id.el17:
            case R.id.emotionsflip6:
                setContentView(R.layout.emotion6);
                break;
            case R.id.emotionflip6:
                setContentView(R.layout.emotions6);
                break;
            case R.id.emotionsNext6:
            case R.id.emotionNext6:
            case R.id.emotionsflip7:
                setContentView(R.layout.emotion7);
                break;
            case R.id.emotionflip7:
                setContentView(R.layout.emotions7);
                break;
            case R.id.emotionsNext7:
            case R.id.emotionNext7:
            case R.id.emotionsflip8:
                setContentView(R.layout.emotion8);
                break;
            case R.id.emotionflip8:
                setContentView(R.layout.emotions8);
                break;
            case R.id.emotionsNext8:
            case R.id.emotionNext8:
            case R.id.emotionsflip9:
                setContentView(R.layout.emotion9);
                break;
            case R.id.emotionflip9:
                setContentView(R.layout.emotions9);
                break;
            case R.id.emotionsNext9:
            case R.id.emotionNext9:
            case R.id.emotionsflip10:
                setContentView(R.layout.emotion10);
                break;
            case R.id.emotionflip10:
                setContentView(R.layout.emotions10);
                break;
            case R.id.emotionsNext10:
            case R.id.emotionNext10:
            case R.id.emotionsflip11:
                setContentView(R.layout.emotion11);
                break;
            case R.id.emotionflip11:
                setContentView(R.layout.emotions11);
                break;
            case R.id.ml1:
            case R.id.descriptionsflip:
                setContentView(R.layout.description);
                break;
            case R.id.descriptionflip:
                setContentView(R.layout.descriptions);
                break;
            case R.id.descriptionsNext:
            case R.id.descriptionNext:
            case R.id.descriptionsflip2:
                setContentView(R.layout.description2);
                break;
            case R.id.descriptionflip2:
                setContentView(R.layout.descriptions2);
                break;
            case R.id.descriptionNext2:
            case R.id.descriptionsNext2:
            case R.id.descriptionsflip3:
                setContentView(R.layout.description3);
                break;
            case R.id.descriptionflip3:
                setContentView(R.layout.descriptions3);
                break;
            case R.id.descriptionsNext3:
            case R.id.descriptionNext3:
            case R.id.descriptionsflip4:
                setContentView(R.layout.description4);
                break;
            case R.id.descriptionflip4:
                setContentView(R.layout.descriptions4);
                break;
            case R.id.descriptionNext4:
            case R.id.descriptionsNext4:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml2:
            case R.id.descriptionsflip6:
                setContentView(R.layout.description6);
                break;
            case R.id.descriptionflip6:
                setContentView(R.layout.descriptions6);
                break;
            case R.id.descriptionNext6:
            case R.id.descriptionsNext6:
            case R.id.descriptionsflip24:
                setContentView(R.layout.description24);
                break;
            case R.id.descriptionflip24:
                setContentView(R.layout.descriptions24);
                break;
            case R.id.descriptionsNext24:
            case R.id.descriptionNext24:
            case R.id.descriptionsflip7:
                setContentView(R.layout.description7);
                break;
            case R.id.descriptionflip7:
                setContentView(R.layout.descriptions7);
                break;
            case R.id.descriptionNext7:
            case R.id.descriptionsNext7:
            case R.id.descriptionsflip8:
                setContentView(R.layout.description8);
                break;
            case R.id.descriptionflip8:
                setContentView(R.layout.descriptions8);
                break;
            case R.id.descriptionNext8:
            case R.id.descriptionsNext8:
            case R.id.descriptionsflip9:
                setContentView(R.layout.description9);
                break;
            case R.id.descriptionflip9:
                setContentView(R.layout.descriptions9);
                break;
            case R.id.descriptionsNext9:
            case R.id.descriptionNext9:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml3:
            case R.id.descriptionsflip10:
                setContentView(R.layout.description10);
                break;
            case R.id.descriptionflip10:
                setContentView(R.layout.descriptions10);
                break;
            case R.id.descriptionNext10:
            case R.id.descriptionsNext10:
            case R.id.descriptionsflip11:
                setContentView(R.layout.description11);
                break;
            case R.id.descriptionflip11:
                setContentView(R.layout.descriptions10);
                break;
            case R.id.descriptionsNext11:
            case R.id.descriptionNext11:
            case R.id.descriptionsflip12:
                setContentView(R.layout.description12);
                break;
            case R.id.descriptionflip12:
                setContentView(R.layout.descriptions12);
                break;
            case R.id.descriptionsNext12:
            case R.id.descriptionNext12:
            case R.id.descriptionsflip13:
                setContentView(R.layout.description13);
                break;
            case R.id.descriptionflip13:
                setContentView(R.layout.descriptions13);
                break;
            case R.id.descriptionsNext13:
            case R.id.descriptionNext13:
            case R.id.descriptionsflip14:
                setContentView(R.layout.description14);
                break;
            case R.id.descriptionflip14:
                setContentView(R.layout.descriptions14);
                break;
            case R.id.descriptionsNext14:
            case R.id.descriptionNext14:
            case R.id.descriptionsflip15:
                setContentView(R.layout.description15);
                break;
            case R.id.descriptionflip15:
                setContentView(R.layout.descriptions15);
                break;
            case R.id.descriptionsNext15:
            case R.id.descriptionNext15:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml4:
            case R.id.descriptionsflip16:
                setContentView(R.layout.description16);
                break;
            case R.id.descriptionflip16:
                setContentView(R.layout.descriptions16);
                break;
            case R.id.descriptionsNext16:
            case R.id.descriptionNext16:
            case R.id.descriptionsflip17:
                setContentView(R.layout.description17);
                break;
            case R.id.descriptionflip17:
                setContentView(R.layout.descriptions17);
                break;
            case R.id.descriptionsNext17:
            case R.id.descriptionNext17:
            case R.id.descriptionsflip18:
                setContentView(R.layout.description18);
                break;
            case R.id.descriptionflip18:
                setContentView(R.layout.descriptions18);
            case R.id.descriptionNext18:
            case R.id.descriptionsNext18:
            case R.id.descriptionsflip19:
                setContentView(R.layout.description19);
                break;
            case R.id.descriptionflip19:
                setContentView(R.layout.descriptions19);
                break;
            case R.id.descriptionsNext19:
            case R.id.descriptionNext19:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml5:
            case R.id.descriptionsflip20:
                setContentView(R.layout.description20);
                break;
            case R.id.descriptionflip20:
                setContentView(R.layout.descriptions20);
                break;
            case R.id.descriptionsNext20:
            case R.id.descriptionNext20:
            case R.id.descriptionsflip21:
                setContentView(R.layout.description21);
                break;
            case R.id.descriptionflip21:
                setContentView(R.layout.descriptions21);
                break;
            case R.id.descriptionsNext21:
            case R.id.descriptionNext21:
            case R.id.descriptionsflip22:
                setContentView(R.layout.description22);
                break;
            case R.id.descriptionflip22:
                setContentView(R.layout.descriptions22);
                break;
            case R.id.descriptionsNext22:
            case R.id.descriptionNext22:
            case R.id.descriptionsflip23:
                setContentView(R.layout.description23);
                break;
            case R.id.descriptionflip23:
                setContentView(R.layout.descriptions23);
                break;
            case R.id.descriptionNext23:
            case R.id.descriptionsNext23:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml6:
            case R.id.hobbiesflip:
                setContentView(R.layout.hobbie);
                break;
            case R.id.hobbieflip:
                setContentView(R.layout.hobbies);
                break;
            case R.id.hobbiesNext:
            case R.id.hobbieNext:
            case R.id.hobbiesflip2:
                setContentView(R.layout.hobbie2);
                break;
            case R.id.hobbieflip2:
                setContentView(R.layout.hobbies2);
                break;
            case R.id.hobbiesNext2:
            case R.id.hobbieNext2:
            case R.id.hobbiesflip3:
                setContentView(R.layout.hobbie3);
                break;
            case R.id.hobbieflip3:
                setContentView(R.layout.hobbies3);
                break;
            case R.id.hobbiesNext3:
            case R.id.hobbieNext3:
            case R.id.hobbiesflip4:
                setContentView(R.layout.hobbie4);
                break;
            case R.id.hobbieflip4:
                setContentView(R.layout.hobbies4);
                break;
            case R.id.hobbiesNext4:
            case R.id.hobbieNext4:
            case R.id.hobbiesflip5:
                setContentView(R.layout.hobbie5);
                break;
            case R.id.hobbieflip5:
                setContentView(R.layout.hobbies5);
                break;
            case R.id.hobbiesNext5:
            case R.id.hobbieNext5:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml7:
            case R.id.hobbiesflip6:
                setContentView(R.layout.hobbie6);
                break;
            case R.id.hobbieflip6:
                setContentView(R.layout.hobbies6);
                break;
            case R.id.hobbiesNext6:
            case R.id.hobbieNext6:
            case R.id.hobbiesflip7:
                setContentView(R.layout.hobbie7);
                break;
            case R.id.hobbieflip7:
                setContentView(R.layout.hobbies7);
                break;
            case R.id.hobbieNext7:
            case R.id.hobbiesNext7:
            case R.id.hobbiesflip8:
                setContentView(R.layout.hobbie8);
                break;
            case R.id.hobbieflip8:
                setContentView(R.layout.hobbies8);
                break;
            case R.id.hobbiesNext8:
            case R.id.hobbieNext8:
            case R.id.hobbiesflip9:
                setContentView(R.layout.hobbie9);
                break;
            case R.id.hobbieflip9:
                setContentView(R.layout.hobbies9);
                break;
            case R.id.hobbieNext9:
            case R.id.hobbiesNext9:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml8:
            case R.id.hobbiesflip10:
                setContentView(R.layout.hobbie10);
                break;
            case R.id.hobbieflip10:
                setContentView(R.layout.hobbies10);
                break;
            case R.id.hobbieNext10:
            case R.id.hobbiesNext10:
            case R.id.hobbiesflip11:
                setContentView(R.layout.hobbie11);
                break;
            case R.id.hobbieflip11:
                setContentView(R.layout.hobbies11);
                break;
            case R.id.hobbieNext11:
            case R.id.hobbies11:
            case R.id.hobbiesflip12:
                setContentView(R.layout.hobbie12);
                break;
            case R.id.hobbieflip12:
                setContentView(R.layout.hobbies12);
                break;
            case R.id.hobbiesNext12:
            case R.id.hobbieNext12:
            case R.id.hobbiesflip13:
                setContentView(R.layout.hobbie13);
                break;
            case R.id.hobbieflip13:
                setContentView(R.layout.hobbies13);
                break;
            case R.id.hobbiesNext13:
            case R.id.hobbieNext13:
            case R.id.hobbiesflip14:
                setContentView(R.layout.hobbie14);
                break;
            case R.id.hobbieflip14:
                setContentView(R.layout.hobbies14);
                break;
            case R.id.hobbiesNext14:
            case R.id.hobbieNext14:
            case R.id.hobbiesflip15:
                setContentView(R.layout.hobbie15);
                break;
            case R.id.hobbieflip15:
                setContentView(R.layout.hobbies15);
                break;
            case R.id.hobbiesNext15:
            case R.id.hobbieNext15:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml9:
            case R.id.hobbiesflip16:
                setContentView(R.layout.hobbie16);
                break;
            case R.id.hobbieflip16:
                setContentView(R.layout.hobbies16);
                break;
            case R.id.hobbieNext16:
            case R.id.hobbiesNext16:
            case R.id.hobbiesflip17:
                setContentView(R.layout.hobbie17);
                break;
            case R.id.hobbieflip17:
                setContentView(R.layout.hobbies17);
                break;
            case R.id.hobbiesNext17:
            case R.id.hobbieNext17:
            case R.id.hobbiesflip18:
                setContentView(R.layout.hobbie18);
                break;
            case R.id.hobbieflip18:
                setContentView(R.layout.hobbies18);
                break;
            case R.id.hobbieNext18:
            case R.id.hobbiesNext18:
            case R.id.hobbiesflip19:
                setContentView(R.layout.hobbie19);
                break;
            case R.id.hobbieflip19:
                setContentView(R.layout.hobbies19);
                break;
            case R.id.hobbiesNext19:
            case R.id.hobbieNext19:
            case R.id.hobbiesflip20:
                setContentView(R.layout.hobbie20);
                break;
            case R.id.hobbieflip20:
                setContentView(R.layout.hobbies20);
                break;
            case R.id.hobbiesNext20:
            case R.id.hobbieNext20:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml10:
            case R.id.hobbiesflip21:
                setContentView(R.layout.hobbie21);
                break;
            case R.id.hobbieflip21:
                setContentView(R.layout.hobbies21);
                break;
            case R.id.hobbiesNext21:
            case R.id.hobbieNext21:
            case R.id.hobbiesflip22:
                setContentView(R.layout.hobbie22);
                break;
            case R.id.hobbieflip22:
                setContentView(R.layout.hobbies22);
                break;
            case R.id.hobbiesNext22:
            case R.id.hobbieNext22:
            case R.id.hobbiesflip23:
                setContentView(R.layout.hobbie23);
                break;
            case R.id.hobbieflip23:
                setContentView(R.layout.hobbies23);
                break;
            case R.id.hobbieNext23:
            case R.id.hobbiesNext23:
            case R.id.hobbiesflip24:
                setContentView(R.layout.hobbie24);
                break;
            case R.id.hobbieflip24:
                setContentView(R.layout.hobbies24);
                break;
            case R.id.hobbiesNext24:
            case R.id.hobbieNext24:
            case R.id.hobbiesflip25:
                setContentView(R.layout.hobbie25);
                break;
            case R.id.hobbieflip25:
                setContentView(R.layout.hobbies25);
                break;
            case R.id.hobbiesNext25:
            case R.id.hobbieNext25:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml11:
            case R.id.hobbiesflip26:
                setContentView(R.layout.hobbie26);
                break;
            case R.id.hobbieflip26:
                setContentView(R.layout.hobbies26);
                break;
            case R.id.hobbiesNext26:
            case R.id.hobbieNext26:
            case R.id.hobbiesflip27:
                setContentView(R.layout.hobbie27);
                break;
            case R.id.hobbieflip27:
                setContentView(R.layout.hobbies27);
                break;
            case R.id.hobbiesNext27:
            case R.id.hobbieNext27:
            case R.id.hobbiesflip28:
                setContentView(R.layout.hobbie28);
                break;
            case R.id.hobbieflip28:
                setContentView(R.layout.hobbies28);
                break;
            case R.id.hobbiesNext28:
            case R.id.hobbieNext28:
            case R.id.hobbiesflip29:
                setContentView(R.layout.hobbie29);
                break;
            case R.id.hobbieflip29:
                setContentView(R.layout.hobbies29);
                break;
            case R.id.hobbiesNext29:
            case R.id.hobbieNext29:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml12:
            case R.id.hobbiesflip30:
                setContentView(R.layout.hobbie30);
                break;
            case R.id.hobbieflip30:
                setContentView(R.layout.hobbies30);
                break;
            case R.id.hobbiesNext30:
            case R.id.hobbieNext30:
            case R.id.hobbiesflip31:
                setContentView(R.layout.hobbie31);
                break;
            case R.id.hobbieflip31:
                setContentView(R.layout.hobbies31);
                break;
            case R.id.hobbiesNext31:
            case R.id.hobbieNext31:
            case R.id.hobbiesflip32:
                setContentView(R.layout.hobbie32);
                break;
            case R.id.hobbieflip32:
                setContentView(R.layout.hobbies32);
                break;
            case R.id.hobbiesNext32:
            case R.id.hobbieNext32:
            case R.id.hobbiesflip33:
                setContentView(R.layout.hobbie33);
                break;
            case R.id.hobbieflip33:
                setContentView(R.layout.hobbies33);
                break;
            case R.id.hobbiesNext33:
            case R.id.hobbieNext33:
            case R.id.hobbiesflip34:
                setContentView(R.layout.hobbie34);
                break;
            case R.id.hobbieflip34:
                setContentView(R.layout.hobbies34);
                break;
            case R.id.hobbiesNext34:
            case R.id.hobbieNext34:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml13:
            case R.id.asflip:
                setContentView(R.layout.animal);
                break;
            case R.id.flip:
                setContentView(R.layout.animals);
                break;
            case R.id.asNext:
            case R.id.Next:
            case R.id.asflip2:
                setContentView(R.layout.animal2);
                break;
            case R.id.flip2:
                setContentView(R.layout.animals2);
                break;
            case R.id.asNext2:
            case R.id.Next2:
            case R.id.asflip3:
                setContentView(R.layout.animal3);
                break;
            case R.id.flip3:
                setContentView(R.layout.animals3);
                break;
            case R.id.Next3:
            case R.id.asNext3:
            case R.id.asflip4:
                setContentView(R.layout.animal4);
                break;
            case R.id.flip4:
                setContentView(R.layout.animals4);
                break;
            case R.id.asNext4:
            case R.id.Next4:
            case R.id.asflip5:
                setContentView(R.layout.animal5);
                break;
            case R.id.flip5:
                setContentView(R.layout.animals5);
                break;
            case R.id.asNext5:
            case R.id.Next5:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml14:
            case R.id.asflip6:
                setContentView(R.layout.animal6);
                break;
            case R.id.flip6:
                setContentView(R.layout.animals6);
                break;
            case R.id.asNext6:
            case R.id.Next6:
            case R.id.asflip7:
                setContentView(R.layout.animal7);
                break;
            case R.id.flip7:
                setContentView(R.layout.animals7);
                break;
            case R.id.asNext7:
            case R.id.Next7:
            case R.id.asflip8:
                setContentView(R.layout.animal8);
                break;
            case R.id.flip8:
                setContentView(R.layout.animals8);
                break;
            case R.id.Next8:
            case R.id.asNext8:
            case R.id.asflip9:
                setContentView(R.layout.animal9);
                break;
            case R.id.flip9:
                setContentView(R.layout.animals9);
                break;
            case R.id.asNext9:
            case R.id.Next9:
            case R.id.asflip10:
                setContentView(R.layout.animal10);
                break;
            case R.id.flip10:
                setContentView(R.layout.animals10);
                break;
            case R.id.Next10:
            case R.id.asNext10:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml15:
            case R.id.asflip11:
                setContentView(R.layout.animal11);
                break;
            case R.id.flip11:
                setContentView(R.layout.animals11);
                break;
            case R.id.Next11:
            case R.id.asNext11:
            case R.id.asflip12:
                setContentView(R.layout.animal12);
                break;
            case R.id.flip12:
                setContentView(R.layout.animals12);
                break;
            case R.id.Next12:
            case R.id.asNext12:
            case R.id.asflip13:
                setContentView(R.layout.animal13);
                break;
            case R.id.flip13:
                setContentView(R.layout.animals13);
                break;
            case R.id.Next13:
            case R.id.asNext13:
            case R.id.asflip14:
                setContentView(R.layout.animal14);
                break;
            case R.id.flip14:
                setContentView(R.layout.animals14);
                break;
            case R.id.Next14:
            case R.id.asNext14:
            case R.id.asflip15:
                setContentView(R.layout.animal15);
                break;
            case R.id.flip15:
                setContentView(R.layout.animals15);
                break;
            case R.id.Next15:
            case R.id.asNext15:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml16:
            case R.id.asflip16:
                setContentView(R.layout.animal16);
                break;
            case R.id.flip16:
                setContentView(R.layout.animals16);
                break;
            case R.id.asNext16:
            case R.id.Next16:
            case R.id.asflip17:
                setContentView(R.layout.animal17);
                break;
            case R.id.flip17:
                setContentView(R.layout.animals17);
                break;
            case R.id.Next17:
            case R.id.asNext17:
            case R.id.asflip18:
                setContentView(R.layout.animal18);
                break;
            case R.id.flip18:
                setContentView(R.layout.animals18);
                break;
            case R.id.asNext18:
            case R.id.Next18:
            case R.id.asflip19:
                setContentView(R.layout.animal19);
                break;
            case R.id.flip19:
                setContentView(R.layout.animals19);
                break;
            case R.id.asNext19:
            case R.id.Next19:
            case R.id.asflip20:
                setContentView(R.layout.animal20);
                break;
            case R.id.flip20:
                setContentView(R.layout.animals20);
                break;
            case R.id.asNext20:
            case R.id.Next20:
                setContentView(R.layout.medium_levels);
                break;
            case R.id.ml17:
            case R.id.asflip21:
                setContentView(R.layout.animal21);
                break;
            case R.id.flip21:
                setContentView(R.layout.animals21);
                break;
            case R.id.asNext21:
            case R.id.Next21:
            case R.id.asflip22:
                setContentView(R.layout.animal22);
                break;
            case R.id.flip22:
                setContentView(R.layout.animals22);
                break;
            case R.id.asNext22:
            case R.id.Next22:
            case R.id.asflip23:
                setContentView(R.layout.animal23);
                break;
            case R.id.flip23:
                setContentView(R.layout.animals23);
                break;
            case R.id.asNext23:
            case R.id.Next23:
                setContentView(R.layout.hard);
                break;
            case R.id.hl1:
            case R.id.familyflip:
                setContentView(R.layout.families);
                break;
            case R.id.familiesflip:
                setContentView(R.layout.family);
                break;
            case R.id.familiesNext:
            case R.id.familyNext:
            case R.id.familyflip2:
                setContentView(R.layout.families2);
                break;
            case R.id.familiesflip2:
                setContentView(R.layout.family2);
                break;
            case R.id.familiesNext2:
            case R.id.familyNext2:
            case R.id.familyflip3:
                setContentView(R.layout.families3);
                break;
            case R.id.familiesflip3:
                setContentView(R.layout.family3);
                break;
            case R.id.familiesNext3:
            case R.id.familyNext3:
            case R.id.familyflip4:
                setContentView(R.layout.families4);
                break;
            case R.id.familiesflip4:
                setContentView(R.layout.family4);
                break;
            case R.id.familiesNext4:
            case R.id.familyNext4:
            case R.id.familyflip5:
                setContentView(R.layout.families5);
                break;
            case R.id.familiesflip5:
                setContentView(R.layout.family5);
                break;
            case R.id.familiesNext5:
            case R.id.familyNext5:
            case R.id.familyflip6:
                setContentView(R.layout.families6);
                break;
            case R.id.familiesflip6:
                setContentView(R.layout.family6);
                break;
            case R.id.familiesNext6:
            case R.id.familyNext6:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl2:
            case R.id.familyflip7:
                setContentView(R.layout.families7);
                break;
            case R.id.familiesflip7:
                setContentView(R.layout.family7);
                break;
            case R.id.familiesNext7:
            case R.id.familyNext7:
            case R.id.familyflip8:
                setContentView(R.layout.families8);
                break;
            case R.id.familiesflip8:
                setContentView(R.layout.family8);
                break;
            case R.id.familiesNext8:
            case R.id.familyNext8:
            case R.id.familyflip9:
                setContentView(R.layout.families9);
                break;
            case R.id.familiesflip9:
                setContentView(R.layout.family9);
                break;
            case R.id.familiesNext9:
            case R.id.familyNext9:
            case R.id.familyflip10:
                setContentView(R.layout.families10);
                break;
            case R.id.familiesflip10:
                setContentView(R.layout.family10);
                break;
            case R.id.familiesNext10:
            case R.id.familyNext10:
            case R.id.familyflip11:
                setContentView(R.layout.families11);
                break;
            case R.id.familiesflip11:
                setContentView(R.layout.family11);
                break;
            case R.id.familiesNext11:
            case R.id.familyNext11:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl3:
            case R.id.familyflip12:
                setContentView(R.layout.families12);
                break;
            case R.id.familiesflip12:
                setContentView(R.layout.family12);
                break;
            case R.id.familiesNext12:
            case R.id.familyNext12:
            case R.id.familyflip13:
                setContentView(R.layout.families13);
                break;
            case R.id.familiesflip13:
                setContentView(R.layout.family13);
                break;
            case R.id.familiesNext13:
            case R.id.familyNext13:
            case R.id.familyflip14:
                setContentView(R.layout.families14);
                break;
            case R.id.familiesflip14:
                setContentView(R.layout.family14);
                break;
            case R.id.familiesNext14:
            case R.id.familyNext14:
            case R.id.familyflip15:
                setContentView(R.layout.families15);
                break;
            case R.id.familiesflip15:
                setContentView(R.layout.family15);
                break;
            case R.id.familiesNext15:
            case R.id.familyNext15:
            case R.id.familyflip16:
                setContentView(R.layout.families16);
                break;
            case R.id.familiesflip16:
                setContentView(R.layout.family16);
                break;
            case R.id.familiesNext16:
            case R.id.familyNext16:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl4:
            case R.id.familyflip17:
                setContentView(R.layout.families17);
                break;
            case R.id.familiesflip17:
                setContentView(R.layout.family17);
                break;
            case R.id.familiesNext17:
            case R.id.familyNext17:
            case R.id.familyflip18:
                setContentView(R.layout.families18);
                break;
            case R.id.familiesflip18:
                setContentView(R.layout.family18);
                break;
            case R.id.familiesNext18:
            case R.id.familyNext18:
            case R.id.familyflip19:
                setContentView(R.layout.families19);
                break;
            case R.id.familiesflip19:
                setContentView(R.layout.family19);
                break;
            case R.id.familyNext19:
            case R.id.familiesNext19:
            case R.id.familyflip20:
                setContentView(R.layout.families20);
                break;
            case R.id.familiesflip20:
                setContentView(R.layout.family20);
                break;
            case R.id.familyNext20:
            case R.id.familiesNext20:
            case R.id.familyflip21:
                setContentView(R.layout.families21);
                break;
            case R.id.familiesflip21:
                setContentView(R.layout.family21);
                break;
            case R.id.familiesNext21:
            case R.id.familyNext21:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl5:
            case R.id.familyflip22:
                setContentView(R.layout.families22);
                break;
            case R.id.familiesflip22:
                setContentView(R.layout.family22);
                break;
            case R.id.familiesNext22:
            case R.id.familyNext22:
            case R.id.familyflip23:
                setContentView(R.layout.families23);
                break;
            case R.id.familiesflip23:
                setContentView(R.layout.family23);
                break;
            case R.id.familiesNext23:
            case R.id.familyNext23:
            case R.id.familyflip24:
                setContentView(R.layout.families24);
                break;
            case R.id.familiesflip24:
                setContentView(R.layout.family24);
                break;
            case R.id.familiesNext24:
            case R.id.familyNext24:
            case R.id.familyflip25:
                setContentView(R.layout.families25);
                break;
            case R.id.familiesflip25:
                setContentView(R.layout.family25);
                break;
            case R.id.familiesNext25:
            case R.id.familyNext25:
            case R.id.familyflip26:
                setContentView(R.layout.families26);
                break;
            case R.id.familiesflip26:
                setContentView(R.layout.family26);
                break;
            case R.id.familiesNext26:
            case R.id.familyNext26:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl6:
            case R.id.familyflip27:
                setContentView(R.layout.families27);
                break;
            case R.id.familiesflip27:
                setContentView(R.layout.family27);
                break;
            case R.id.familiesNext27:
            case R.id.familyNext27:
            case R.id.familyflip28:
                setContentView(R.layout.families28);
                break;
            case R.id.familiesflip28:
                setContentView(R.layout.family28);
                break;
            case R.id.familiesNext28:
            case R.id.familyNext28:
            case R.id.familyflip29:
                setContentView(R.layout.families29);
                break;
            case R.id.familiesflip29:
                setContentView(R.layout.family29);
                break;
            case R.id.familiesNext29:
            case R.id.familyNext29:
            case R.id.familyflip30:
                setContentView(R.layout.families30);
                break;
            case R.id.familiesflip30:
                setContentView(R.layout.family30);
                break;
            case R.id.familiesNext30:
            case R.id.familyNext30:
            case R.id.familyflip31:
                setContentView(R.layout.families31);
                break;
            case R.id.familiesflip31:
                setContentView(R.layout.family31);
                break;
            case R.id.familiesNext31:
            case R.id.familyNext31:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl7:
            case R.id.familyflip32:
                setContentView(R.layout.families32);
                break;
            case R.id.familiesflip32:
                setContentView(R.layout.family32);
                break;
            case R.id.familiesNext32:
            case R.id.familyNext32:
            case R.id.familyflip33:
                setContentView(R.layout.families33);
                break;
            case R.id.familiesflip33:
                setContentView(R.layout.family33);
                break;
            case R.id.familiesNext33:
            case R.id.familyNext33:
            case R.id.familyflip34:
                setContentView(R.layout.families34);
                break;
            case R.id.familiesflip34:
                setContentView(R.layout.family34);
                break;
            case R.id.familiesNext34:
            case R.id.familyNext34:
            case R.id.familyflip35:
                setContentView(R.layout.families35);
                break;
            case R.id.familiesflip35:
                setContentView(R.layout.family35);
                break;
            case R.id.familiesNext35:
            case R.id.familyNext35:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl8:
            case R.id.familyflip36:
                setContentView(R.layout.families36);
                break;
            case R.id.familiesflip36:
                setContentView(R.layout.family36);
                break;
            case R.id.familiesNext36:
            case R.id.familyNext36:
            case R.id.familyflip37:
                setContentView(R.layout.families37);
                break;
            case R.id.familiesflip37:
                setContentView(R.layout.family37);
                break;
            case R.id.familiesNext37:
            case R.id.familyNext37:
            case R.id.familyflip38:
                setContentView(R.layout.families38);
                break;
            case R.id.familiesflip38:
                setContentView(R.layout.family38);
                break;
            case R.id.familiesNext38:
            case R.id.familyNext38:
            case R.id.familyflip39:
                setContentView(R.layout.families39);
                break;
            case R.id.familiesflip39:
                setContentView(R.layout.family39);
                break;
            case R.id.familiesNext39:
            case R.id.familyNext39:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl9:
            case R.id.familyflip40:
                setContentView(R.layout.families40);
                break;
            case R.id.familiesflip40:
                setContentView(R.layout.family40);
                break;
            case R.id.familiesNext40:
            case R.id.familyNext40:
            case R.id.familyflip41:
                setContentView(R.layout.families41);
                break;
            case R.id.familiesflip41:
                setContentView(R.layout.family41);
                break;
            case R.id.familiesNext41:
            case R.id.familyNext41:
            case R.id.familyflip42:
                setContentView(R.layout.families42);
                break;
            case R.id.familiesflip42:
                setContentView(R.layout.family42);
                break;
            case R.id.familiesNext42:
            case R.id.familyNext42:
            case R.id.familyflip43:
                setContentView(R.layout.families43);
                break;
            case R.id.familiesflip43:
                setContentView(R.layout.family43);
                break;
            case R.id.familiesNext43:
            case R.id.familyNext43:
            case R.id.familyflip44:
                setContentView(R.layout.families44);
                break;
            case R.id.familiesflip44:
                setContentView(R.layout.family44);
                break;
            case R.id.familiesNext44:
            case R.id.familyNext44:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl10:
            case R.id.schoolsflip:
                setContentView(R.layout.school);
                break;
            case R.id.schoolflip:
                setContentView(R.layout.schools);
                break;
            case R.id.schoolsNext:
            case R.id.schoolNext:
            case R.id.schoolsflip2:
                setContentView(R.layout.school2);
                break;
            case R.id.schoolflip2:
                setContentView(R.layout.schools2);
                break;
            case R.id.schoolsNext2:
            case R.id.schoolNext2:
            case R.id.schoolsflip3:
                setContentView(R.layout.school3);
                break;
            case R.id.schoolflip3:
                setContentView(R.layout.schools3);
                break;
            case R.id.schoolsNext3:
            case R.id.schoolNext3:
            case R.id.schoolsflip4:
                setContentView(R.layout.school4);
                break;
            case R.id.schoolflip4:
                setContentView(R.layout.schools4);
                break;
            case R.id.schoolsNext4:
            case R.id.schoolNext4:
            case R.id.schoolsflip5:
                setContentView(R.layout.school5);
                break;
            case R.id.schoolflip5:
                setContentView(R.layout.schools5);
                break;
            case R.id.schoolsNext5:
            case R.id.schoolNext5:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl11:
            case R.id.schoolsflip6:
                setContentView(R.layout.school6);
                break;
            case R.id.schoolflip6:
                setContentView(R.layout.schools6);
                break;
            case R.id.schoolNext6:
            case R.id.schoolsNext6:
            case R.id.schoolsflip7:
                setContentView(R.layout.school7);
                break;
            case R.id.schoolflip7:
                setContentView(R.layout.schools7);
            case R.id.schoolsNext7:
            case R.id.schoolNext7:
            case R.id.schoolsflip8:
                setContentView(R.layout.school8);
                break;
            case R.id.schoolflip8:
                setContentView(R.layout.schools8);
                break;
            case R.id.schoolsNext8:
            case R.id.schoolNext8:
            case R.id.schoolsflip9:
                setContentView(R.layout.school9);
                break;
            case R.id.schoolflip9:
                setContentView(R.layout.schools9);
                break;
            case R.id.schoolsNext9:
            case R.id.schoolNext9:
            case R.id.schoolsflip10:
                setContentView(R.layout.school10);
                break;
            case R.id.schoolflip10:
                setContentView(R.layout.schools10);
                break;
            case R.id.schoolsNext10:
            case R.id.schoolNext10:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl12:
            case R.id.schoolsflip11:
                setContentView(R.layout.school11);
                break;
            case R.id.schoolflip11:
                setContentView(R.layout.schools11);
                break;
            case R.id.schoolsNext11:
            case R.id.schoolNext11:
            case R.id.schoolsflip12:
                setContentView(R.layout.school12);
                break;
            case R.id.schoolflip12:
                setContentView(R.layout.schools12);
                break;
            case R.id.schoolNext12:
            case R.id.schoolsNext12:
            case R.id.schoolsflip13:
                setContentView(R.layout.school13);
                break;
            case R.id.schoolflip13:
                setContentView(R.layout.schools13);
                break;
            case R.id.schoolsNext13:
            case R.id.schoolNext13:
            case R.id.schoolsflip14:
                setContentView(R.layout.school14);
                break;
            case R.id.schoolflip14:
                setContentView(R.layout.schools14);
                break;
            case R.id.schoolsNext14:
            case R.id.schoolNext14:
            case R.id.schoolsflip15:
                setContentView(R.layout.school15);
                break;
            case R.id.schoolflip15:
                setContentView(R.layout.schools15);
                break;
            case R.id.schoolsNext15:
            case R.id.schoolNext15:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl13:
            case R.id.schoolsflip16:
                setContentView(R.layout.school16);
                break;
            case R.id.schoolflip16:
                setContentView(R.layout.schools16);
                break;
            case R.id.schoolsNext16:
            case R.id.schoolNext16:
            case R.id.schoolsflip17:
                setContentView(R.layout.school17);
                break;
            case R.id.schoolflip17:
                setContentView(R.layout.schools17);
                break;
            case R.id.schoolsNext17:
            case R.id.schoolNext17:
            case R.id.schoolsflip18:
                setContentView(R.layout.school18);
                break;
            case R.id.schoolflip18:
                setContentView(R.layout.schools18);
                break;
            case R.id.schoolsNext18:
            case R.id.schoolNext18:
            case R.id.schoolsflip19:
                setContentView(R.layout.school19);
                break;
            case R.id.schoolflip19:
                setContentView(R.layout.schools19);
                break;
            case R.id.schoolNext19:
            case R.id.schoolsNext19:
            case R.id.schoolsflip20:
                setContentView(R.layout.school20);
                break;
            case R.id.schoolflip20:
                setContentView(R.layout.schools20);
                break;
            case R.id.schoolNext20:
            case R.id.schoolsNext20:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl14:
            case R.id.schoolsflip21:
                setContentView(R.layout.school21);
                break;
            case R.id.schoolflip21:
                setContentView(R.layout.schools21);
                break;
            case R.id.schoolsNext21:
            case R.id.schoolNext21:
            case R.id.schoolsflip22:
                setContentView(R.layout.school22);
                break;
            case R.id.schoolflip22:
                setContentView(R.layout.schools22);
                break;
            case R.id.schoolsNext22:
            case R.id.schoolNext22:
            case R.id.schoolsflip23:
                setContentView(R.layout.school23);
                break;
            case R.id.schoolflip23:
                setContentView(R.layout.schools23);
                break;
            case R.id.schoolsNext23:
            case R.id.schoolNext23:
            case R.id.schoolsflip24:
                setContentView(R.layout.school24);
                break;
            case R.id.schoolflip24:
                setContentView(R.layout.schools24);
                break;
            case R.id.schoolsNext24:
            case R.id.schoolNext24:
            case R.id.schoolsflip25:
                setContentView(R.layout.school25);
                break;
            case R.id.schoolflip25:
                setContentView(R.layout.schools25);
                break;
            case R.id.schoolsNext25:
            case R.id.schoolNext25:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl15:
            case R.id.schoolsflip26:
                setContentView(R.layout.school26);
                break;
            case R.id.schoolflip26:
                setContentView(R.layout.schools26);
                break;
            case R.id.schoolsNext26:
            case R.id.schoolNext26:
            case R.id.schoolsflip27:
                setContentView(R.layout.school27);
                break;
            case R.id.schoolflip27:
                setContentView(R.layout.schools27);
                break;
            case R.id.schoolsNext27:
            case R.id.schoolNext27:
            case R.id.schoolsflip28:
                setContentView(R.layout.school28);
                break;
            case R.id.schoolflip28:
                setContentView(R.layout.schools28);
                break;
            case R.id.schoolsNext28:
            case R.id.schoolNext28:
                setContentView(R.layout.hard_levels);
                break;
            case R.id.hl16:
            case R.id.schoolsflip29:
                setContentView(R.layout.school29);
                break;
            case R.id.schoolflip29:
                setContentView(R.layout.schools29);
                break;
            case R.id.schoolsNext29:
            case R.id.schoolNext29:
            case R.id.schoolsflip30:
                setContentView(R.layout.school30);
                break;
            case R.id.schoolflip30:
                setContentView(R.layout.schools30);
                break;
            case R.id.schoolsNext30:
            case R.id.schoolNext30:
            case R.id.schoolsflip31:
                setContentView(R.layout.school31);
                break;
            case R.id.schoolflip31:
                setContentView(R.layout.schools31);
                break;
            case R.id.schoolsNext31:
            case R.id.schoolNext31:
            case R.id.schoolsflip32:
                setContentView(R.layout.school32);
                break;
            case R.id.schoolflip32:
                setContentView(R.layout.schools32);
                break;
            case R.id.schoolsNext32:
            case R.id.schoolNext32:
                setContentView(R.layout.hard);
                break;
        }
    }
    public void play(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.pink);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();
    }
}