package com.mj7addadcoder.alwiqayah;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;
import java.util.Vector;

public class OneActivity extends AppCompatActivity
    implements BaseSliderView.OnSliderClickListener,
    ViewPagerEx.OnPageChangeListener{


    private SliderLayout imageSlider;
    Vector<Pair<String,Integer>> file_maps = new Vector<Pair<String, Integer>>();

    private void prepareHashMap(int num){

        if(num==1) {

            file_maps.removeAllElements();
            file_maps.add(new Pair("1 of 4", R.drawable.ic_app1));
            file_maps.add(new Pair("2 of 4", R.drawable.ic_app2));
            file_maps.add(new Pair("3 of 4", R.drawable.ic_app3));
            file_maps.add(new Pair("4 of 4", R.drawable.ic_app4));
        }



      else if(num==2) {

            file_maps.removeAllElements();
            file_maps.add(new Pair("1 of 4", R.drawable.ic_app5));
            file_maps.add(new Pair("2 of 4", R.drawable.ic_app6));
            file_maps.add(new Pair("3 of 4", R.drawable.ic_app7));
            file_maps.add(new Pair("4 of 4", R.drawable.ic_app8));
        }
        /*
      else if(num==3){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==4){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==5){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==6){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==7){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==8){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==9){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==10){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==11){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==12){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==13){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
      else if(num==14){
          file_maps.put("1 of 4",R.drawable.ic_app5);
          file_maps.put("2 of 4",R.drawable.ic_app6);
          file_maps.put("3 of 4",R.drawable.ic_app7);
          file_maps.put("4 of 4", R.drawable.ic_app8);
      }
*/
    }

    private void fillSlider(){
        for (int i=0;i<file_maps.size();i++){
           String name = file_maps.get(i).first;
           TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(i).second)
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putString("extra",name);

            imageSlider.addSlider(textSliderView);
        }

    }

    private void contorlSlider(){
        imageSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        imageSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        imageSlider.stopAutoCycle();

      //  imageSlider.setCustomAnimation(new DescriptionAnimation());
        imageSlider.addOnPageChangeListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        imageSlider = (SliderLayout) findViewById(R.id.slider);
        int num = this.getIntent().getIntExtra("num",0);
        prepareHashMap(num);
        fillSlider();
        contorlSlider();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
            //     Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
            //   Log.e("Slider Demo", "Page Changed: " + position);
    }

        @Override
        public void onPageScrollStateChanged(int state) {}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_one, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
}
