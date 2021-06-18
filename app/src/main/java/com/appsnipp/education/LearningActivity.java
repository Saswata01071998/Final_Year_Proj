
package com.appsnipp.education;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.appsnipp.education.ui.adapter.LearningAdapter;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;

import io.realm.Realm;
import io.realm.RealmResults;

public class LearningActivity extends AppCompatActivity {

    CardStackView cardStackView;
    CardStackLayoutManager cardStackLayoutManager;
    Integer id,image_id;
    ImageView imageView;
    RealmResults<RData> realmResults;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaning_layout);
        Intent intent = getIntent();
        id=intent.getIntExtra("ID",0);
        image_id=intent.getIntExtra("pic",R.drawable.mascotttt);

        imageView=findViewById(R.id.learning_image);
        imageView.setImageDrawable(getDrawable(image_id));

        Realm realm = Realm.getDefaultInstance();
        realmResults=realm.where(RData.class).equalTo("n",id+2).findAll();
        realm.close();

        cardStackView=findViewById(R.id.card_stack);
        cardStackLayoutManager = new CardStackLayoutManager(this, new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {

            }

            @Override
            public void onCardSwiped(Direction direction) {

            }

            @Override
            public void onCardRewound() {

            }

            @Override
            public void onCardCanceled() {

            }

            @Override
            public void onCardAppeared(View view, int position) {

            }

            @Override
            public void onCardDisappeared(View view, int position) {

            }
        });
        cardStackView.setLayoutManager(cardStackLayoutManager);
        cardStackLayoutManager.setStackFrom(StackFrom.BottomAndLeft);
        cardStackLayoutManager.setVisibleCount(3);
        cardStackLayoutManager.setTranslationInterval(8.0f);
        cardStackLayoutManager.setScaleInterval(0.95f);

        LearningAdapter adapter = new LearningAdapter(this,realmResults);
        cardStackView.setAdapter(adapter);

    }

    public void nextPressed(View view) {
        cardStackView.swipe();
    }

    public void previousPressed(View view) {
        cardStackView.rewind();
    }
}
