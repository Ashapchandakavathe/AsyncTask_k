package in.ac.bldeacet.asynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

public class simpleasynctask extends AsyncTask <Void, Void, String> {
    private TextView mTextView;
    public simpleasynctask(TextView tv) {
        mTextView = tv;
    }


    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int n = r.nextInt(11);
        int s = n * 200;
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Awake at last after sleeping for " + s + " milliseconds!";
    }
    protected void onPostExecute(String result) {
        mTextView.setText(result);
    }
}
