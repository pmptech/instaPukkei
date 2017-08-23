package pmp.com.instapukkei.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import pmp.com.instapukkei.utils.Constants;
import pmp.com.instapukkei.R;
import pmp.com.instapukkei.utils.InstaPukkeiWebClient;

public class HomepageWebViewActivity extends AppCompatActivity {

    private WebView homepageWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_web_view);

        String url = getIntent().getStringExtra(Constants.KEY_URL);
        homepageWebView = (WebView) findViewById(R.id.genericWebView);
        homepageWebView.setWebViewClient(new InstaPukkeiWebClient(HomepageWebViewActivity.this));
        WebSettings webSettings = homepageWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        homepageWebView.loadUrl(url);
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        // If there is URL history then allowing to go back to those
        if (keyCode == KeyEvent.KEYCODE_BACK && homepageWebView.canGoBack()) {
            homepageWebView.goBack();
            return true;
        }
        // If no webview history then restore default behavior
        return super.onKeyDown(keyCode, event);
    }
}
