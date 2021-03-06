package com.example.jungjune.mypt.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;

import com.example.jungjune.mypt.Fragment.BestTab.BestTabFragment;
import com.example.jungjune.mypt.Fragment.CustomSearch.CustomSearchFragment;
import com.example.jungjune.mypt.Fragment.MyPage.MyPageTrainerFragment;
import com.example.jungjune.mypt.Fragment.MyPage.MyPageUserFragment;
import com.example.jungjune.mypt.Fragment.SearchCunsumer.SearchCunsumerFragment;
import com.example.jungjune.mypt.Fragment.TrainerMatching.TrainerMatchingFragment;
import com.example.jungjune.mypt.R;
import com.example.jungjune.mypt.Util.TitleBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by triti on 2017-07-19.
 */

public class MainTrainerActivity extends TitleBarActivity {
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;
    MyPageTrainerFragment myPageTabTrainer;
    CustomSearchFragment customSearchFragment;
    BestTabFragment bestTab;
    SearchCunsumerFragment searchCunsumerFragment;
    TrainerMatchingFragment trainerMatchingFragment;

    Button nowBtn;
    @BindView(R.id.search_bar)Button search;
    @BindView(R.id.bestBtn)Button best;
    @BindView(R.id.majchumBtn)Button majchum;
    @BindView(R.id.mypageBtn)Button mypage;
    @BindView(R.id.search_Cunsumer)Button searchCunsumer;

    @OnClick(R.id.bestBtn)
    public void setBest(){
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.contentPanel,bestTab);
        fragmentTransaction.commit();
        changeTab(best);
    }
    @OnClick(R.id.majchumBtn)
    public void setMajchum(){
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.contentPanel,customSearchFragment);
        fragmentTransaction.commit();
        changeTab(majchum);
    }
    @OnClick(R.id.mypageBtn)
    public  void setMypage(){
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.contentPanel,myPageTabTrainer);
        fragmentTransaction.commit();
        changeTab(mypage);
    }

    @OnClick(R.id.search_Cunsumer)
    public  void setSearchCunsumer(){
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.contentPanel,searchCunsumerFragment);
        fragmentTransaction.commit();
        changeTab(searchCunsumer);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trainer);
        ButterKnife.bind(this);

        bestTab= new BestTabFragment();
        myPageTabTrainer = new MyPageTrainerFragment();
        trainerMatchingFragment = new TrainerMatchingFragment();
        customSearchFragment = new CustomSearchFragment();
        searchCunsumerFragment = new SearchCunsumerFragment();

        fm = getSupportFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.contentPanel,bestTab);
        fragmentTransaction.commit();
        nowBtn= best;

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    public void changeTab(Button toBtn){
        nowBtn.setBackground(getDrawable(R.drawable.round_rantangle_white));
        nowBtn.setTextColor(Color.parseColor("#BDBDBD"));
        toBtn.setBackground(getDrawable(R.drawable.round_ractangle_skyblue));
        toBtn.setTextColor(Color.parseColor("#ffffff"));
        nowBtn=toBtn;
    }


}

