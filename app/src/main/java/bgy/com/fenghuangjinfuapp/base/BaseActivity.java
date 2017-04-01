package bgy.com.fenghuangjinfuapp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by dennis on 2017-3-30.
 */

public class BaseActivity extends FragmentActivity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onClick(View view) {

    }

}
