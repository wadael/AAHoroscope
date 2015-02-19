package org.wadael.aahoro;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import org.wadael.aahoro.R;

import android.app.Activity;
import android.widget.TextView;




@EActivity(R.layout.prevision_layout)
public class PrevisionActivity extends Activity {

	@Extra
	String quelSigne;

	@ViewById
	TextView texte_prevision;

	@ViewById
	TextView texte_signe;

	@AfterViews
	public void majTexte() {
		int lequel = (int) (Math.random() * 11);
		String clef = "prevision" + lequel;
		String quoi = getStringResourceByName(clef);
		texte_prevision.setText(quoi);
		clef = "signe" + quelSigne;
		quoi = getStringResourceByName(clef);
		texte_signe.setText("Votre signe: " + quoi);
	}
	
	private String getStringResourceByName(String aString) {
		String packageName = getPackageName();
		int resId = getResources().getIdentifier(aString, "string", packageName);
			if (resId == 0)
				return aString;
			else
				return getString(resId);
	}

}
