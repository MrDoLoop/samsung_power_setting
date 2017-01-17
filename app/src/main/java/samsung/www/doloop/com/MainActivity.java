package samsung.www.doloop.com;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String buildModel = Build.MODEL;
        if (buildModel.equalsIgnoreCase("SM-G9300")) {
            ComponentName comp = new ComponentName("com.android.settings",
                    "com.android.settings.Settings$HighPowerApplicationsActivity");
            Intent intent = new Intent();
            intent.setComponent(comp);
            startActivity(intent);
        } else {
            Toast.makeText(this, "不是三星手机", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}
