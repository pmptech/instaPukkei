package pmp.com.instapukkei.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

import pmp.com.instapukkei.R;
import pmp.com.instapukkei.utils.Constants;
import pmp.com.instapukkei.utils.InstaPukkeiWebClient;

public class ShoppingWebViewActivity extends AppCompatActivity {

    private WebView shoppingWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_web_view);
        String url = getIntent().getStringExtra(Constants.KEY_URL);
        shoppingWebView = (WebView)findViewById(R.id.genericWebView);
        shoppingWebView.setWebViewClient(new InstaPukkeiWebClient(ShoppingWebViewActivity.this));
        WebSettings webSettings = shoppingWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        shoppingWebView.loadUrl(url);
    }
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        // If there is URL history then allowing to go back to those
        if (keyCode == KeyEvent.KEYCODE_BACK && shoppingWebView.canGoBack()) {
            shoppingWebView.goBack();
            return true;
        }
        // If no webview history then restore default behavior
        return super.onKeyDown(keyCode, event);
    }
}
