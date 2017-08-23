package pmp.com.instapukkei.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * This class to create object of <i>WebClientView</i><br />
 * Created by mgohain on 8/20/2017.
 */
public class InstaPukkeiWebClient extends WebViewClient {
    private ProgressDialog progressDialog;
    private Activity activityContext;
    public InstaPukkeiWebClient(Activity context) {
        this.activityContext = context;
    }
    //This will make the URL load in the webView
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    //To show progress bar
    @Override
    public void onLoadResource(WebView view, String url) {
        activityContext.setTitle(url);
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(activityContext);
            progressDialog.setMessage("Loading...");
            progressDialog.show();
        }
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }
}
