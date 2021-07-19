package com.example.langify1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private MediaPlayer mediaPlayer;

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
                //when the button with the id of purpleNext2 is pushed
            case R.id.purpleNext2:
                //when the button with the id of numbereNext5 is pushed
            case R.id.numbereNext5:
                //when the button with the id of numbersNext5 is pushed
            case R.id.numbersNext5:
                //when the button with the id of numbersNext11 is pushed
            case R.id.numbersNext11:
                //when the button with the id of numbereNext11 is pushed
            case R.id.numbereNext11:
                //when the button with the id of numbereNext16 is pushed
            case R.id.numbereNext16:
                //when the button with the id of numbersNext16 is pushed
            case R.id.numbersNext16:
                //when the button with the id of numbersNext21 is pushed
            case R.id.numbersNext21:
                //when the button with the id of numbereNext21 is pushed
            case R.id.numbereNext21:
                //when the button with the id of weeksNext7 is pushed
            case R.id.weeksNext7:
                //when the button with the id of weekNext7 is pushed
            case R.id.weekNext7:
                //when the button with the id of monthsNext6 is pushed
            case R.id.monthsNext6:
                //when the button with the id of monthNext6 is pushed
            case R.id.monthNext6:
                //it displays the easy levels page
                setContentView(R.layout.easy_levels);
                break;
            //when the button with the id of medium is pushed
            case R.id.medium:
                //when the button with the id of eln is pushed
            case R.id.eln:
                //it displays the medium levels
                setContentView(R.layout.medium_levels);
                break;
            //when the button with the id of mln is pushed
            case R.id.mln:
                //when the button with the id of hards is pushed
            case R.id.hards:
                //it displays the hard levels
                setContentView(R.layout.hard_levels);
                break;
            //when the button with the id of el1 is pushed
            case R.id.el1:
                //when the button with the id of pinkflip2 is pushed
            case R.id.pinkflip2:
                //it displays the pink.xml (the english version of the pink word)
                setContentView(R.layout.pink);
                break;
            //when the button with the id of pinkflip is pushed
            case R.id.pinkflip:
                //it displays the pink2.xml (the spanish version of the word pink)
                setContentView(R.layout.pink2);
                break;
            //when the button with the id of pinkNext is pushed
            case R.id.pinkNext:
                //when the button with the id of pinkNext2 is pushed
            case R.id.pinkNext2:
                //when the button with the id of redflip2 is pushed
            case R.id.redflip2:
                //it displays the english version of the word red (red.xml)
                setContentView(R.layout.red);
                break;
            //when the button with the id of redflip is pushed
            case R.id.redflip:
                //it displays the spanish version of word red
                setContentView(R.layout.red2);
                break;
            //when the button with the id of redNext is pushed
            case R.id.redNext:
                //when the button with the id of redNext2 is pushed
            case R.id.redNext2:
                //when the button with the id of blueflip2 is pushed
            case R.id.blueflip2:
                //it displays the word blue
                setContentView(R.layout.blue);
                break;
            //when the button with the id of blueflip is pushed
            case R.id.blueflip:
                //it displays the spanish version of the word blue
                setContentView(R.layout.blue2);
                break;
            //when the button with the id of blueNext is pushed
            case R.id.blueNext:
                //when the button with the id of blueNext is pushed
            case R.id.blueNext2:
                //when the button with the id of greenflip2 is pushed
            case R.id.greenflip2:
                //it displays the word green
                setContentView(R.layout.green);
                break;
            //when the button with the id of greenflip is pushed
            case R.id.greenflip:
                //it displays the spanish version of the word green
                setContentView(R.layout.green2);
                break;
            //when the button with the id of greenNext is pushed
            case R.id.greenNext:
                //when the button with the id of greenNext2 is pushed
            case R.id.greenNext2:
                //when the button with the id of brownflip2 is pushed
            case R.id.brownflip2:
                //it displays the word brown
                setContentView(R.layout.brown);
                break;
            //when the button with the id of brownflip is pushed
            case R.id.brownflip:
                //it displays the spanish version of the word brown
                setContentView(R.layout.brown2);
                break;
            //when the button with the id of el2 (level 2 in the easy level) is pushed
            case R.id.el2:
                //when the button with the id of whiteflip2 is pushed
            case R.id.whiteflip2:
                //it displays the word white
                setContentView(R.layout.white);
                break;
            //when the button with the id of whiteflip is pushed
            case R.id.whiteflip:
                //it displays the spanish version of the word white
                setContentView(R.layout.white2);
                break;
            //when the button with the id of whiteNext is pushed
            case R.id.whiteNext:
                //when the button with the id of whiteNext2 is pushed
            case R.id.whiteNext2:
                //when the button with the id of blackfli[2 is pushed
            case R.id.blackflip2:
                //it displays the word black
                setContentView(R.layout.black);
                break;
            //when the button with the id of blackflip is pushed
            case R.id.blackflip:
                //it displays the spanish version of the word black
                setContentView(R.layout.black2);
                break;
            //when the button with the id of blackNext is pushed
            case R.id.blackNext:
                //when the button with the id of blackNext2 is pushed
            case R.id.blackNext2:
                //when the button with the id of greyflip2 is pushed
            case R.id.greyflip2:
                //it displays the word grey
                setContentView(R.layout.grey);
                break;
            //when the button with the id of greyflip is pushed
            case R.id.greyflip:
                //it displays the spanish version of the word grey
                setContentView(R.layout.grey2);
                break;
            //when the button with the id of greyNext is pushed
            case R.id.greyNext:
                //when the button with the id of greyNext2 is pushed
            case R.id.greyNext2:
                //when the button with the id of orangeflip2 is pushed
            case R.id.orangeflip2:
                //it displays the word orange
                setContentView(R.layout.orange);
                break;
            //when the button with the id of orangeflip is pushed
            case R.id.orangeflip:
                //it displays the spanish version of the word orange
                setContentView(R.layout.orange2);
                break;
            //when the button with the id of orangeNext is pushed
            case R.id.orangeNext:
                //when the button with the id of orangeNext is pushed
            case R.id.orangeNext2:
                //when the button with the id of yellowflip2 is pushed
            case R.id.yellowflip2:
                //it displays the word yellow
                setContentView(R.layout.yellow);
                break;
            //when the button with the id of yellowflip is pushed
            case R.id.yellowflip:
                //it displays the spanish version of the word yellow
                setContentView(R.layout.yellow2);
                break;
            //when the button with the id of yellowNext is pushed
            case R.id.yellowNext:
                //when the button with the id of yellowNext2 is pushed
            case R.id.yellowNext2:
                //when the button with the id of purpleflip2 is pushed
            case R.id.purpleflip2:
                //it displays the word purple
                setContentView(R.layout.purple);
                break;
            //when the button with the id of purpleflip is pushed
            case R.id.purpleflip:
                //it displays the spanish version of the word purple
                setContentView(R.layout.purple2);
                break;
            //when the button with the id of el3 (level 3 in the easy difficulty) is pushed
            case R.id.el3:
                //when the button with the id of numbersflip is pushed
            case R.id.numbersflip:
                //it displays the word zero
                setContentView(R.layout.numbere);
                break;
            //when the button with the id of numbereflip is pushed
            case R.id.numbereflip:
                //it displays the spanish version of the word zero
                setContentView(R.layout.numbers);
                break;
            //when the button with the id of numbersNext is pushed
            case R.id.numbersNext:
                //when the button with the id of numbereNext is pushed
            case R.id.numbereNext:
                //when the button with the id of numbersflip2 is pushed
            case R.id.numbersflip2:
                //it displays the word one
                setContentView(R.layout.numbere2);
                break;
            //when the button with the id of numbereflip2 is pushed
            case R.id.numbereflip2:
                //it displays the spanish version of the word one
                setContentView(R.layout.numbers2);
                break;
            //when the button with the id of numbereNext2 is pushed
            case R.id.numbereNext2:
                //when the button with the id of numbersNext2 is pushed
            case R.id.numbersNext2:
                //when the button with the id of numbersflip3 is pushed
            case R.id.numbersflip3:
                //it displays the word two
                setContentView(R.layout.numbere3);
                break;
            //when the button with the id of numbereflip3 is pushed
            case R.id.numbereflip3:
                //it displays the spanish version of the word two
                setContentView(R.layout.numbers3);
                break;
            //when the button with the id of numbersNext3 is pushed
            case R.id.numbersNext3:
                //when the button with the id of numbereNext3 is pushed
            case R.id.numbereNext3:
                //when the button with the id of numbersflip4 is pushed
            case R.id.numbersflip4:
                //it displays the word three
                setContentView(R.layout.numbere4);
                break;
            //when the button with the id of numbereflip4 is pushed
            case R.id.numbereflip4:
                //it displays the spanish version of the word three
                setContentView(R.layout.numbers4);
                break;
            //when the button with the id of numbereNext4 is pushed
            case R.id.numbereNext4:
                //when the button with the id of numbersNext4 is pushed
            case R.id.numbersNext4:
                //when the button with the id of numbersflip5 is pushed
            case R.id.numbersflip5:
                //it displays the word four
                setContentView(R.layout.numbere5);
                break;
            //when the button with the id of numbereflip5 is pushed
            case R.id.numbereflip5:
                //it displays the spanish version of the word four
                setContentView(R.layout.numbers5);
                break;
            //when the button with the id of el4 (level 4 in the easy difficulty) is pushed
            case R.id.el4:
                //when the button with the id of numbersflip6 is pushed
            case R.id.numbersflip6:
                //it displays the word five
                setContentView(R.layout.numbere6);
                break;
            //when the button with the id of numbereflip6 is pushed
            case R.id.numbereflip6:
                //it displays the spanish version of the word five
                setContentView(R.layout.numbers6);
                break;
            //when the button with the id of numbereNext6 is pushed
            case R.id.numbereNext6:
                //when the button with the id of numbersNext6 is pushed
            case R.id.numbersNext6:
                //when the button with the id of numbersflip7 is pushed
            case R.id.numbersflip7:
                //it displays the word six
                setContentView(R.layout.numbere7);
                break;
            //when the button with the id of numbereflip7 is pushed
            case R.id.numbereflip7:
                //it displays the spanish version of the word six
                setContentView(R.layout.numbers7);
                break;
            //when the button with the id of numbereNext7 is pushed
            case R.id.numbereNext7:
                //when the button with the id of numbersNext7 is pushed
            case R.id.numbersNext7:
                //when the button with the id of numbersflip8 is pushed
            case R.id.numbersflip8:
                //it displays the word seven
                setContentView(R.layout.numbere8);
                break;
            //when the button with the id of numbereflip8 is pushed
            case R.id.numbereflip8:
                //it displays the spanish version of the word seven
                setContentView(R.layout.numbers8);
                break;
            //when the button with the id of numbereNext8 is pushed
            case R.id.numbereNext8:
                //when the button with the id of numbersNext8 is pushed
            case R.id.numbersNext8:
                //when the button with the id of numbersflip9 is pushed
            case R.id.numbersflip9:
                //it displays the word eight
                setContentView(R.layout.numbere9);
                break;
            //when the button with the id of numbereflip9 is pushed
            case R.id.numbereflip9:
                //it displays the spanish version of the word eight
                setContentView(R.layout.numbers9);
                break;
            //when the button with the id of numbereNext9 is pushed
            case R.id.numbereNext9:
                //when the button with the id of numbersNext9 is pushed
            case R.id.numbersNext9:
                //when the button with the id of numbersflip10 is pushed
            case R.id.numbersflip10:
                //it displays the number nine
                setContentView(R.layout.numbere10);
                break;
            //when the button with the id of numbereflip10 is pushed
            case R.id.numbereflip10:
                //it displays the spanish version of the word nine
                setContentView(R.layout.numbers10);
                break;
            //when the button with the id of numbereNext10 is pushed
            case R.id.numbereNext10:
                //when the button with the id of numbersNext10 is pushed
            case R.id.numbersNext10:
                //when the button with the id of numbersflip11 is pushed
            case R.id.numbersflip11:
                //it displays the word ten
                setContentView(R.layout.numbere11);
                break;
            //when the button with the id of numbereflip11 is pushed
            case R.id.numbereflip11:
                //it displays the spanish version of the word ten
                setContentView(R.layout.numbers11);
                break;
            //when the button with the id of el5 (level 5 on easy difficulty) is pushed
            case R.id.el5:
                //when the button with the id of numbersflip12 is pushed
            case R.id.numbersflip12:
                //it displays the word eleven
                setContentView(R.layout.numbere12);
                break;
            //when the button with the id of numbereflip12 is pushed
            case R.id.numbereflip12:
                //it displays the spanish version of the word eleven
                setContentView(R.layout.numbers12);
                break;
            //when the button with the id of numbereNext12 is pushed
            case R.id.numbereNext12:
                //when the button with the id of numbersNext12 is pushed
            case R.id.numbersNext12:
                //when the button with the id of numbersflip13 is pushed
            case R.id.numbersflip13:
                //it displays the word twelve
                setContentView(R.layout.numbere13);
                break;
            //when the button with the id of numbereflip13 is pushed
            case R.id.numbereflip13:
                //it displays the spanish version of the twelve
                setContentView(R.layout.numbers13);
                break;
            //when the button with the id of numbereNext13 is pushed
            case R.id.numbereNext13:
                //when the button with the id of numbersNext13 is pushed
            case R.id.numbersNext13:
                //when the button with the id of numbersflip14 is pushed
            case R.id.numbersflip14:
                // it displays the word thirteen
                setContentView(R.layout.numbere14);
                break;
            //when the button with the id of numbereflip14 is pushed
            case R.id.numbereflip14:
                //it displays the spanish version of the word thirteen
                setContentView(R.layout.numbers14);
                break;
            //when the button with the id of numbersNext14 is pushed
            case R.id.numbersNext14:
                //when the button with the id of numbereNext14 is pushed
            case R.id.numbereNext14:
                //when the button with the id of numbersflip15 is pushed
            case R.id.numbersflip15:
                //it displays the word fourteen
                setContentView(R.layout.numbere15);
                break;
            //when the button with the id of numbereflip15 is pushed
            case R.id.numbereflip15:
                //it displays the spanish version of the word fourteen
                setContentView(R.layout.numbers15);
                break;//when the button with the id of numbersNext15 is pushed
            case R.id.numbersNext15:
                //when the button with the id of numbereNext15 is pushed
            case R.id.numbereNext15:
                //when the button with the id of numbersflip16 is pushed
            case R.id.numbersflip16:
                //it displays the word fifteen
                setContentView(R.layout.numbere16);
                break;
            //when the button with the id of numbereflip16 is pushed
            case R.id.numbereflip16:
                //it displays the spanish version of the word fifteen
                setContentView(R.layout.numbers16);
                break;
            //when the button with the id of el6 (level 6 on easy difficulty) is pushed
            case R.id.el6:
                //when the button with the id of numbersflip17 is pushed
            case R.id.numbersflip17:
                //it displays the word sixteen
                setContentView(R.layout.numbere17);
                break;
            //when the button with the id of numbereflip17 is pushed
            case R.id.numbereflip17:
                //it displays the spanish version of the word sixteen
                setContentView(R.layout.numbers17);
                break;
            //when the button with the id of numbersNext17 is pushed
            case R.id.numbersNext17:
                //when the button with the id of numbereNext17 is pushed
            case R.id.numbereNext17:
                //when the button with the id of numbersflip18 is pushed
            case R.id.numbersflip18:
                //it displays the word seventeen
                setContentView(R.layout.numbere18);
                break;
            //when the button with the id of numbereflip18 is pushed
            case R.id.numbereflip18:
                //it displays the spanish version of the word seventeen
                setContentView(R.layout.numbers18);
                break;
            //when the button with the id of numbersNext18 is pushed
            case R.id.numbersNext18:
                //when the button with the id of numbereNext18 is pushed
            case R.id.numbereNext18:
                //when the button with the id of numbersflip19 is pushed
            case R.id.numbersflip19:
                //it displays the word eighteen
                setContentView(R.layout.numbere19);
                break;
            //when the button with the id of numbereflip19 is pushed
            case R.id.numbereflip19:
                //it displays the spanish version of the word eighteen
                setContentView(R.layout.numbers19);
                break;
            //when the button with the id of numbersNext19 is pushed
            case R.id.numbersNext19:
                //when the button with the id of numbereNext19 is pushed
            case R.id.numbereNext19:
                //when the button with the id of numbersflip20 is pushed
            case R.id.numbersflip20:
                //it displays the word nineteen
                setContentView(R.layout.numbere20);
                break;
            //when the button with the id of numbereflip20 is pushed
            case R.id.numbereflip20:
                //it displays the spanish version of the word nineteen
                setContentView(R.layout.numbers20);
                break;
            //when the button with the id of numbereNext20 is pushed
            case R.id.numbereNext20:
                //when the button with the id of numbersNext20 is pushed
            case R.id.numbersNext20:
                //when the button with the id of numbersflip21 is pushed
            case R.id.numbersflip21:
                //it displays the word twenty
                setContentView(R.layout.numbere21);
                break;
            //when the button with the id of numbereflip21 is pushed
            case R.id.numbereflip21:
                //it displays the spanish version of the word twenty
                setContentView(R.layout.numbers21);
                break;
            //when the button with the id of el7 (level 7 on easy difficulty) is pushed
            case R.id.el7:
                //when the button with the id of weeksflip is pushed
            case R.id.weeksflip:
                //it displays the word monday
                setContentView(R.layout.week);
                break;
            //when the button with the id of weekflip is pushed
            case R.id.weekflip:
                //it displays the spanish version of the word monday
                setContentView(R.layout.weeks);
                break;
            //when the button with the id of weekNext is pushed
            case R.id.weekNext:
                //when the button with the id of weeksNext is pushed
            case R.id.weeksNext:
                //when the button with the id of weeksflip2 is pushed
            case R.id.weeksflip2:
                //it displays the word thuesday
                setContentView(R.layout.week2);
                break;
            //when the button with the id of weekflip2 is pushed
            case R.id.weekflip2:
                //it displays the spanish version of the word tuesday
                setContentView(R.layout.weeks2);
                break;
            //when the button with the id of weeksNext2 is pushed
            case R.id.weeksNext2:
                //when the button with the id of weekNext2 is pushed
            case R.id.weekNext2:
                //when the button with the id of weeksflip3 is pushed
            case R.id.weeksflip3:
                //it displays the word Wensday
                setContentView(R.layout.week3);
                break;
            //when the button with the id of weekflip3 is pushed
            case R.id.weekflip3:
                //it displays the spanish version of the word Wensday
                setContentView(R.layout.weeks3);
                break;
            //when the button with the id of weeksNext3 is pushed
            case R.id.weeksNext3:
                //when the button with the id of weekNext3 is pushed
            case R.id.weekNext3:
                //when the button with the id of weeksflip4 is pushed
            case R.id.weeksflip4:
                //it displays the word thursday
                setContentView(R.layout.week4);
                break;
            //when the button with the id of weekflip4 is pushed
            case R.id.weekflip4:
                //it displays the spanish version of the word thursday
                setContentView(R.layout.weeks4);
                break;
            //when the button with the id of weekNext4 is pushed
            case R.id.weekNext4:
                //when the button with the id of weeksNext4 is pushed
            case R.id.weeksNext4:
                //when the button with the id of weeksflip5 is pushed
            case R.id.weeksflip5:
                //it displays the word friday
                setContentView(R.layout.week5);
                break;
            //when the button with the id of weekflip5 is pushed
            case R.id.weekflip5:
                //it displays the spanish version of the word friday
                setContentView(R.layout.weeks5);
                break;
            //when the button with the id of weeksNext5 is pushed
            case R.id.weeksNext5:
                //when the button with the id of weekNext5 is pushed
            case R.id.weekNext5:
                //when the button with the id of weeksflip6 is pushed
            case R.id.weeksflip6:
                //it displays the word saturday
                setContentView(R.layout.week6);
                break;
            //when the button with the id of weekflip6 is pushed
            case R.id.weekflip6:
                //it displays the spanish verion of the word saturday
                setContentView(R.layout.weeks6);
                break;
            //when the button with the id of weeksNext6 is pushed
            case R.id.weeksNext6:
                //when the button with the id of weekNext6 is pushed
            case R.id.weekNext6:
                //when the button with the id of weeksflip7 is pushed
            case R.id.weeksflip7:
                //it displays the word sunday
                setContentView(R.layout.week7);
                break;
            //when the button with the id of weekflip7 is pushed
            case R.id.weekflip7:
                //it displays the spanish version of the sunday
                setContentView(R.layout.weeks7);
                break;
            //when the button with the id of el8(level 8 on the easy difficulty) is pushed
            case R.id.el8:
                //when the button with the id of monthsflip is pushed
            case R.id.monthsflip:
                //it displays the word January
                setContentView(R.layout.month);
                break;
            //when the button with the id of monthflip is pushed
            case R.id.monthflip:
                //it displays the spanish version of the word January
                setContentView(R.layout.months);
                break;
            //when the button with the id of monthNext is pushed
            case R.id.monthNext:
                //when the button with the id of monthsNext is pushed
            case R.id.monthsNext:
                //when the button with the id of monthsflip2 is pushed
            case R.id.monthsflip2:
                //it displays the word February
                setContentView(R.layout.month2);
                break;
            //when the button with the id of monthflip2 is pushed
            case R.id.monthflip2:
                //it displays the spanish version of the word February
                setContentView(R.layout.months2);
                break;
            //when the button with the id of monthsNext2 is pushed
            case R.id.monthsNext2:
                //when the button with the id of monthNext is pushed
            case R.id.monthNext2:
                //when the button with the id of monthsflip3 is pushed
            case R.id.monthsflip3:
                //it displays the word March
                setContentView(R.layout.month3);
                break;
            //when the button with the id of monthflip3 is pushed
            case R.id.monthflip3:
                //it displays the spanish version of the word March
                setContentView(R.layout.months3);
                break;
            //when the button with the id of monthsNext3 is pushed
            case R.id.monthsNext3:
                //when the button with the id of monthNext3 is pushed
            case R.id.monthNext3:
                //when the button with the id of monthsflip4 is pushed
            case R.id.monthsflip4:
                //it displays the word April
                setContentView(R.layout.month4);
                break;
            //when the button with the id of monthflip4 is pushed
            case R.id.monthflip4:
                //it displays the spanish version of the word April
                setContentView(R.layout.months4);
                break;
            //when the button with the id of monthsNext4 is pushed
            case R.id.monthsNext4:
                //when the button with the id of monthsNext4 is pushed
            case R.id.monthNext4:
                //when the button with the id of monthsflip5 is pushed
            case R.id.monthsflip5:
                //it displays the word may
                setContentView(R.layout.month5);
                break;
            //when the button with the id of monthflip5 is pushed
            case R.id.monthflip5:
                //it displays the spanish version of the word may
                setContentView(R.layout.months5);
                break;
            //when the button with the id of monthsNext5 is pushed
            case R.id.monthsNext5:
                //when the button with the id of monthNext5 is pushed
            case R.id.monthNext5:
                //when the button with the id of monthsflip6 is pushed
            case R.id.monthsflip6:
                //it displays the word June
                setContentView(R.layout.month6);
                break;
            //when the button with the id of monthflip6 is pushed
            case R.id.monthflip6:
                //it displays the spanish version of the word may
                setContentView(R.layout.months6);
                break;
            //when the button with the id of el9 (level 9 on difficulty easy) is pushed
            case R.id.el9:
                //when the button with the id of monthsflip7 is pushed
            case R.id.monthsflip7:
                //it displays the word July
                setContentView(R.layout.month7);
                break;
            //when the button with the id of monthflip7 is pushed
            case R.id.monthflip7:
                //it displays the spanish version of the word July
                setContentView(R.layout.months7);
                break;
            //when the button with the id of monthsNext7 is pushed
            case R.id.monthsNext7:
                //when the button with the id of monthNext7 is pushed
            case R.id.monthNext7:
                //when the button with the id of monthsflip8 is pushed
            case R.id.monthsflip8:
                //it displays the word August
                setContentView(R.layout.month8);
                break;
            //when the button with the id of monthflip8 is pushed
            case R.id.monthflip8:
                //it displays the spanish version of the word August
                setContentView(R.layout.months8);
                break;
            //when the button with the id of monthsNext8 is pushed
            case R.id.monthsNext8:
                //when the button with the id of monthNext8 is pushed
            case R.id.monthNext8:
                //when the button with the id of monthsflip9 is pushed
            case R.id.monthsflip9:
                //it displays the word September
                setContentView(R.layout.month9);
                break;
            //when the button with the id of monthflip9 is pushed
            case R.id.monthflip9:
                //it displays the spanish version of the word September
                setContentView(R.layout.months9);
                break;
            //when the button with the id of monthNext9 is pushed
            case R.id.monthNext9:
                //when the button with the id of monthNext9 is pushed
            case R.id.monthsNext9:
                //when the button with the id of monthsflip10 is pushed
            case R.id.monthsflip10:
                //it displays the word October
                setContentView(R.layout.month10);
                break;
            //when the button with the id of monthflip10 is pushed
            case R.id.monthflip10:
                //it displays the spanish version of the word October
                setContentView(R.layout.months10);
                break;
            //when the button with the id of monthNext10 is pushed
            case R.id.monthNext10:
                //when the button with the id of monthsNext10 is pushed
            case R.id.monthsNext10:
                //when the button with the id of monthsflip11 is pushed
            case R.id.monthsflip11:
                //it displays the word November
                setContentView(R.layout.month11);
                break;
            //when the button with the id of monthflip11 is pushed
            case R.id.monthflip11:
                //it displays the spanish version of the word November
                setContentView(R.layout.months11);
                break;
            //when the button with the id of monthNext11 is pushed
            case R.id.monthNext11:
                //when the button with the id of monthsNext11 is pushed
            case R.id.monthsNext11:
                //when the button with the id of monthsflip12 is pushed
            case R.id.monthsflip12:
                //it displays the word December
                setContentView(R.layout.month12);
                break;
            //when the button with the id of monthflip12 is pushed
            case R.id.monthflip12:
                //it displays the spanish version of the word december
                setContentView(R.layout.months12);
                break;
            //when the button with the id of monthsNext12 is pushed
            case R.id.monthsNext12:
                //when the button with the id of monthsNext12 is pushed
            case R.id.monthNext12:
                //it displays the easy_levels
                setContentView(R.layout.easy_levels);
                break;
            //when the button with the id of el10 is pushed
            case R.id.el10:
                //when the button with the id of greetingsflip is pushed
            case R.id.greetingsflip:
                //it displays the word Good Morning
                setContentView(R.layout.greeting);
                break;
            //when the button with the id of greetingflip is pushed
            case R.id.greetingflip:
                //it displays the spanish version of the word good morning
                setContentView(R.layout.greetings);
                break;
                //if the the button with the id of greetingNext gets pushed
            case R.id.greetingNext:
//if the the button with the id of greetingsNext gets pushed
            case R.id.greetingsNext:
//if the the button with the id of greetingsflip2 gets pushed
            case R.id.greetingsflip2:
//it displays the layout called greeting2
                setContentView(R.layout.greeting2);
                break;
//if the the button with the id of greetingflip2 gets pushed
            case R.id.greetingflip2:
//it displays the layout called greetings2
                setContentView(R.layout.greetings2);
                break;
//if the the button with the id of greetingNext2 gets pushed
            case R.id.greetingNext2:
//if the the button with the id of greetingsNext2 gets pushed
            case R.id.greetingsNext2:
//if the the button with the id of greetingsflip3 gets pushed
            case R.id.greetingsflip3:
//it displays the layout called greeting3
                setContentView(R.layout.greeting3);
                break;
//if the the button with the id of greetingsflip3 gets pushed
            case R.id.greetingflip3:
//it displays the layout called greetings3
                setContentView(R.layout.greetings3);
                break;
//if the the button with the id of greetingNext3 gets pushed
            case R.id.greetingNext3:
//if the the button with the id of greetingsNext3 gets pushed
            case R.id.greetingsNext3:
//if the the button with the id of greetingsflip4 gets pushed
            case R.id.greetingsflip4:
//it will display the layout called greeting4
                setContentView(R.layout.greeting4);
                break;
//if the the button with the id of greetingflip4 gets pushed
            case R.id.greetingflip4:
                //it will display the layout called greetings4
                setContentView(R.layout.greetings4);
                break;
//if the the button with the id of greetingsNext4 gets pushed
            case R.id.greetingsNext4:
//if the the button with the id of greetingsNext4 gets pushed
            case R.id.greetingNext4:
//if the the button with the id of greetingsflip5 gets pushed
            case R.id.greetingsflip5:
//it will display the layout called greeting5
                setContentView(R.layout.greeting5);
                break;
//if the the button with the id of greetingsflip3 gets pushed
            case R.id.greetingflip5:
//it will display the layout called greetings5
                setContentView(R.layout.greetings5);
                break;
//if the the button with the id of greetingNext5 gets pushed
            case R.id.greetingNext5:
//if the button with the id of greetingsNext5 gets pushed
            case R.id.greetingsNext5:
//if the button with the id of greetingsflip6 gets pushed
            case R.id.greetingsflip6:
//it will display the layout called greeting6
                setContentView(R.layout.greeting6);
                break;
//if the button with the id of greetingflip6 gets pushed
            case R.id.greetingflip6:
//it will display the layout called greetings6
                setContentView(R.layout.greetings6);
                break;
//if the button with the id of greetingNext6 gets pushed
            case R.id.greetingNext6:
//if the button with the id of greetingsNext6 gets pushed
            case R.id.greetingsNext6:
//if the button with the id of greetingsflip6 gets pushed
            case R.id.greetingsflip7:
//it will display the layout called greeting7
                setContentView(R.layout.greeting7);
                break;
//if the button with the id of greetingflip gets pushed
            case R.id.greetingflip7:
//it will display the layout called greetings7
                setContentView(R.layout.greetings7);
                break;
//if the button with the id of greetingNext7 gets pushed
            case R.id.greetingsNext7:
//if the button with the id greetingNext7 of gets pushed
            case R.id.greetingNext7:
//it will display the layout called easy_levels
                setContentView(R.layout.easy_levels);
                break;
//if the button with the id of el11 gets pushed
            case R.id.el11:
//if the button with the id of heflip2 gets pushed
            case R.id.heflip2:
//it will display the layout called he
                setContentView(R.layout.he);
                break;
//if the button with the id of heflip gets pushed
            case R.id.heflip:
//it will display the layout called he2
                setContentView(R.layout.he2);
                break;
//if the button with the id of heNextgets pushed
            case R.id.heNext:
//if the button with the id of heNext2 gets pushed
            case R.id.heNext2:
//if the button with the id of sheflip2 gets pushed
            case R.id.sheflip2:
//it will display the layout called she
                setContentView(R.layout.she);
                break;
//if the button with the id of sheflip gets pushed
            case R.id.sheflip:
//it will display the layout called she2
                setContentView(R.layout.she2);
                break;
//if the button with the id of gets sheNext pushed
            case R.id.sheNext:
//if the button with the id of gets sheNext2 pushed
            case R.id.sheNext2:
//if the button with the id of gets ifip2 pushed
            case R.id.iflip2:
//it will display the layout called i
                setContentView(R.layout.i);
                break;
//if the button with the id of iflp gets pushed
            case R.id.iflip:
//it will display the layout called i2
                setContentView(R.layout.i2);
                break;
//if the button with the id of iNext gets pushed
            case R.id.iNext:
//if the button with the id of iNext2 gets pushed
            case R.id.iNext2:
//if the button with the id of themflip2 gets pushed
            case R.id.themflip2:
//it will display the layout called them
                setContentView(R.layout.them);
                break;
//if the button with the id of themflip gets pushed
            case R.id.themflip:
//it will display the layout called them2
                setContentView(R.layout.them2);
                break;
               //if the button with the id of themNext gets pushed break;
            case R.id.themNext:
//if the button with the id of themNext2 gets pushed
            case R.id.themNext2:
//it will display the layout called easy_levels
                setContentView(R.layout.easy_levels);
                break;
//if the button is pushed
            case R.id.el12:
//if the button is pushed
            case R.id.myflip2:
//it will display this level
                setContentView(R.layout.my);
                break;
//if the button is pushed
            case R.id.myflip:
//it will display this level
                setContentView(R.layout.my2);
                break;
//if the button is pushed
            case R.id.myNext:
//if the button is pushed
            case R.id.myNext2:
//if the button is pushed
            case R.id.nameflip2:
//it will display this level
                setContentView(R.layout.name);
                break;
//if the button is pushed
            case R.id.nameflip:
//it will display this level
                setContentView(R.layout.name2);
                break;
//if the button is pushed
            case R.id.nameNext:
//if the button is pushed
            case R.id.nameNext2:
//if the button is pushed
            case R.id.haveflip2:
//it will display this level
                setContentView(R.layout.have);
                break;
            //if the button is pushed
            case R.id.haveflip:
                setContentView(R.layout.have2);
                break;
//if the button is pushed
            case R.id.haveNext:
//if the button is pushed
            case R.id.haveNext2:
//if the button is pushed
            case R.id.needflip2:
//it will display this level
                setContentView(R.layout.need);
                break;
//if the button is pushed
            case R.id.needflip:
//it will display this level
                setContentView(R.layout.need2);
                break;
//if the button is pushed
            case R.id.needNext:
//if the button is pushed
            case R.id.needNext2:
//it will display this level
                setContentView(R.layout.easy_levels);
                break;
//if the button is pushed
            case R.id.el13:
//if the button is pushed
            case R.id.funflip2:
//it will display this level
                setContentView(R.layout.fun);
                break;
//if the button is pushed
            case R.id.funflip:
//it will display this level
                setContentView(R.layout.fun2);
                break;
//if the button is pushed
            case R.id.funNext:
//if the button is pushed
            case R.id.funNext2:
//if the button is pushed
            case R.id.morningflip2:
//it will display this level
                setContentView(R.layout.morning);
                break;
//if the button is pushed
            case R.id.morningflip:
//it will display this level
                setContentView(R.layout.morning2);
                break;
//if the button is pushed
            case R.id.morningNext:
//if the button is pushed
            case R.id.morningNext2:
//if the button is pushed
            case R.id.nightflip2:
//it will display this level
                setContentView(R.layout.night);
                break;
//if the button is pushed
            case R.id.nightflip:
//it will display this level
                setContentView(R.layout.night2);
                break;
//if the button is pushed
            case R.id.nightNext:
//if the button is pushed
            case R.id.nightNext2:
//if the button is pushed
            case R.id.howflip2:
//it will display this level
                setContentView(R.layout.how);
                break;
//if the button is pushed
            case R.id.howflip:
//it will display this level
                setContentView(R.layout.how2);
                break;
//if the button is pushed
            case R.id.howNext:
//if the button is pushed
            case R.id.howNext2:
//it will display this level
                setContentView(R.layout.easy_levels);
                break;
//if the button is pushed
            case R.id.el14:
//if the button is pushed
            case R.id.areflip2:
//it will display this level
                setContentView(R.layout.are);
                break;
//if the button is pushed
            case R.id.areflip:
//it will display this level
                setContentView(R.layout.are2);
                break;
//if the button is pushed
            case R.id.areNext:
//if the button is pushed
            case R.id.areNext2:
//if the button is pushed
            case R.id.youflip2:
//it will display this level
                setContentView(R.layout.you);
                break;
//if the button is pushed
            case R.id.youflip:
//it will display this level
                setContentView(R.layout.you2);
                break;
//if the button is pushed
            case R.id.youNext:
//if the button is pushed
            case R.id.youNext2:
//if the button is pushed
            case R.id.oldflip2:
//it will display this level
                setContentView(R.layout.old);
                break;
//if the button is pushed
            case R.id.oldflip:

                setContentView(R.layout.old2);
                break;
//if the button is pushed
            case R.id.oldNext:
//if the button is pushed
            case R.id.oldNext2:
//if the button is pushed
            case R.id.youngflip2:
//it will display this level
                setContentView(R.layout.young);
                break;
//if the button is pushed
            case R.id.youngflip:
//it will display this level
                setContentView(R.layout.young2);
                break;
//if the button is pushed
            case R.id.youngNext:
//if the button is pushed
            case R.id.youngNext2:
//if the button is pushed
            case R.id.thanksflip2:
//it will display this level
                setContentView(R.layout.thankyou);
                break;
//if the button is pushed
            case R.id.thanksflip:
//it will display this level
                setContentView(R.layout.thankyou2);
                break;
//if the button is pushed
            case R.id.thanksNext:
//if the button is pushed
            case R.id.thanksNext2:
//if the button is pushed
            case R.id.welcomeflip2:
//it will display this level
                setContentView(R.layout.youarewelcome);
                break;
//if the button is pushed
            case R.id.welcomeflip:
//it will display this level
                setContentView(R.layout.youarewelcome2);
                break;
//if the button is pushed
            case R.id.welcomeNext:
//if the button is pushed and has an id of welcomeNext2
            case R.id.welcomeNext2:
//it will display this level
                setContentView(R.layout.easy_levels);
                break;
//if the button is pushed
            case R.id.el15:
//if the button is pushed
            case R.id.excusemeflip2:
//it will display this level
                setContentView(R.layout.excuseme);
                break;
//if the button is pushed
            case R.id.excusemeflip:
//it will display this level
                setContentView(R.layout.excuseme2);
                break;
//if the button is pushed
            case R.id.excusemeNext:
//if the button is pushed
            case R.id.excusemeNext2:
//if the button is pushed
            case R.id.pleaseflip2:
//it will display this level
                setContentView(R.layout.please);
                break;
//if the button is pushed
            case R.id.pleaseflip:
//it will display this level
                setContentView(R.layout.please2);
                break;
//if the button is pushed
            case R.id.pleaseNext:
//if the button is pushed
            case R.id.pleaseNext2:
//if the button is pushed
            case R.id.whatflip2:
//it will display this level
                setContentView(R.layout.what);
                break;
//if the button is pushed
            case R.id.whatflip:
//it will display this level
                setContentView(R.layout.what2);
                break;
//if the button is pushed
            case R.id.whatNext:
//if the button is pushed
            case R.id.whatNext2:
//if the button is pushed
            case R.id.yesflip2:
//it will display this level
                setContentView(R.layout.yes);
                break;
//if the button is pushed
            case R.id.yesflip:
//it will display this level
                setContentView(R.layout.yes2);
                break;
//if the button is pushed
            case R.id.yesNext:
//if the button is pushed
            case R.id.yesNext2:
//if the button is pushed
            case R.id.noflip2:
//it will display this level
                setContentView(R.layout.no);
                break;
//if the button is pushed
            case R.id.noflip:
//it will display this level
                setContentView(R.layout.no2);
                break;
//if the button is pushed
            case R.id.noNext:
//if the button is pushed
            case R.id.noNext2:
//it will display this level
                setContentView(R.layout.easy_levels);
                break;
//if the button is pushed
            case R.id.el16:
//if the button is pushed
            case R.id.emotionsflip:
//it will display this level
                setContentView(R.layout.emotion);
                break;
//if the button is pushed
            case R.id.emotionflip:
//it will display this level
                setContentView(R.layout.emotions);
                break;
//if the button is pushed
            case R.id.emotionsNext:
//if the button is pushed
            case R.id.emotionNext:
//if the button is pushed
            case R.id.emotionsflip2:
//it will display this level
                setContentView(R.layout.emotion2);
                break;
//if the button is pushed
            case R.id.emotionflip2:
//it will display this level
                setContentView(R.layout.emotions2);
                break;
//if the button is pushed
            case R.id.emotionsNext2:
//if the button is pushed
            case R.id.emotionNext2:
//if the button is pushed
            case R.id.emotionsflip4:
//it will display this level
                setContentView(R.layout.emotion4);
                break;
//if the button is pushed
            case R.id.emotionflip4:
//it will display this level
                setContentView(R.layout.emotions4);
                break;
//if the button is pushed
            case R.id.emotionNext4:
//if the button is pushed
            case R.id.emotionsNext4:
//if the button is pushed
            case R.id.emotionsflip5:
//it will display this level
                setContentView(R.layout.emotion5);
                break;
//if the button is pushed
            case R.id.emotionflip5:
//it will display this level
                setContentView(R.layout.emotions5);
                break;
//if the button is pushed
            case R.id.emotionsNext5:
//if the button is pushed
            case R.id.emotionNext5:
//it will display this level
                setContentView(R.layout.easy_levels);
                break;
//if the button is pushed
            case R.id.el17:
//if the button is pushed
            case R.id.emotionsflip6:
//it will display this level
                setContentView(R.layout.emotion6);
                break;
//if the button is pushed
            case R.id.emotionflip6:
//it will display this level
                setContentView(R.layout.emotions6);
                break;
//if the button is pushed
            case R.id.emotionsNext6:
//if the button is pushed
            case R.id.emotionNext6:
//if the button is pushed
            case R.id.emotionsflip7:
//it will display this level
                setContentView(R.layout.emotion7);
                break;
//if the button is pushed
            case R.id.emotionflip7:
//it will display this level
                setContentView(R.layout.emotions7);
                break;
//if the button is pushed
            case R.id.emotionsNext7:
//if the button is pushed
            case R.id.emotionNext7:
//if the button is pushed
            case R.id.emotionsflip8:
//it will display this level
                setContentView(R.layout.emotion8);
                break;
//if the button is pushed
            case R.id.emotionflip8:
//it will display this level
                setContentView(R.layout.emotions8);
                break;
//if the button is pushed
            case R.id.emotionsNext8:
//if the button is pushed
            case R.id.emotionNext8:
//if the button is pushed
            case R.id.emotionsflip9:
//it will display this level
                setContentView(R.layout.emotion9);
                break;
//if the button is pushed
            case R.id.emotionflip9:
                setContentView(R.layout.emotions9);
                break;
//if the button is pushed
            case R.id.emotionsNext9:
//if the button is pushed
            case R.id.emotionNext9:
//if the button is pushed
            case R.id.emotionsflip10:
//it will display this level
                setContentView(R.layout.emotion10);
                break;
//if the button is pushed
            case R.id.emotionflip10:
//it will display this level
                setContentView(R.layout.emotions10);
                break;
//if the button is pushed
            case R.id.emotionsNext10:
//if the button is pushed
            case R.id.emotionNext10:
//if the button is pushed
            case R.id.emotionsflip11:
//it will display this level
                setContentView(R.layout.emotion11);
                break;
//if the button is pushed
            case R.id.emotionflip11:
//it will display this level
                setContentView(R.layout.emotions11);
                break;
//if the button is pushed
            case R.id.ml1:
//if the button is pushed
            case R.id.descriptionsflip:
//it will display this level
                setContentView(R.layout.description);
                break;
//if the button is pushed
            case R.id.descriptionflip:
//it will display this level
                setContentView(R.layout.descriptions);
                break;
//if the button is pushed
            case R.id.descriptionsNext:
//if the button is pushed
            case R.id.descriptionNext:
//if the button is pushed
            case R.id.descriptionsflip2:
//it will display this level
                setContentView(R.layout.description2);
                break;
//if the button is pushed
            case R.id.descriptionflip2:
//it will display this level
                setContentView(R.layout.descriptions2);
                break;
                //if the button is pushed
            case R.id.descriptionNext2:
//if the button is pushed
            case R.id.descriptionsNext2:
//if the button is pushed
            case R.id.descriptionsflip3:
//it will display this level
                setContentView(R.layout.description3);
                break;
//if the button is pushed
            case R.id.descriptionflip3:
//it will display this level
                setContentView(R.layout.descriptions3);
                break;
//if the button is pushed
            case R.id.descriptionsNext3:
//if the button is pushed
            case R.id.descriptionNext3:
//if the button is pushed
            case R.id.descriptionsflip4:
//it will display this level
                setContentView(R.layout.description4);
                break;
//if the button is pushed
            case R.id.descriptionflip4:
//it will display this level
                setContentView(R.layout.descriptions4);
                break;
//if the button is pushed
            case R.id.descriptionNext4:
//if the button is pushed
            case R.id.descriptionsNext4:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
//if the button is pushed
            case R.id.ml2:
//if the button is pushed
            case R.id.descriptionsflip6:
//it will display this level
                setContentView(R.layout.description6);
                break;
//if the button is pushed
            case R.id.descriptionflip6:
//it will display this level
                setContentView(R.layout.descriptions6);
                break;
//if the button is pushed
            case R.id.descriptionNext6:
//if the button is pushed
            case R.id.descriptionsNext6:
//if the button is pushed
            case R.id.descriptionsflip24:
//it will display this level
                setContentView(R.layout.description24);
                break;
//if the button is pushed
            case R.id.descriptionflip24:
//it will display this level
                setContentView(R.layout.descriptions24);
                break;
//if the button is pushed
            case R.id.descriptionsNext24:
//if the button is pushed
            case R.id.descriptionNext24:
//if the button is pushed
            case R.id.descriptionsflip7:
//it will display this level
                setContentView(R.layout.description7);
                break;
//if the button is pushed
            case R.id.descriptionflip7:
//it will display this level
                setContentView(R.layout.descriptions7);
                break;
//if the button is pushed
            case R.id.descriptionNext7:
//if the button is pushed
            case R.id.descriptionsNext7:
//if the button is pushed
            case R.id.descriptionsflip8:
//it will display this level
                setContentView(R.layout.description8);
                break;
//if the button is pushed
            case R.id.descriptionflip8:

                setContentView(R.layout.descriptions8);
                break;
//if the button is pushed
            case R.id.descriptionNext8:
//if the button is pushed
            case R.id.descriptionsNext8:
//if the button is pushed
            case R.id.descriptionsflip9:
//it will display this level
                setContentView(R.layout.description9);
                break;
//if the button is pushed
            case R.id.descriptionflip9:
//it will display this level
                setContentView(R.layout.descriptions9);
                break;
//if the button is pushed
            case R.id.descriptionsNext9:
//if the button is pushed
            case R.id.descriptionNext9:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
//if the button is pushed
            case R.id.ml3:
//if the button is pushed
            case R.id.descriptionsflip10:
//it will display this level
                setContentView(R.layout.description10);
                break;
//if the button is pushed
            case R.id.descriptionflip10:
//it will display this level
                setContentView(R.layout.descriptions10);
                break;
//if the button is pushed
            case R.id.descriptionNext10:
//if the button is pushed
            case R.id.descriptionsNext10:
//if the button is pushed
            case R.id.descriptionsflip11:
//it will display this level
                setContentView(R.layout.description11);
                break;
//if the button is pushed
            case R.id.descriptionflip11:
//it will display this level
                setContentView(R.layout.descriptions11);
                break;
//if the button is pushed
            case R.id.descriptionsNext11:
//if the button is pushed
            case R.id.descriptionNext11:
//if the button is pushed
            case R.id.descriptionsflip13:
//it will display this level
                setContentView(R.layout.description13);
                break;
//if the button is pushed
            case R.id.descriptionflip13:
//it will display this level
                setContentView(R.layout.descriptions13);
                break;
//if the button is pushed
            case R.id.descriptionsNext13:
//if the button is pushed
            case R.id.descriptionNext13:
//if the button is pushed
            case R.id.descriptionsflip14:
//it will display this level
                setContentView(R.layout.description14);
                break;
//if the button is pushed
            case R.id.descriptionflip14:

                setContentView(R.layout.descriptions14);
                break;
//if the button is pushed
            case R.id.descriptionsNext14:
//if the button is pushed
            case R.id.descriptionNext14:
//if the button is pushed
            case R.id.descriptionsflip15:
//it will display this level
                setContentView(R.layout.description15);
                break;
//if the button is pushed
            case R.id.descriptionflip15:
//it will display this level
                setContentView(R.layout.descriptions15);
                break;
//if the button is pushed
            case R.id.descriptionsNext15:
//if the button is pushed
            case R.id.descriptionNext15:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
//if the button is pushed
            case R.id.ml4:
//if the button is pushed
            case R.id.descriptionsflip16:
//it will display this level
                setContentView(R.layout.description16);
                break;
//if the button is pushed
            case R.id.descriptionflip16:
//it will display this level
                setContentView(R.layout.descriptions16);
                break;
//if the button is pushed
            case R.id.descriptionsNext16:
//if the button is pushed
            case R.id.descriptionNext16:
//if the button is pushed
            case R.id.descriptionsflip17:
//it will display this level
                setContentView(R.layout.description17);
                break;
//if the button is pushed
            case R.id.descriptionflip17:
//it will display this level
                setContentView(R.layout.descriptions17);
                break;
//if the button is pushed
            case R.id.descriptionsNext17:
//if the button is pushed
            case R.id.descriptionNext17:
//if the button is pushed
            case R.id.descriptionsflip18:
//it will display this level
                setContentView(R.layout.description18);
                break;
//if the button is pushed
            case R.id.descriptionflip18:
//it will display this level
                setContentView(R.layout.descriptions18);
                break;
//if the button is pushed a
            case R.id.descriptionNext18:
//if the button is pushed
            case R.id.descriptionsNext18:
//if the button is pushed
            case R.id.descriptionsflip19:
//it will display this level
                setContentView(R.layout.description19);
                break;
//if the button is pushed
            case R.id.descriptionflip19:
//it will display this level
                setContentView(R.layout.descriptions19);
                break;
//if the button is pushed
            case R.id.descriptionsNext19:
//if the button is pushed
            case R.id.descriptionNext19:
                //it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed
            case R.id.ml5:
                //if the button is pushed
            case R.id.descriptionsflip20:
//it will display this level
                setContentView(R.layout.description20);
                break;
//if the button is pushed
            case R.id.descriptionflip20:
//it will display this level
                setContentView(R.layout.descriptions20);
                break;
//if the button is pushed
            case R.id.descriptionsNext20:
//if the button is pushed
            case R.id.descriptionNext20:
//if the button is pushed
            case R.id.descriptionsflip21:
//it will display this level
                setContentView(R.layout.description21);
                break;
//if the button is pushed
            case R.id.descriptionflip21:
//it will display this level
                setContentView(R.layout.descriptions21);
                break;
//if the button is pushed
            case R.id.descriptionsNext21:
//if the button is pushed
            case R.id.descriptionNext21:
//if the button is pushed
            case R.id.descriptionsflip22:
//it will display this level
                setContentView(R.layout.description22);
                break;
//if the button is pushed
            case R.id.descriptionflip22:
//it will display this level
                setContentView(R.layout.descriptions22);
                break;
//if the button is pushed
            case R.id.descriptionsNext22:
//if the button is pushed
            case R.id.descriptionNext22:
//if the button is pushed
            case R.id.descriptionsflip23:
//it will display this level
                setContentView(R.layout.description23);
                break;
//if the button is pushed
            case R.id.descriptionflip23:
//it will display this level
                setContentView(R.layout.descriptions23);
                break;
//if the button is pushed
            case R.id.descriptionNext23:
//if the button is pushed
            case R.id.descriptionsNext23:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
//if the button is pushed
            case R.id.ml6:
//if the button is pushed
            case R.id.hobbiesflip:
//it will display this level
                setContentView(R.layout.hobbie);
                break;
//if the button is pushed
            case R.id.hobbieflip:
//it will display this level
                setContentView(R.layout.hobbies);
                break;
//if the button is pushed
            case R.id.hobbiesNext:
//if the button is pushed
            case R.id.hobbieNext:
//if the button is pushed
            case R.id.hobbiesflip2:
//it will display this level
                setContentView(R.layout.hobbie2);
                break;
//if the button is pushed
            case R.id.hobbieflip2:
//it will display this level
                setContentView(R.layout.hobbies2);
                break;
//if the button is pushed
            case R.id.hobbiesNext2:
//if the button is pushed
            case R.id.hobbieNext2:
//if the button is pushed
            case R.id.hobbiesflip3:
//it will display this level
                setContentView(R.layout.hobbie3);
                break;
//if the button is pushed
            case R.id.hobbieflip3:
//it will display this level
                setContentView(R.layout.hobbies3);
                break;
//if the button is pushed
            case R.id.hobbiesNext3:

//if the button is pushed
            case R.id.hobbieNext3:
//if the button is pushed
            case R.id.hobbiesflip4:
//it will display this level
                setContentView(R.layout.hobbie4);
                break;
//if the button is pushed
            case R.id.hobbieflip4:
//it will display this level
                setContentView(R.layout.hobbies4);
                break;
//if the button is pushed
            case R.id.hobbiesNext4:
//if the button is pushed
            case R.id.hobbieNext4:
//if the button is pushed
            case R.id.hobbiesflip5:
//it will display this level
                setContentView(R.layout.hobbie5);
                break;
//if the button is pushed
            case R.id.hobbieflip5:
//it will display this level
                setContentView(R.layout.hobbies5);
                break;
//if the button is pushed
            case R.id.hobbiesNext5:
//if the button is pushed
            case R.id.hobbieNext5:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
//if the button is pushed
            case R.id.ml7:
//if the button is pushed
            case R.id.hobbiesflip6:
//it will display this level
                setContentView(R.layout.hobbie6);
                break;
//if the button is pushed
            case R.id.hobbieflip6:
//it will display this level
                setContentView(R.layout.hobbies6);
                break;
//if the button is pushed
            case R.id.hobbiesNext6:
//if the button is pushed
            case R.id.hobbieNext6:
//if the button is pushed
            case R.id.hobbiesflip7:
//it will display this level
                setContentView(R.layout.hobbie7);
                break;
//if the button is pushed
            case R.id.hobbieflip7:
//it will display this level
                setContentView(R.layout.hobbies7);
                break;
//if the button is pushed
            case R.id.hobbieNext7:
//if the button is pushed
            case R.id.hobbiesNext7:
//if the button is pushed
            case R.id.hobbiesflip8:
//it will display this level
                setContentView(R.layout.hobbie8);
                break;
//if the button is pushed
            case R.id.hobbieflip8:
//it will display this level
                setContentView(R.layout.hobbies8);
                break;
//if the button is pushed
            case R.id.hobbiesNext8:
//if the button is pushed
            case R.id.hobbieNext8:
//if the button is pushed
            case R.id.hobbiesflip9:
//it will display this level
                setContentView(R.layout.hobbie9);
                break;
//if the button is pushed
            case R.id.hobbieflip9:
//it will display this level
                setContentView(R.layout.hobbies9);
                break;
//if the button is pushed
            case R.id.hobbieNext9:
//if the button is pushed
            case R.id.hobbiesNext9:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
//if the button is pushed
            case R.id.ml8:
//if the button is pushed
            case R.id.hobbiesflip10:
//it will display this level
                setContentView(R.layout.hobbie10);
                break;
//if the button is pushed
            case R.id.hobbieflip10:
//it will display this level
                setContentView(R.layout.hobbies10);
                break;
//if the button is pushed
            case R.id.hobbieNext10:
//if the button is pushed
            case R.id.hobbiesNext10:
//if the button is pushed
            case R.id.hobbiesflip11:
//it will display this level
                setContentView(R.layout.hobbie11);
                break;
//if the button is pushed
            case R.id.hobbieflip11:
//it will display this level
                setContentView(R.layout.hobbies11);
                break;
//if the button is pushed
            case R.id.hobbieNext11:
//if the button is pushed
            case R.id.hobbiesNext11:
//if the button is pushed
            case R.id.hobbiesflip12:
//it will display this level
                setContentView(R.layout.hobbie12);
                break;
//if the button is pushed
            case R.id.hobbieflip12:
//it will display this level
                setContentView(R.layout.hobbies12);
                break;
//if the button is pushed
            case R.id.hobbiesNext12:
//if the button is pushed
            case R.id.hobbieNext12:
//if the button is pushed
            case R.id.hobbiesflip13:
//it will display this level
                setContentView(R.layout.hobbie13);
                break;
//if the button is pushed
            case R.id.hobbieflip13:
//it will display this level
                setContentView(R.layout.hobbies13);
                break;
//if the button is pushed
            case R.id.hobbiesNext13:
//if the button is pushed
            case R.id.hobbieNext13:
//if the button is pushed
            case R.id.hobbiesflip14:
//it will display this level
                setContentView(R.layout.hobbie14);
                break;
//if the button is pushed
            case R.id.hobbieflip14:
//it will display this level
                setContentView(R.layout.hobbies14);
                break;
//if the button is pushed
            case R.id.hobbiesNext14:
//if the button is pushed
            case R.id.hobbieNext14:
//if the button is pushed
            case R.id.hobbiesflip15:
//it will display this level
                setContentView(R.layout.hobbie15);
                break;
//if the button is pushed
            case R.id.hobbieflip15:
//it will display this level
                setContentView(R.layout.hobbies15);
                break;
                //if the button is pushed
            case R.id.hobbiesNext15:
               //if the button is pushed
            case R.id.hobbieNext15:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
               //if the button is pushed
            case R.id.ml9:
                //if the button is pushed
            case R.id.hobbiesflip16:
//it will display this level
                setContentView(R.layout.hobbie16);
                break;
                //if the button is pushed
            case R.id.hobbieflip16:
//it will display this level
                setContentView(R.layout.hobbies16);
                break;
                //if the button is pushed
            case R.id.hobbiesNext16:
                //if the button is pushed
            case R.id.hobbieNext16:
                //if the button is pushed
            case R.id.hobbiesflip18:
//it will display this level
                setContentView(R.layout.hobbie18);
                break;
                //if the button is pushed
            case R.id.hobbieflip18:
//it will display this level
                setContentView(R.layout.hobbies18);
                break;
                //if the button is pushed
            case R.id.hobbieNext18:
                //if the button is pushed
            case R.id.hobbiesNext18:
                //if the button is pushed
            case R.id.hobbiesflip19:
//it will display this level
                setContentView(R.layout.hobbie19);
                break;
                //if the button is pushed
            case R.id.hobbieflip19:
//it will display this level
                setContentView(R.layout.hobbies19);
                break;
                //if the button is pushed
            case R.id.hobbiesNext19:
                //if the button is pushed
            case R.id.hobbieNext19:
                //if the button is pushed
            case R.id.hobbiesflip20:
//it will display this level
                setContentView(R.layout.hobbie20);
                break;
                //if the button is pushed
            case R.id.hobbieflip20:
//it will display this level
                setContentView(R.layout.hobbies20);
                break;
                //if the button is pushed
            case R.id.hobbiesNext20:
                //if the button is pushed
            case R.id.hobbieNext20:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed
            case R.id.ml10:
                //if the button is pushed
            case R.id.hobbiesflip21:
//it will display this level
                setContentView(R.layout.hobbie21);
                break;
                //if the button is pushed and
            case R.id.hobbieflip21:
//it will display this level
                setContentView(R.layout.hobbies21);
                break;
                //if the button is pushed
            case R.id.hobbiesNext21:
                //if the button is pushed
            case R.id.hobbieNext21:
                //if the button is pushed
            case R.id.hobbiesflip22:
//it will display this level
                setContentView(R.layout.hobbie22);
                break;
                //if the button is pushed
            case R.id.hobbieflip22:
//it will display this level
                setContentView(R.layout.hobbies22);
                break;
                //if the button is pushed
            case R.id.hobbiesNext22:
                //if the button is pushed
            case R.id.hobbieNext22:
                //if the button is pushed
            case R.id.hobbiesflip23:
//it will display this level
                setContentView(R.layout.hobbie23);
                break;
                //if the button is pushed
            case R.id.hobbieflip23:
//it will display this level
                setContentView(R.layout.hobbies23);
                break;
                //if the button is pushed
            case R.id.hobbieNext23:
                //if the button is pushed
            case R.id.hobbiesNext23:
                //if the button is pushed
            case R.id.hobbiesflip24:
//it will display this level
                setContentView(R.layout.hobbie24);
                break;
                //if the button is pushed
            case R.id.hobbieflip24:
//it will display this level
                setContentView(R.layout.hobbies24);
                break;
                //if the button is pushed
            case R.id.hobbiesNext24:
                //if the button is pushed
            case R.id.hobbieNext24:
                //if the button is pushed
            case R.id.hobbiesflip25:
//it will display this level
                setContentView(R.layout.hobbie25);
                break;
                //if the button is pushed
            case R.id.hobbieflip25:
//it will display this level
                setContentView(R.layout.hobbies25);
                break;
                //if the button is pushed
            case R.id.hobbiesNext25:
                //if the button is pushed
            case R.id.hobbieNext25:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed
            case R.id.ml11:
                //if the button is pushed
            case R.id.hobbiesflip26:
//it will display this level
                setContentView(R.layout.hobbie26);
                break;
                //if the button is pushed
            case R.id.hobbieflip26:
//it will display this level
                setContentView(R.layout.hobbies26);
                break;
                //if the button is pushed
            case R.id.hobbiesNext26:
                //if the button is pushed
            case R.id.hobbieNext26:
                //if the button is pushed
            case R.id.hobbiesflip27:
//it will display this level
                setContentView(R.layout.hobbie27);
                break;
                //if the button is pushed
            case R.id.hobbieflip27:
//it will display this level
                setContentView(R.layout.hobbies27);
                break;
                //if the button is pushed
            case R.id.hobbiesNext27:
                //if the button is pushed
            case R.id.hobbieNext27:
                //if the button is pushed
            case R.id.hobbiesflip28:
//it will display this level
                setContentView(R.layout.hobbie28);
                break;
                //if the button is pushed
            case R.id.hobbieflip28:
                setContentView(R.layout.hobbies28);
                break;
                //if the button is pushed
            case R.id.hobbiesNext28:
                //if the button is pushed
            case R.id.hobbieNext28:
                //if the button is pushed
            case R.id.hobbiesflip29:
//it will display this level
                setContentView(R.layout.hobbie29);
                break;
                //if the button is pushed
            case R.id.hobbieflip29:
//it will display this level
                setContentView(R.layout.hobbies29);
                break;
                //if the button is pushed
            case R.id.hobbiesNext29:
                //if the button is pushed
            case R.id.hobbieNext29:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed
            case R.id.ml12:
                //if the button is pushed
            case R.id.hobbiesflip30:
//it will display this level
                setContentView(R.layout.hobbie30);
                break;
                //if the button is pushed
            case R.id.hobbieflip30:
//it will display this level
                setContentView(R.layout.hobbies30);
                break;
                //if the button is pushed
            case R.id.hobbiesNext30:
                //if the button is pushed
            case R.id.hobbieNext30:
                //if the button is pushed
            case R.id.hobbiesflip31:
//it will display this level
                setContentView(R.layout.hobbie31);
                break;
                //if the button is pushed
            case R.id.hobbieflip31:
//it will display this level
                setContentView(R.layout.hobbies31);
                break;
                //if the button is pushed
            case R.id.hobbiesNext31:
                //if the button is pushed
            case R.id.hobbieNext31:
                //if the button is pushed
            case R.id.hobbiesflip32:
//it will display this level
                setContentView(R.layout.hobbie32);
                break;
                //if the button is pushed
            case R.id.hobbieflip32:
//it will display this level
                setContentView(R.layout.hobbies32);
                break;
                //if the button is pushed
            case R.id.hobbiesNext32:
                //if the button is pushed
            case R.id.hobbieNext32:
                //if the button is pushed
            case R.id.hobbiesflip33:
//it will display this level
                setContentView(R.layout.hobbie33);
                break;
                //if the button is
            case R.id.hobbieflip33:
//it will display this level
                setContentView(R.layout.hobbies33);
                break;
               //if the button is pushed
            case R.id.hobbiesNext33:
               //if the button is pushed
            case R.id.hobbieNext33:
               //if the button is pushed
            case R.id.hobbiesflip34:
//it will display this level
                setContentView(R.layout.hobbie34);
                break;
                //if the button is pushed
            case R.id.hobbieflip34:
//it will display this level
                setContentView(R.layout.hobbies34);
                break;
                //if the button is pushed
            case R.id.hobbiesNext34:
              //if the button is pushed
            case R.id.hobbieNext34:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
               //if the button is pushed and has an id of ml13
            case R.id.ml13:
                //if the button is pushed and has an id of asflip
            case R.id.asflip:
//it will display this level
                setContentView(R.layout.animal);
                break;
                //if the button is pushed and has an id of flip
            case R.id.flip:
//it will display this level
                setContentView(R.layout.animals);
                break;
               //if the button is pushed and has an id of  asNext
            case R.id.asNext:
               //if the button is pushed and has an id of  Next
            case R.id.Next:
               //if the button is pushed and has an id of  asflip2
            case R.id.asflip2:
//it will display this level
                setContentView(R.layout.animal2);
                break;
                //if the button is pushed and has an id of flip2
            case R.id.flip2:
//it will display this level
                setContentView(R.layout.animals2);
                break;
                //if the button is pushed and has an id of asNext2
            case R.id.asNext2:
                //if the button is pushed and has an id of Next2
            case R.id.Next2:
                //if the button is pushed and has an id of asflip3
            case R.id.asflip3:
//it will display this level
                setContentView(R.layout.animal3);
                break;
              //if the button is pushed and has an id of   flip3
            case R.id.flip3:
//it will display this level
                setContentView(R.layout.animals3);
                break;
            //if the button is pushed and has an id of asNext3
            case R.id.Next3:
               //if the button is pushed and has an id of  Next3
            case R.id.asNext3:
               //if the button is pushed and has an id of  asflip4
            case R.id.asflip4:
//it will display this level
                setContentView(R.layout.animal4);
                break;
                //if the button is pushed and has an id of flip4
            case R.id.flip4:
//it will display this level
                setContentView(R.layout.animals4);
                break;
                //if the button is pushed and has an id of asNext4
            case R.id.asNext4:
                //if the button is pushed and has an id of Next4
            case R.id.Next4:
                //if the button is pushed and has an id of asflip5
            case R.id.asflip5:
//it will display this level
                setContentView(R.layout.animal5);
                break;
                //if the button is pushed and has an id of flip5
            case R.id.flip5:
                //it will display this level
                setContentView(R.layout.animals5);
                break;
                //if the button is pushed and has an id of asNext5
            case R.id.asNext5:
                //if the button is pushed and has an id of Next5
            case R.id.Next5:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed and has an id of4
            case R.id.ml14:
                //if the button is pushed and has an id of asflip6
            case R.id.asflip6:
//it will display this level
                setContentView(R.layout.animal6);
                break;
                //if the button is pushed and has an id of flip6
            case R.id.flip6:
//it will display this level
                setContentView(R.layout.animals6);
                break;
                //if the button is pushed and has an id of asNext6
            case R.id.asNext6:
                //if the button is pushed and has an id of Next6
            case R.id.Next6:
                //if the button is pushed and has an id of asflip7
            case R.id.asflip7:
//it will display this level
                setContentView(R.layout.animal7);
                break;
                //if the button is pushed and has an id of flip7
            case R.id.flip7:
//it will display this level
                setContentView(R.layout.animals7);
                break;
                //if the button is pushed and has an id of asNext7
            case R.id.asNext7:
                //if the button is pushed and has an id of Next7
            case R.id.Next7:
                //if the button is pushed and has an id of asflip8
            case R.id.asflip8:
//it will display this level
                setContentView(R.layout.animal8);
                break;
                //if the button is pushed and has an id of flip8
            case R.id.flip8:
//it will display this level
                setContentView(R.layout.animals8);
                break;
                //if the button is pushed and has an id of Next8
            case R.id.Next8:
                //if the button is pushed and has an id of asNext8
            case R.id.asNext8:
                //if the button is pushed and has an id of asflip9
            case R.id.asflip9:
//it will display this level
                setContentView(R.layout.animal9);
                break;
                //if the button is pushed and has an id of flip
            case R.id.flip9:
//it will display this level
                setContentView(R.layout.animals9);
                break;
                //if the button is pushed and has an id of asNext9
            case R.id.asNext9:
                //if the button is pushed and has an id of Next9
            case R.id.Next9:
                //if the button is pushed and has an id of asflip10
            case R.id.asflip10:
//it will display this level
                setContentView(R.layout.animal10);
                break;
                //if the button is pushed and has an id of flip10
            case R.id.flip10:
//it will display this level
                setContentView(R.layout.animals10);
                break;
                //if the button is pushed and has an id of Next
            case R.id.Next10:
                //if the button is pushed and has an id of asNext10
            case R.id.asNext10:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed and has an id of ml15
            case R.id.ml15:
                //if the button is pushed and has an id of asflip11
            case R.id.asflip11:
//it will display this level
                setContentView(R.layout.animal11);
                break;
                //if the button is pushed and has an id of flip11
            case R.id.flip11:
//it will display this level
                setContentView(R.layout.animals11);
                break;
                //if the button is pushed and has an id of Next11
            case R.id.Next11:
                //if the button is pushed and has an id of asNext11
            case R.id.asNext11:
                //if the button is pushed and has an id of asflip12
            case R.id.asflip12:
//it will display this level
                setContentView(R.layout.animal12);
                break;
                //if the button is pushed and has an id of flip12
            case R.id.flip12:
//it will display this level
                setContentView(R.layout.animals12);
                break;
                //if the button is pushed and has an id of Next12
            case R.id.Next12:
                //if the button is pushed and has an id of asNext12
            case R.id.asNext12:
                //if the button is pushed and has an id of asflip13
            case R.id.asflip13:
//it will display this level
                setContentView(R.layout.animal13);
                break;
                //if the button is pushed and has an id of flip13
            case R.id.flip13:
//it will display this level
                setContentView(R.layout.animals13);
                break;
                //if the button is pushed and has an id of Next13
            case R.id.Next13:
                //if the button is pushed and has an id of asNext13
            case R.id.asNext13:
                //if the button is pushed and has an id of asflip14
            case R.id.asflip14:
//it will display this level
                setContentView(R.layout.animal14);
                break;
                //if the button is pushed and has an id of flip14
            case R.id.flip14:
//it will display this level
                setContentView(R.layout.animals14);
                break;
                //if the button is pushed and has an id of Next14
            case R.id.Next14:
                //if the button is pushed and has an id of asNext14
            case R.id.asNext14:
                //if the button is pushed and has an id of asflip15
            case R.id.asflip15:
//it will display this level
                setContentView(R.layout.animal15);
                break;
                //if the button is pushed and has an id of flip15
            case R.id.flip15:
//it will display this level
                setContentView(R.layout.animals15);
                break;
                //if the button is pushed and has an id of Next15
            case R.id.Next15:
                //if the button is pushed and has an id of asNext15
            case R.id.asNext15:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed and has an id of ml16
            case R.id.ml16:
                //if the button is pushed and has an id of asflip16
            case R.id.asflip16:
//it will display this level
                setContentView(R.layout.animal16);
                break;
                //if the button is pushed and has an id of flip16
            case R.id.flip16:
//it will display this level
                setContentView(R.layout.animals16);
                break;
                //if the button is pushed and has an id of asNext16
            case R.id.asNext16:
                //if the button is pushed and has an id of Next16
            case R.id.Next16:
                //if the button is pushed and has an id of asflip17
            case R.id.asflip17:
//it will display this level
                setContentView(R.layout.animal17);
                break;
                //if the button is pushed and has an id of flip17
            case R.id.flip17:
//it will display this level
                setContentView(R.layout.animals17);
                break;
                //if the button is pushed and has an id of Next17
            case R.id.Next17:
                //if the button is pushed and has an id of asNext17
            case R.id.asNext17:
                //if the button is pushed and has an id of asflip18
            case R.id.asflip18:
//it will display this level
                setContentView(R.layout.animal18);
                break;
                //if the button is pushed and has an id of flip18
            case R.id.flip18:
//it will display this level
                setContentView(R.layout.animals18);
                break;
                //if the button is pushed and has an id of asNext18
            case R.id.asNext18:
                //if the button is pushed and has an id of Next18
            case R.id.Next18:
                //if the button is pushed and has an id of asflip19
            case R.id.asflip19:
//it will display this level
                setContentView(R.layout.animal19);
                break;
                //if the button is pushed and has an id of flip19
            case R.id.flip19:
//it will display this level
                setContentView(R.layout.animals19);
                break;
                //if the button is pushed and has an id of asNext19
            case R.id.asNext19:
                //if the button is pushed and has an id of Next19
            case R.id.Next19:
                //if the button is pushed and has an id of asflip20
            case R.id.asflip20:
//it will display this level
                setContentView(R.layout.animal20);
                break;
                //if the button is pushed and has an id of flip20
            case R.id.flip20:
                //it will display this level
                setContentView(R.layout.animals20);
                break;
                //if the button is pushed and has an id of asNext20
            case R.id.asNext20:
                //if the button is pushed and has an id of Next20
            case R.id.Next20:
//it will display this level
                setContentView(R.layout.medium_levels);
                break;
                //if the button is pushed and has an id of ml17
            case R.id.ml17:
                //if the button is pushed and has an id of asflip21
            case R.id.asflip21:
//it will display this level
                setContentView(R.layout.animal21);
                break;
                //if the button is pushed and has an id of flip21
            case R.id.flip21:
//it will display this level
                setContentView(R.layout.animals21);
                break;
                //if the button is pushed and has an id of asNext21
            case R.id.asNext21:
                //if the button is pushed and has an id of Next21
            case R.id.Next21:
                //if the button is pushed and has an id of asflip22
            case R.id.asflip22:
//it will display this level
                setContentView(R.layout.animal22);
                break;
                //if the button is pushed and has an id of flip22
            case R.id.flip22:
//it will display this level
                setContentView(R.layout.animals22);
                break;
                //if the button is pushed and has an id of asNext22
            case R.id.asNext22:
                //if the button is pushed and has an id of Next22
            case R.id.Next22:
                //if the button is pushed and has an id of asflip23
            case R.id.asflip23:
//it will display this level
                setContentView(R.layout.animal23);
                break;
                //if the button is pushed and has an id of flip23
            case R.id.flip23:
//it will display this level
                setContentView(R.layout.animals23);
                break;
                //if the button is pushed and has an id of asNext23
            case R.id.asNext23:
                //if the button is pushed and has an id of Next23
            case R.id.Next23:
//it will display this level
                setContentView(R.layout.hard);
                break;
                //if the button is pushed and has an id of hl1
            case R.id.hl1:
                //if the button is pushed and has an id of familyflip
            case R.id.familyflip:
//it will display this level
                setContentView(R.layout.families);
                break;
                //if the button is pushed and has an id of familiesflip
            case R.id.familiesflip:
//it will display this level
                setContentView(R.layout.family);
                break;
                //if the button is pushed and has an id of familiesNext
            case R.id.familiesNext:
                //if the button is pushed and has an id of familyNext
            case R.id.familyNext:
                //if the button is pushed and has an id of familyflip2
            case R.id.familyflip2:
//it will display this level
                setContentView(R.layout.families2);
                break;
                //if the button is pushed and has an id of familiesflip2
            case R.id.familiesflip2:
//it will display this level
                setContentView(R.layout.family2);
                break;
                //if the button is pushed and has an id of familiesNext2
            case R.id.familiesNext2:
                //if the button is pushed and has an id of familyNext2
            case R.id.familyNext2:
                //if the button is pushed and has an id of familyflip3
            case R.id.familyflip3:
//it will display this level
                setContentView(R.layout.families3);
                break;
                //if the button is pushed and has an id of familiesflip3
            case R.id.familiesflip3:
//it will display this level
                setContentView(R.layout.family3);
                break;
                //if the button is pushed and has an id of familiesNext3
            case R.id.familiesNext3:
                //if the button is pushed and has an id of familyNext3
            case R.id.familyNext3:
                //if the button is pushed and has an id of familyflip4
            case R.id.familyflip4:
//it will display this level
                setContentView(R.layout.families4);
                break;
                //if the button is pushed and has an id of familiesflip4
            case R.id.familiesflip4:
//it will display this level
                setContentView(R.layout.family4);
                break;
                //if the button is pushed and has an id of familiesNext4
            case R.id.familiesNext4:
                //if the button is pushed and has an id of familyNext4
            case R.id.familyNext4:
                //if the button is pushed and has an id of familyflip5
            case R.id.familyflip5:
//it will display this level
                setContentView(R.layout.families5);
                break;
                //if the button is pushed and has an id of familiesflip5
            case R.id.familiesflip5:
//it will display this level
                setContentView(R.layout.family5);
                break;
                //if the button is pushed and has an id of familiesNext5
            case R.id.familiesNext5:
                //if the button is pushed and has an id of familyNext5
            case R.id.familyNext5:
                //if the button is pushed and has an id of familyNext familyflip6
            case R.id.familyflip6:
//it will display this level
                setContentView(R.layout.families6);
                break;
                //if the button is pushed and has an id of familiesflip6
            case R.id.familiesflip6:
//it will display this level
                setContentView(R.layout.family6);
                break;
                //if the button is pushed and has an id of familiesNext6
            case R.id.familiesNext6:
                //if the button is pushed and has an id of familyNext6
            case R.id.familyNext6:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl2
            case R.id.hl2:
                //if the button is pushed and has an id of familyflip7
            case R.id.familyflip7:
//it will display this level
                setContentView(R.layout.families7);
                break;
                //if the button is pushed and has an id of familiesflip7
            case R.id.familiesflip7:
//it will display this level
                setContentView(R.layout.family7);
                break;
                //if the button is pushed and has an id of familiesNext7
            case R.id.familiesNext7:
                //if the button is pushed and has an id of familyNext7
            case R.id.familyNext7:
                //if the button is pushed and has an id of familyflip8
            case R.id.familyflip8:
//it will display this level
                setContentView(R.layout.families8);
                break;
                //if the button is pushed and has an id of familiesflip8
            case R.id.familiesflip8:
//it will display this level
                setContentView(R.layout.family8);
                break;
                //if the button is pushed and has an id of familiesNext8
            case R.id.familiesNext8:
                //if the button is pushed and has an id of familyNext8
            case R.id.familyNext8:
                //if the button is pushed and has an id of familyflip9
            case R.id.familyflip9:
//it will display this level
                setContentView(R.layout.families9);
                break;
                //if the button is pushed and has an id of familiesflip9
            case R.id.familiesflip9:
//it will display this level
                setContentView(R.layout.family9);
                break;
                //if the button is pushed and has an id of familiesNext9
            case R.id.familiesNext9:
                //if the button is pushed and has an id of familyNext9
            case R.id.familyNext9:
                //if the button is pushed and has an id of familyflip10
            case R.id.familyflip10:
//it will display this level
                setContentView(R.layout.families10);
                break;
                //if the button is pushed and has an id of familiesflip10
            case R.id.familiesflip10:
//it will display this level
                setContentView(R.layout.family10);
                break;
                //if the button is pushed and has an id of familiesNext10
            case R.id.familiesNext10:
                //if the button is pushed and has an id of familyNext10
            case R.id.familyNext10:
                //if the button is pushed and has an id of familyflip11
            case R.id.familyflip11:
//it will display this level
                setContentView(R.layout.families11);
                break;
                //if the button is pushed and has an id of familiesflip11
            case R.id.familiesflip11:
//it will display this level
                setContentView(R.layout.family11);
                break;
                //if the button is pushed and has an id of familiesNext11
            case R.id.familiesNext11:
                //if the button is pushed and has an id of familyNext11
            case R.id.familyNext11:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl3
            case R.id.hl3:
                //if the button is pushed and has an id of familyflip12
            case R.id.familyflip12:
//it will display this level
                setContentView(R.layout.families12);
                break;
                //if the button is pushed and has an id of familiesflip12
            case R.id.familiesflip12:
//it will display this level
                setContentView(R.layout.family12);
                break;
                //if the button is pushed and has an id of familiesNext12
            case R.id.familiesNext12:
                //if the button is pushed and has an id of familyNext12
            case R.id.familyNext12:
                //if the button is pushed and has an id of familyflip13
            case R.id.familyflip13:
//it will display this level
                setContentView(R.layout.families13);
                break;
                //if the button is pushed and has an id of familiesflip13
            case R.id.familiesflip13:
//it will display this level
                setContentView(R.layout.family13);
                break;
                //if the button is pushed and has an id of familiesNext13
            case R.id.familiesNext13:
                //if the button is pushed and has an id of familyNext13
            case R.id.familyNext13:
                //if the button is pushed and has an id of familyflip14
            case R.id.familyflip14:
//it will display this level
                setContentView(R.layout.families14);
                break;
                //if the button is pushed and has an id of familiesflip15
            case R.id.familiesflip14:
//it will display this level
                setContentView(R.layout.family14);
                break;
                //if the button is pushed and has an id of familiesNext15
            case R.id.familiesNext14:
                //if the button is pushed and has an id of familyNext15
            case R.id.familyNext14:
                //if the button is pushed and has an id of familyflip15
            case R.id.familyflip15:
//it will display this level
                setContentView(R.layout.families15);
                break;
                //if the button is pushed and has an id of familiesflip15
            case R.id.familiesflip15:
//it will display this level
                setContentView(R.layout.family15);
                break;
                //if the button is pushed and has an id of familiesNext15
            case R.id.familiesNext15:
                //if the button is pushed and has an id of familyNext15
            case R.id.familyNext15:
                //if the button is pushed and has an id of familyflip16
            case R.id.familyflip16:
                //it will display this level
                setContentView(R.layout.families16);
                break;
                //if the button is pushed and has an id of familiesflip16
            case R.id.familiesflip16:
//it will display this level
                setContentView(R.layout.family16);
                break;
                //if the button is pushed and has an id of familiesNext16
            case R.id.familiesNext16:
                //if the button is pushed and has an id of familyNext16
            case R.id.familyNext16:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl4
            case R.id.hl4:
                //if the button is pushed and has an id of familyflip17
            case R.id.familyflip17:
//it will display this level
                setContentView(R.layout.families17);
                break;
                //if the button is pushed and has an id of familiesflip17
            case R.id.familiesflip17:
//it will display this level
                setContentView(R.layout.family17);
                break;
                //if the button is pushed and has an id of familiesNext17
            case R.id.familiesNext17:
              //if the button is pushed and has an id of   familyNext17
            case R.id.familyNext17:
                //if the button is pushed and has an id of familyflip18
            case R.id.familyflip18:
//it will display this level
                setContentView(R.layout.families18);
                break;
                //if the button is pushed and has an id of familiesflip18
            case R.id.familiesflip18:
//it will display this level
                setContentView(R.layout.family18);
                break;
               //if the button is pushed and has an id of  familyNext18
            case R.id.familiesNext18:
              //if the button is pushed and has an id of   familiesNext18
            case R.id.familyNext18:
              //if the button is pushed and has an id of  familyflip19
            case R.id.familyflip19:
//it will display this level
                setContentView(R.layout.families19);
                break;
               //if the button is pushed and has an id of  familiesflip19
            case R.id.familiesflip19:
//it will display this level
                setContentView(R.layout.family19);
                break;
                //if the button is pushed and has an id of familyNext19
            case R.id.familyNext19:
                //if the button is pushed and has an id of familiesNext19
            case R.id.familiesNext19:
                //if the button is pushed and has an id of familyflip20
            case R.id.familyflip20:
//it will display this level
                setContentView(R.layout.families20);
                break;
                //if the button is pushed and has an id of familiesflip20
            case R.id.familiesflip20:
//it will display this level
                setContentView(R.layout.family20);
                break;
                //if the button is pushed and has an id of familyNext20
            case R.id.familyNext20:
                //if the button is pushed and has an id of familiesNext20
            case R.id.familiesNext20:
                //if the button is pushed and has an id of familyflip21
            case R.id.familyflip21:
//it will display this level
                setContentView(R.layout.families21);
                break;
                //if the button is pushed and has an id of familiesflip21
            case R.id.familiesflip21:
//it will display this level
                setContentView(R.layout.family21);
                break;
                //if the button is pushed and has an id of familiesNext21
            case R.id.familiesNext21:
                //if the button is pushed and has an id of familyNext21
            case R.id.familyNext21:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id ofvhl5
            case R.id.hl5:
                //if the button is pushed and has an id of familyflip22
            case R.id.familyflip22:
//it will display this level
                setContentView(R.layout.families22);
                break;
                //if the button is pushed and has an id of familiesflip22
            case R.id.familiesflip22:
//it will display this level
                setContentView(R.layout.family22);
                break;
                //if the button is pushed and has an id of familiesNext22
            case R.id.familiesNext22:
                //if the button is pushed and has an id of familyNext22
            case R.id.familyNext22:
                //if the button is pushed and has an id of familyflip23
            case R.id.familyflip23:
//it will display this level
                setContentView(R.layout.families23);
                break;
                //if the button is pushed and has an id of familiesflip23
            case R.id.familiesflip23:
//it will display this level
                setContentView(R.layout.family23);
                break;
                //if the button is pushed and has an id of familiesNext23
            case R.id.familiesNext23:
                //if the button is pushed and has an id of familyNext23
            case R.id.familyNext23:
                //if the button is pushed and has an id of familyflip24
            case R.id.familyflip24:
//it will display this level
                setContentView(R.layout.families24);
                break;
                //if the button is pushed and has an id of familiesflip24
            case R.id.familiesflip24:
//it will display this level
                setContentView(R.layout.family24);
                break;
                //if the button is pushed and has an id of familiesNext24
            case R.id.familiesNext24:
                //if the button is pushed and has an id of familyNext24
            case R.id.familyNext24:
                //if the button is pushed and has an id of familyflip25
            case R.id.familyflip25:
//it will display this level
                setContentView(R.layout.families25);
                break;
                //if the button is pushed and has an id of familiesflip25
            case R.id.familiesflip25:
//it will display this level
                setContentView(R.layout.family25);
                break;
                //if the button is pushed and has an id of familiesNext25
            case R.id.familiesNext25:
                //if the button is pushed and has an id of familyNext25
            case R.id.familyNext25:
                //if the button is pushed and has an id of familyflip26
            case R.id.familyflip26:
//it will display this level
                setContentView(R.layout.families26);
                break;
                //if the button is pushed and has an id of familiesflip26
            case R.id.familiesflip26:
//it will display this level
                setContentView(R.layout.family26);
                break;
                //if the button is pushed and has an id of familiesNext26
            case R.id.familiesNext26:
                //if the button is pushed and has an id of familyNext26
            case R.id.familyNext26:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
              //if the button is pushed and has an id of  hl6
            case R.id.hl6:
              //if the button is pushed and has an id of familyflip27
            case R.id.familyflip27:
//it will display this level
                setContentView(R.layout.families27);
                break;
             //if the button is pushed and has an id of    familiesflip27
            case R.id.familiesflip27:
//it will display this level
                setContentView(R.layout.family27);
                break;
              //if the button is pushed and has an id of   familiesNext27
            case R.id.familiesNext27:
               //if the button is pushed and has an id of  familyNext27
            case R.id.familyNext27:
               //if the button is pushed and has an id of  familyflip28
            case R.id.familyflip28:
//it will display this level
                setContentView(R.layout.families28);
                break;
              //if the button is pushed and has an id of   familiesflip28
            case R.id.familiesflip28:
//it will display this level
                setContentView(R.layout.family28);
                break;
                //if the button is pushed and has an id of familiesNext28
            case R.id.familiesNext28:
                //if the button is pushed and has an id of familyNext28
            case R.id.familyNext28:
                //if the button is pushed and has an id of familyflip29
            case R.id.familyflip29:
//it will display this level
                setContentView(R.layout.families29);
                break;
                //if the button is pushed and has an id of familiesflip29
            case R.id.familiesflip29:
//it will display this level
                setContentView(R.layout.family29);
                break;
                //if the button is pushed and has an id of familiesNext29
            case R.id.familiesNext29:
                //if the button is pushed and has an id of familyNext29
            case R.id.familyNext29:
                //if the button is pushed and has an id of familyNext familyflip30
            case R.id.familyflip30:
//it will display this level
                setContentView(R.layout.families30);
                break;
                //if the button is pushed and has an id of familiesflip30
            case R.id.familiesflip30:
//it will display this level
                setContentView(R.layout.family30);
                break;
                //if the button is pushed and has an id of familiesNext30
            case R.id.familiesNext30:
                //if the button is pushed and has an id of familyNext30
            case R.id.familyNext30:
                //if the button is pushed and has an id of familyflip31
            case R.id.familyflip31:
//it will display this level
                setContentView(R.layout.families31);
                break;
                //if the button is pushed and has an id of familiesflip31
            case R.id.familiesflip31:

//it will display this level
                setContentView(R.layout.family31);
                break;
                //if the button is pushed and has an id of familiesNext31
            case R.id.familiesNext31:
                //if the button is pushed and has an id of familyNext31
            case R.id.familyNext31:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl7
            case R.id.hl7:
                //if the button is pushed and has an id of familyflip32
            case R.id.familyflip32:
//it will display this level
                setContentView(R.layout.families32);
                break;
                //if the button is pushed and has an id of familiesflip32
            case R.id.familiesflip32:
//it will display this level
                setContentView(R.layout.family32);
                break;
                //if the button is pushed and has an id of familiesNext32
            case R.id.familiesNext32:
                //if the button is pushed and has an id of familyNext32
            case R.id.familyNext32:
                //if the button is pushed and has an id of familyflip33
            case R.id.familyflip33:
//it will display this level
                setContentView(R.layout.families33);
                break;
                //if the button is pushed and has an id of familiesflip33
            case R.id.familiesflip33:
//it will display this level
                setContentView(R.layout.family33);
                break;
                //if the button is pushed and has an id of familiesNext33
            case R.id.familiesNext33:
                //if the button is pushed and has an id of familyNext33
            case R.id.familyNext33:
                //if the button is pushed and has an id of familyflip34
            case R.id.familyflip34:
//it will display this level
                setContentView(R.layout.families34);
                break;
                //if the button is pushed and has an id of familiesflip34
            case R.id.familiesflip34:
//it will display this level
                setContentView(R.layout.family34);
                break;
                //if the button is pushed and has an id of familiesNext34
            case R.id.familiesNext34:
                //if the button is pushed and has an id of familyNext34
            case R.id.familyNext34:
                //if the button is pushed and has an id of familyflip35
            case R.id.familyflip35:
//it will display this level
                setContentView(R.layout.families35);
                break;
                //if the button is pushed and has an id of familiesflip35
            case R.id.familiesflip35:
//it will display this level
                setContentView(R.layout.family35);
                break;
                //if the button is pushed and has an id of familiesNext35
            case R.id.familiesNext35:
                //if the button is pushed and has an id of familyNext35
            case R.id.familyNext35:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl8
            case R.id.hl8:
                //if the button is pushed and has an id of familyflip36
            case R.id.familyflip36:
//it will display this level
                setContentView(R.layout.families36);
                break;
                //if the button is pushed and has an id of familiesflip36
            case R.id.familiesflip36:
//it will display this level
                setContentView(R.layout.family36);
                break;
                //if the button is pushed and has an id of familiesNext36
            case R.id.familiesNext36:
                //if the button is pushed and has an id of familyNext36
            case R.id.familyNext36:
                //if the button is pushed and has an id of familyflip37
            case R.id.familyflip37:
//it will display this level
                setContentView(R.layout.families37);
                break;
                //if the button is pushed and has an id of familiesflip37
            case R.id.familiesflip37:
//it will display this level
                setContentView(R.layout.family37);
                break;
                //if the button is pushed and has an id of familiesNext37
            case R.id.familiesNext37:
                //if the button is pushed and has an id of familyNext37
            case R.id.familyNext37:
                //if the button is pushed and has an id of familyflip38
            case R.id.familyflip38:
//it will display this level
                setContentView(R.layout.families38);
                break;
                //if the button is pushed and has an id of familiesflip38
            case R.id.familiesflip38:
//it will display this level
                setContentView(R.layout.family38);
                break;
                //if the button is pushed and has an id of familiesNext38
            case R.id.familiesNext38:
                //if the button is pushed and has an id of familyNext38
            case R.id.familyNext38:
                //if the button is pushed and has an id of familyflip39
            case R.id.familyflip39:
//it will display this level
                setContentView(R.layout.families39);
                break;
                //if the button is pushed and has an id of familiesflip39
            case R.id.familiesflip39:
//it will display this level
                setContentView(R.layout.family39);
                break;
                //if the button is pushed and has an id of familiesNext39
            case R.id.familiesNext39:
                //if the button is pushed and has an id of familyNext39
            case R.id.familyNext39:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl9
            case R.id.hl9:
                //if the button is pushed and has an id of familyflip40
            case R.id.familyflip40:
//it will display this level
                setContentView(R.layout.families40);
                break;
                //if the button is pushed and has an id of familiesflip40
            case R.id.familiesflip40:
//it will display this level
                setContentView(R.layout.family40);
                break;
                //if the button is pushed and has an id of familiesNext40
            case R.id.familiesNext40:
                //if the button is pushed and has an id of familyNext40
            case R.id.familyNext40:
                //if the button is pushed and has an id of familyflip41
            case R.id.familyflip41:
//it will display this level
                setContentView(R.layout.families41);
                break;
                //if the button is pushed and has an id of familyNext41
            case R.id.familiesflip41:
//it will display this level
                setContentView(R.layout.family41);
                break;
                //if the button is pushed and has an id of familiesNext41
            case R.id.familiesNext41:
                //if the button is pushed and has an id of familyNext41
            case R.id.familyNext41:
                //if the button is pushed and has an id of familyflip42
            case R.id.familyflip42:
//it will display this level
                setContentView(R.layout.families42);
                break;
                //if the button is pushed and has an id of familiesflip42
            case R.id.familiesflip42:
//it will display this level
                setContentView(R.layout.family42);
                break;
                //if the button is pushed and has an id of familiesNext42
            case R.id.familiesNext42:
                //if the button is pushed and has an id of familyNext42
            case R.id.familyNext42:
                //if the button is pushed and has an id of familyflip43
            case R.id.familyflip43:
//it will display this level
                setContentView(R.layout.families43);
                break;
                //if the button is pushed and has an id of familiesflip43
            case R.id.familiesflip43:
//it will display this level
                setContentView(R.layout.family43);
                break;
                //if the button is pushed and has an id of familiesNext43
            case R.id.familiesNext43:
                //if the button is pushed and has an id of familyNext43
            case R.id.familyNext43:
                //if the button is pushed and has an id of familyflip44
            case R.id.familyflip44:
//it will display this level
                setContentView(R.layout.families44);
                break;
                //if the button is pushed and has an id of familiesflip44
            case R.id.familiesflip44:
//it will display this level
                setContentView(R.layout.family44);
                break;
                //if the button is pushed and has an id of familiesNext
            case R.id.familiesNext44:
                //if the button is pushed and has an id of familyNext
            case R.id.familyNext44:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl10
            case R.id.hl10:
                //if the button is pushed and has an id of schoolsflip
            case R.id.schoolsflip:
//it will display this level
                setContentView(R.layout.school);
                break;
                //if the button is pushed and has an id of schoolflip
            case R.id.schoolflip:
//it will display this level
                setContentView(R.layout.schools);
                break;
                //if the button is pushed and has an id of schoolsNext
            case R.id.schoolsNext:
                //if the button is pushed and has an id of schoolNext
            case R.id.schoolNext:
                //if the button is pushed and has an id of schoolsflip2
            case R.id.schoolsflip2:
//it will display this level
                setContentView(R.layout.school2);
                break;
                //if the button is pushed and has an id of schoolflip2
            case R.id.schoolflip2:
//it will display this level
                setContentView(R.layout.schools2);
                break;
                //if the button is pushed and has an id of schoolsNext2
            case R.id.schoolsNext2:
                //if the button is pushed and has an id of schoolNext2
            case R.id.schoolNext2:
                //if the button is pushed and has an id of schoolsflip3
            case R.id.schoolsflip3:
//it will display this level
                setContentView(R.layout.school3);
                break;
                //if the button is pushed and has an id of schoolflip3
            case R.id.schoolflip3:
//it will display this level
                setContentView(R.layout.schools3);
                break;
                //if the button is pushed and has an id of schoolsNext3
            case R.id.schoolsNext3:
                //if the button is pushed and has an id of schoolNext3
            case R.id.schoolNext3:
                //if the button is pushed and has an id of schoolsflip4
            case R.id.schoolsflip4:
//it will display this level
                setContentView(R.layout.school4);
                break;
                //if the button is pushed and has an id of schoolflip4
            case R.id.schoolflip4:
//it will display this level
                setContentView(R.layout.schools4);
                break;
                //if the button is pushed and has an id of schoolsNext4
            case R.id.schoolsNext4:
                //if the button is pushed and has an id of schoolsNext4
            case R.id.schoolNext4:
                //if the button is pushed and has an id of schoolsflip5
            case R.id.schoolsflip5:
//it will display this level
                setContentView(R.layout.school5);
                break;
                //if the button is pushed and has an id of schoolflip5
            case R.id.schoolflip5:
//it will display this level
                setContentView(R.layout.schools5);
                break;
                //if the button is pushed and has an id of schoolsNext5
            case R.id.schoolsNext5:
                //if the button is pushed and has an id of schoolNext5
            case R.id.schoolNext5:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl11
            case R.id.hl11:
                //if the button is pushed and has an id of schoolsflip6
            case R.id.schoolsflip6:
//it will display this level
                setContentView(R.layout.school6);
                break;
                //if the button is pushed and has an id of schoolflip6
            case R.id.schoolflip6:
//it will display this level
                setContentView(R.layout.schools6);
                break;
                //if the button is pushed and has an id of schoolNext6
            case R.id.schoolNext6:
                //if the button is pushed and has an id of schoolsNext6
            case R.id.schoolsNext6:
                //if the button is pushed and has an id of schoolsflip7
            case R.id.schoolsflip7:
//it will display this level
                setContentView(R.layout.school7);
                break;
                //if the button is pushed and has an id of schoolflip7
            case R.id.schoolflip7:
//it will display this level
                setContentView(R.layout.schools7);
                break;
                //if the button is pushed and has an id of schoolsNext7
            case R.id.schoolsNext7:
                //if the button is pushed and has an id of schoolNext7
            case R.id.schoolNext7:
                //if the button is pushed and has an id of schoolsflip8
            case R.id.schoolsflip8:
//it will display this level
                setContentView(R.layout.school8);
                break;
                //if the button is pushed and has an id of schoolflip8
            case R.id.schoolflip8:
//it will display this level
                setContentView(R.layout.schools8);
                break;
                //if the button is pushed and has an id of schoolsNext8
            case R.id.schoolsNext8:
                //if the button is pushed and has an id of schoolNext8
            case R.id.schoolNext8:
                //if the button is pushed and has an id of schoolsflip9
            case R.id.schoolsflip9:
//it will display this level
                setContentView(R.layout.school9);
                break;
                //if the button is pushed and has an id of schoolflip9
            case R.id.schoolflip9:
//it will display this level
                setContentView(R.layout.schools9);
                break;
                //if the button is pushed and has an id of schoolsNext9
            case R.id.schoolsNext9:
                //if the button is pushed and has an id of schoolNext9
            case R.id.schoolNext9:
                //if the button is pushed and has an id of schoolsflip10
            case R.id.schoolsflip10:
//it will display this level
                setContentView(R.layout.school10);
                break;
                //if the button is pushed and has an id of schoolflip10
            case R.id.schoolflip10:
//it will display this level
                setContentView(R.layout.schools10);
                break;
                //if the button is pushed and has an id of schoolsNext10
            case R.id.schoolsNext10:
                //if the button is pushed and has an id of schoolNext10
            case R.id.schoolNext10:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl12
            case R.id.hl12:
                //if the button is pushed and has an id of schoolsflip11
            case R.id.schoolsflip11:
//it will display this level
                setContentView(R.layout.school11);
                break;
                //if the button is pushed and has an id of schoolflip11
            case R.id.schoolflip11:
//it will display this level
                setContentView(R.layout.schools11);
                break;
                //if the button is pushed and has an id of schoolsNext11
            case R.id.schoolsNext11:
                //if the button is pushed and has an id of schoolNext11
            case R.id.schoolNext11:
                //if the button is pushed and has an id of schoolsflip12
            case R.id.schoolsflip12:
//it will display this level
                setContentView(R.layout.school12);
                break;
                //if the button is pushed and has an id of schoolflip12
            case R.id.schoolflip12:
//it will display this level
                setContentView(R.layout.schools12);
                break;
                //if the button is pushed and has an id of schoolNext12
            case R.id.schoolNext12:
                //if the button is pushed and has an id of schoolsNext12
            case R.id.schoolsNext12:
                //if the button is pushed and has an id of schoolsflip13
            case R.id.schoolsflip13:
//it will display this level
                setContentView(R.layout.school13);
                break;
                //if the button is pushed and has an id of schoolflip13
            case R.id.schoolflip13:
//it will display this level
                setContentView(R.layout.schools13);
                break;
            //if the button is pushed and has an id of schoolsNext13
            case R.id.schoolsNext13:
                //if the button is pushed and has an id of schoolNext13
            case R.id.schoolNext13:
                //if the button is pushed and has an id of schoolsflip14
            case R.id.schoolsflip14:
//it will display this level
                setContentView(R.layout.school14);
                break;
                //if the button is pushed and has an id of schoolflip14
            case R.id.schoolflip14:
//it will display this level
                setContentView(R.layout.schools14);
                break;
                //if the button is pushed and has an id of schoolsNext14
            case R.id.schoolsNext14:
                //if the button is pushed and has an id of schoolNext14
            case R.id.schoolNext14:
                //if the button is pushed and has an id of schoolsflip15
            case R.id.schoolsflip15:
//it will display this level
                setContentView(R.layout.school15);
                break;
                //if the button is pushed and has an id of schoolflip15
            case R.id.schoolflip15:
//it will display this level
                setContentView(R.layout.schools15);
                break;
                //if the button is pushed and has an id of schoolsNext15
            case R.id.schoolsNext15:
                //if the button is pushed and has an id of schoolNext15
            case R.id.schoolNext15:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl13
            case R.id.hl13:
                //if the button is pushed and has an id of schoolsflip16
            case R.id.schoolsflip16:
//it will display this level
                setContentView(R.layout.school16);
                break;
                //if the button is pushed and has an id of schoolflip16
            case R.id.schoolflip16:
//it will display this level
                setContentView(R.layout.schools16);
                break;
               //if the button is pushed and has an id of schoolsNext16
            case R.id.schoolsNext16:
               //if the button is pushed and has an id of schoolNext16
            case R.id.schoolNext16:
               //if the button is pushed and has an id of schoolsflip17
            case R.id.schoolsflip17:
//it will display this level
                setContentView(R.layout.school17);
                break;
               //if the button is pushed and has an id of schoolflip17
            case R.id.schoolflip17:
//it will display this level
                setContentView(R.layout.schools17);
                break;
                //if the button is pushed and has an id of schoolsNext17
            case R.id.schoolsNext17:
                //if the button is pushed and has an id of schoolNext17
            case R.id.schoolNext17:
                //if the button is pushed and has an id of schoolsflip18
            case R.id.schoolsflip18:
//it will display this level
                setContentView(R.layout.school18);
                break;
                //if the button is pushed and has an id of schoolflip18
            case R.id.schoolflip18:
//it will display this level
                setContentView(R.layout.schools18);
                break;
                //if the button is pushed and has an id of schoolsNext18
            case R.id.schoolsNext18:
                //if the button is pushed and has an id of schoolNext18
            case R.id.schoolNext18:
                //if the button is pushed and has an id of schoolsflip19
            case R.id.schoolsflip19:
//it will display this level
                setContentView(R.layout.school19);
                break;
                //if the button is pushed and has an id of schoolflip19
            case R.id.schoolflip19:
//it will display this level
                setContentView(R.layout.schools19);
                break;
                //if the button is pushed and has an id of schoolNext19
            case R.id.schoolNext19:
                //if the button is pushed and has an id of schoolNext19
            case R.id.schoolsNext19:
                //if the button is pushed and has an id of schoolflip20
            case R.id.schoolsflip20:
//it will display this level
                setContentView(R.layout.school20);
                break;
                //if the button is pushed and has an id of schoolflip20
            case R.id.schoolflip20:
//it will display this level
                setContentView(R.layout.schools20);
                break;
                //if the button is pushed and has an id of schoolNext20
            case R.id.schoolNext20:
                //if the button is pushed and has an id of schoolsNext20
            case R.id.schoolsNext20:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of
            case R.id.hl14:
                //if the button is pushed and has an id schoolsflip21
            case R.id.schoolsflip21:
//it will display this level
                setContentView(R.layout.school21);
                break;
                //if the button is pushed and has an id of schoolflip21
            case R.id.schoolflip21:
//it will display this level
                setContentView(R.layout.schools21);
                break;
                //if the button is pushed and has an id of schoolsNext21
            case R.id.schoolsNext21:
                //if the button is pushed and has an id of schoolNext21
            case R.id.schoolNext21:
                //if the button is pushed and has an id of schoolsflip22
            case R.id.schoolsflip22:
//it will display this level
                setContentView(R.layout.school22);
                break;
                //if the button is pushed and has an id of schoolflip22
            case R.id.schoolflip22:
//it will display this level
                setContentView(R.layout.schools22);
                break;
                //if the button is pushed and has an id of schoolsNext22
            case R.id.schoolsNext22:
                //if the button is pushed and has an id of schoolNext22
            case R.id.schoolNext22:
                //if the button is pushed and has an id of schoolsflip23
            case R.id.schoolsflip23:
//it will display this level
                setContentView(R.layout.school23);
                break;
                //if the button is pushed and has an id of schoolflip23
            case R.id.schoolflip23:
//it will display this level
                setContentView(R.layout.schools23);
                break;
                //if the button is pushed and has an id of schoolsNext23
            case R.id.schoolsNext23:
                //if the button is pushed and has an id of schoolNext23
            case R.id.schoolNext23:
                //if the button is pushed and has an id of schoolsflip24
            case R.id.schoolsflip24:
//it will display this level
                setContentView(R.layout.school24);
                break;
                //if the button is pushed and has an id of schoolflip24
            case R.id.schoolflip24:
//it will display this level
                setContentView(R.layout.schools24);
                break;
                //if the button is pushed and has an id of schoolsNext24
            case R.id.schoolsNext24:
                //if the button is pushed and has an id of schoolNext24
            case R.id.schoolNext24:
                //if the button is pushed and has an id of schoolsflip25
            case R.id.schoolsflip25:
//it will display this level
                setContentView(R.layout.school25);
                break;
                //if the button is pushed and has an id of schoolflip25
            case R.id.schoolflip25:
//it will display this level
                setContentView(R.layout.schools25);
                break;
                //if the button is pushed and has an id of schoolsNext25
            case R.id.schoolsNext25:
                //if the button is pushed and has an id of schoolNext25
            case R.id.schoolNext25:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl15
            case R.id.hl15:
                //if the button is pushed and has an id of schoolsflip26
            case R.id.schoolsflip26:
//it will display this level
                setContentView(R.layout.school26);
                break;
                //if the button is pushed and has an id of schoolflip26
            case R.id.schoolflip26:
//it will display this level
                setContentView(R.layout.schools26);
                break;
                //if the button is pushed and has an id of schoolsNext26
            case R.id.schoolsNext26:
                //if the button is pushed and has an id of schoolNext26
            case R.id.schoolNext26:
                //if the button is pushed and has an id of schoolsflip27
            case R.id.schoolsflip27:
//it will display this level
                setContentView(R.layout.school27);
                break;
                //if the button is pushed and has an id of schoolflip27
            case R.id.schoolflip27:
//it will display this level
                setContentView(R.layout.schools27);
                break;
                //if the button is pushed and has an id of schoolNext27
            case R.id.schoolsNext27:
                //if the button is pushed and has an id of schoolNext27
            case R.id.schoolNext27:
                //if the button is pushed and has an id of schoolsflip28
            case R.id.schoolsflip28:
//it will display this level
                setContentView(R.layout.school28);
                break;
                //if the button is pushed and has an id of schoolflip28
            case R.id.schoolflip28:
//it will display this level
                setContentView(R.layout.schools28);
                break;
                //if the button is pushed and has an id of schoolsNext28
            case R.id.schoolsNext28:
                //if the button is pushed and has an id of schoolNext28
            case R.id.schoolNext28:
//it will display this level
                setContentView(R.layout.hard_levels);
                break;
                //if the button is pushed and has an id of hl16
            case R.id.hl16:
                //if the button is pushed and has an id of schoolsflip29
            case R.id.schoolsflip29:
//it will display this level
                setContentView(R.layout.school29);
                break;
                //if the button is pushed and has an id of schoolflip29
            case R.id.schoolflip29:
//it will display this level
                setContentView(R.layout.schools29);
                break;
                //if the button is pushed and has an id of schoolsNext29
            case R.id.schoolsNext29:
                //if the button is pushed and has an id of schoolNext29
            case R.id.schoolNext29:
                //if the button is pushed and has an id of schoolsflip30
            case R.id.schoolsflip30:
//it will display this level
                setContentView(R.layout.school30);
                break;
                //if the button is pushed and has an id of schoolflip30
            case R.id.schoolflip30:
//it will display this level
                setContentView(R.layout.schools30);
                break;
                //if the button is pushed and has an id of schoolsNext30
            case R.id.schoolsNext30:
                //if the button is pushed and has an id of schoolNext30
            case R.id.schoolNext30:
                //if the button is pushed and has an id of schoolsflip31
            case R.id.schoolsflip31:
//it will display this level
                setContentView(R.layout.school31);
                break;
                //if the button is pushed and has an id of schoolflip31
            case R.id.schoolflip31:
//it will display this level
                setContentView(R.layout.schools31);
                break;
                //if the button is pushed and has an id of schoolsNext31
            case R.id.schoolsNext31:
                //if the button is pushed and has an id of schoolNext31
            case R.id.schoolNext31:
                //if the button is pushed and has an id of schoolsflip32
            case R.id.schoolsflip32:
//it will display this level
                setContentView(R.layout.school32);
                break;
                //if the button is pushed and has an id of schoolflip32
            case R.id.schoolflip32:
//it will display this level
                setContentView(R.layout.schools32);
                break;
                //if the button is pushed and has an id of schoolsNext32
            case R.id.schoolsNext32:
                //if the button is pushed and has an id of schoolNext32
            case R.id.schoolNext32:
//it will display this level
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
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Red(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.red);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Blue(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.blue);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Green(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.green);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Brown(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.brown);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void White(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.white);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Black(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.black);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Grey(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.grey);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Orange(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.orange);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Yellow(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.yellow);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Purple(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.purple);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void One(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.one);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Zero(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.zero);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Two(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.two);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Three(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.three);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Four(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.four);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Five(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.five);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Six(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.six);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Seven(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seven);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Eight(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.eight);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nine(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.nine);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();//plays mp3 sound
            }
        });
        midiFileMediaPlayer.start();
    }
    public void Ten(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ten);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Eleven(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.eleven);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Twelve(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.twelve);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Thirteen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.thirteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fourteen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fourteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fifteen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fifteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sixteen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sixteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Seventeen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seventeen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Eighteen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.eighteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nineteen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.nineteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Twenty(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.twenty);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Monday(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.monday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tuedsay(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.tuesday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Wendsday(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.wensday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Thursday(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.thursday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Friday(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.friday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Saturday(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.saturday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sunday(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sunday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void January(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.january);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void February(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.february);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void March(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.march);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void April(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.april);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void May(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.may);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void June(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.june);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void July(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.july);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void August(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.august);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void September(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.september);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void October(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.october);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void November(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.november);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void December(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.december);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Good_Morning(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.goodmorning);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Good_Afternoon(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.goodafternoon);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Good_Evening(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nice_Day(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.niceday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hello(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.hello);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Goodbye(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.goodbye);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void See_You_Later(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seeyoulater);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void He(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.he);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void She(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.she);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void I(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.i);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Them(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.them);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void My(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.my);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Name(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.name);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Have(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.have);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Need(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.need);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fun(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fun);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Morning(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.morning);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Night(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.night);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void How(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.how);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Are(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.are);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void You(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.you);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Old(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.old);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Young(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.young);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Thanks(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.thankyou);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Welcome(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.youarewelcome);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Math(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.math);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void History(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.history);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Science(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.science);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void German(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.german);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Spanish(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.spanish);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void English(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.english);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Music(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.music);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gym(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.gym);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Art(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.art);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Seminary(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seminary);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Principal(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.principal);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Assistant_Principal(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.assistantprincipal);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Teacher(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.librarian);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Librain(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.teacher);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cook(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.cook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Custodian(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.custodian);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Student(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.student);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nurse(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.nurse);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Counselor(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.counselor);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Secretary(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.secretary);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pen(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.pen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pencil(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.pencil);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Eraser(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.eraser);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Calculator(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.calculator);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Table(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.table);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Desk(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.desk);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Chair(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.chair);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Computer(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.computer);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Backpack(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.backpack);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Notebook(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.notebook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Textbook(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.textbook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Reading_Book(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.readingbook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void American_Football(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.americanfootball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Baseball(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.baseball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Volleyball(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.volleyball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tennis(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.tennis);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Table_Tennis(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.tabletennis);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bowling(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.bowling);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sailing(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sailing);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Boxing(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.boxing);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fishing(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fishing);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gymnastics(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.gymnastics);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Rollerskate(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.rollerskate);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ice_Skate(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.iceskate);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ski(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ski);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Lift_Weights(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.liftweights4);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Crafts(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.crafts);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Draw(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.draw);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Climb(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.climb);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Photography(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.photography);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hike(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.hike);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Camping(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.camping);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gardening(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.gardening);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Friends(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.friends);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ride_A_Bike(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.rideabike4);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Go_To_The_Movies(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.gotothemovies);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Watch_Movies(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.watchmovies);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Watch_Television(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.watchtelevision);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dance(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.dance);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Travel(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.travel);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Drive(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.drive);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Run(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.run);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Walk(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.walk);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Parent(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.parents);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mother(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.mother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Father(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.father);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Siblings(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.siblings);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Brother(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.brother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sister(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sister);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Daughter(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.daughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Son(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.son);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Grandparents(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.grandparents);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Grandmother(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.grandmother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Grandfather(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.grandfather);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Aunt(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.aunt);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Uncle(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.uncle);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Female_Cousin(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.femalecousin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Male_Cousin(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.malecousin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Teenager(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.teenager);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Wife(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.wife);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Husband(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.husband);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Great_Grandparent(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.greatgrandparents);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Great_Grandma(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.greatgrandma);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Great_Grandpa(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.greatgrandpa);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Grandson(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.grandson);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Granddaughter(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.granddaughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Niece(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.neice);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nephew(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.nephew);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Stepmother(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stepmother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Stepfather(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stepfather);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Stepdaughter(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stepdaughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Stepson(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stepson);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Stepbrother(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stepbrother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Stepsister(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stepsister);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Child(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.child);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Baby(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.baby);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Girl(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.girl);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Boy(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.boy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Twins(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.twins);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Only_Child(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.onlychild);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Adoptive_Child(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.adoptivechild);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Firstborn(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.firstborn);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Minor(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.minor);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void LegalAge(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.legalage);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Single(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.single);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Married(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.married);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Divorced(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.divorced);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Giraffe(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.giraffe);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Elephant(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dog(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.dog);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cat(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.cat);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fish(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fish);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pig(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.pig);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cow(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.cow);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Donkey(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.donkey);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Horse(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.horse);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();//plays mp3 sound
            }
        });
        midiFileMediaPlayer.start();
    }
    public void Penguin(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.penguin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Monkey(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.monkey);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bird(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.birds);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bear(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.bear);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Snake(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snake);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Shark(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shark);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dolphin(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.dolphin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Lion(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.lion);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tiger(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.tiger);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cheetah(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.cheetah);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bee(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.bee);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ant(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ant);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Alligator(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.alligator);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Excuseme(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.excuseme);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Please(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.please);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void What(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.what);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Yes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.yes);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void No(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.no);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Happy(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.happy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sad(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sad);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Disappointed(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.disappointed);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Annoyed(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.annoyed);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tired(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.tired);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Surprised(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.surprised);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mad(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.mad);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hungry(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.hungry);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bored(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.bored);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Panther(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.panther);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Angry(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.angry);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tall(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.tall);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Short(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.nottall);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Large(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.large);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Small(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.small);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fast(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fast);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Slow(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slow);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Beautiful(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.beautiful);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ugly(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ugly);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Skinny(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.skinny);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fat(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.fat);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Athletic(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.athletic);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Lazy(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.lazy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hard_Working(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.hardworking);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();//plays mp3 sound
            }
        });
        midiFileMediaPlayer.start();
    }
    public void Smart(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smart);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dumb(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.dumb);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Redhair(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.redhaired);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Brunette(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.brunette);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Blonde(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.blonde);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Glasses(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.glasses);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Brown_eyes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.browneyes);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Blue_eyes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.blueeyes);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Blonde_hair(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.blondehair);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bald(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.bald);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Basketball(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.basketball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Soccer(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.soccer);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Excited(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.excited);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pink2(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.rosa);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Rojo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.rojo);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Azul(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.azul);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Verde(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.verde);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cafe(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.cafe);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Blanco(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.blanco);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void negro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.negro);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void gris(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.gris);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Naranja(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.naranja);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void amarillo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.amarillo);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();//plays mp3 sound
            }
        });
        midiFileMediaPlayer.start();
    }
    public void morado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.morado);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }

    public void Lunes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smonday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Martes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stuesday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Miercoles(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.swednesday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Jueves(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sthursday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Viernes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfriday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sabado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssaturday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Domingo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssunday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cero(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.szero);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Uno(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sone);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stwo);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tres(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sthree);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cuatro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfour);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cinco(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfive);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Seis(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssix);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Siete(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sseven);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ocho(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seight);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nueve(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snine);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Diez(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sten);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Once(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seleven);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Donce(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stwelve);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Trece(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sthirteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Catorce(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfourteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Quince(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfifteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dieciseis(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssixteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dieciisiete(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssenventeen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dieciocho(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seighteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Diecinueve(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snineteen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Veinte(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stwenty);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Enero(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sjanuary);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Febrero(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfebruary);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Marzo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smarch);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Abril(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sapril);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mayo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smay);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Junio(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sjune);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Julio(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sjuly);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Agosto(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.saugust);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Septiembre(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sseptember);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Octubre(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.soctober);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Noviembre(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snovember);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Diciembre(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdecember);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Buenosdias(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgoodmorning);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Buenastardes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgoodafternoon);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Buenasnoches(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgoodevening);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Buendia(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sniceday);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hola(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shello);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Adios(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgoodbye);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nosvemos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sseeyoulater);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void El(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smale);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ella(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sshe);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Yo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.si);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ellos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sthey);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mi(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nombre(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sname);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tengo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shave);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Necesito(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sneed);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Divertido(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfun);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Manana(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smorning);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Noche(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snight);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tarde(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.safternoon);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Como(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.show);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Estas(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sare);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tu(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.syou);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Viejo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sold);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Joven(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.syoung);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gracias(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sthankyou);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Denada(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.syourwelcome);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Disculpa(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sexcuseme);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Porfavor(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.splease);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Que(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.swhat);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Si(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.syes);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Noo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sno);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Feliz(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shappy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Triste(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssad);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();
    }
    public void Decepcion(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdisappointed);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Enojado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sannoyed);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cansado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stired);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Emocioado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sexcited);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sorprendido(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssurprised);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Enfadadoo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smad);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Enfadado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sangry);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hambriento(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shungry);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Aburrido(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbored);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }

    //////////////MEDIUM LEVEL//////////////////////

    ///////////////////// LEVEL 1 ////////////////////////////////
    public void Alto(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stall);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Corto(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sshort);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Grande(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slarge);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pequeño(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssmall);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Largo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slong);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Rapido(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfast);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Lento(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sslow);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hermoso(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbeautiful);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Feo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sugly);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Delgado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sskinny);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gordo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfat);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Atletico(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sathletic);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Flojo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slazy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Trabajador(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shardworking);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Inteligente(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssmart);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tonto(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdumb);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pelirrojo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sredhaired);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Morena(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbrunette);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Rubia(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sblonde);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Lentes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sglasses);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void OjosCafes(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbrowneyes);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void OjosAzules(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sblueeyes);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void CabelloRubio(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sblondehair);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pelon(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbald);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }

    ////// LEVEL 2////////////////

    public void Baloncesto(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbasketball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Futbol(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssoccer);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void FutbolAmericano(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfootball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Beisbol(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbaseball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Voleibol(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.svolleyball);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tenis(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stennis);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void PingPong(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stabletennis);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bolos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbowling);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Navegacion(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssailing);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Boxeo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sboxing);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pesca(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfishing);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gimnasia(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgymnastics);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Patinar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.srollerskate);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void PatinajeDeHielo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.siceskate);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Esqui(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sski);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void LevantamientoDePesas(View view) {
        mediaPlayer = new MediaPlayer();
        //missing audio
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sliftweights);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Musica(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smusic);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Artesanias(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scrafts);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Dibujo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdraw);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Escalar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sclimb);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Fotografia(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sphotography);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Caminata(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shike);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Acampar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scamping);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Jardineria(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgardening);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Amigos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfriends);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void AndarEnBicicleta(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.srideabike);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void IrAlCine(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgotothemovies);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void VerPeliculas(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.swatchmovies);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void VerLaTelevision(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.swatchtelevision);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bailar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdance);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Viajar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stravel);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Manejar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdrive);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Correr(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.srun);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Caminar(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.swalk);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    /////////// LEVEL 3 /////////////
    public void Jirafa(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgiraffe);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Elefante(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.selephant);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Perro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdog);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gato(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scat);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pez(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfish);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cerdo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.spig);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Vaca(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scow);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Burro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdonkey);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Caballo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shorse);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pinguino(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.spenguin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mono(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smonkey);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pajaro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbird);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Oso(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbear);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Serpiente(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssnake);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tiburon(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sshark);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Delfin(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdolphin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Leon(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slion);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tigre(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stiger);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Guepardo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scheetah);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pantera(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.spanther);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Abeja(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbee);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hormiga(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sant);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cocodrilo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.salligator);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }

    //////////////////////// LEVEL 4 //////////////////////////////////////////
    public void Padres(View view) {
        mediaPlayer = new MediaPlayer();
        /// mising audio/////
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sparents);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mama(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Papa(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfather);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hermanos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssiblings);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hermano(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbrother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hermana(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssister);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hija(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdaughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hijo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sson);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Abuelos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgrandparents);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Abuela(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgrandmother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Abuelo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgrandfather);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tia(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.saunt);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Tio(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.suncle);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Prima(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfemalecousin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Primo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smalecousin);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Adolescente(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.steenager);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Esposa(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.swife);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Esposo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shusband);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bisaabuelos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgreatgrandparent);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bisabuela(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgreatgrandma);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bisabuelo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgreatgrandpa);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nieto(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgrandson);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nieta(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgranddaughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sobrina(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sniece);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Sobrino(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snephew);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Madrastra(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstepmother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Padrastro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstepfather);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hijastra(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstepdaughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hijastro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstepson);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hermanastro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstepbrother);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Hermanastra(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstepdaughter);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Niño(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.schild);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bebe(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbaby);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nina(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgirl);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Nino(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sboy);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gemelos(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stwins);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void HijoUnico(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sonlychild);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void HijoAdoptivo(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sadoptivechild);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Primogenito(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sfirstborn);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Menor(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sminor);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void EdadLegal(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slegalage);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Soltero(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssingle);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Casado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smarried);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Divorciado(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdivorced);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }

    //////// LEVEL 5 ////////////////////////////////

    public void Matematicas(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.smath);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Historia(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.shistory);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ciencias(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sscience);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Aleman(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgerman);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Español(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sspanish);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Ingles(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.senglish);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Gimnasio(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sgym);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Arte(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sart);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Seminario(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sseminary);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Directora(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sprincipal);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Secretaria(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sassistantprincipal);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Maestra(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.steacher);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Bibliotecaria(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.slibrarian);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cocinero(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Guardian(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scustodian);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Estudiante(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sstudent);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Enfermera(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snurse);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Consejera(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scounselor);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Secretario(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.ssecretary);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Pluma(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.spen);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Lapiz(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.spencil);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Borrador(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.seraser);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Calculadora(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scalculator);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mesa(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stable);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Escritorio(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sdesk);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Silla(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.schair);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Computadora(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.scomputer);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Cuaderno(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.snotebook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Libro(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.stextbook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void Mochila(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sbackpack);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }
    public void LibroDeLectura(View view) {
        mediaPlayer = new MediaPlayer();
        MediaPlayer midiFileMediaPlayer = MediaPlayer.create(this, R.raw.sreadingbook);
        midiFileMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
            }
        });
        midiFileMediaPlayer.start();//plays mp3 sound
    }


}