package sample.com.excersize;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sample.com.excersize.Fragments.FragmentPager;

public class MainActivity extends AppCompatActivity implements FragmentPager.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFragmentToActivity();
    }

    public void setupFragmentToActivity(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.frmame_id,new FragmentPager()).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
