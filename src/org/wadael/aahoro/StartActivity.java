package org.wadael.aahoro;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.NoTitle;
import org.wadael.aahoro.PrevisionActivity_;
import org.wadael.aahoro.R;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

@NoTitle
@EActivity(R.layout.start_layout)
public class StartActivity extends Activity{

	public static final String ID_SIGNE = "CLEF_SIGNE";
	
	
	@Click(value={R.id.bs1,R.id.bs2,R.id.bs3,R.id.bs4,R.id.bs5,R.id.bs6,
			R.id.bs7,R.id.bs8,R.id.bs9,R.id.bs10,R.id.bs11,R.id.bs0})
	public void click(View v){
		PrevisionActivity_.intent(this).quelSigne(""
				+(v.getId()-R.id.bs1 +1)).start();
	}
	
}
