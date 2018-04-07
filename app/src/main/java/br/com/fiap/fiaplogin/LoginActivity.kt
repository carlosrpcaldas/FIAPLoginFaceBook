package br.com.fiap.fiaplogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.facebook.CallbackManager

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.FacebookCallback
import java.util.Arrays.asList
import com.facebook.login.widget.LoginButton
import kotlinx.android.synthetic.main.activity_login.*
import java.util.*
import com.facebook.login.LoginManager




class LoginActivity : AppCompatActivity() {

    lateinit var callbackManager : CallbackManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        FacebookSdk.sdkInitialize(getApplicationContext());



        callbackManager = CallbackManager.Factory.create()

        LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(loginResult: LoginResult) {
                        // App code
                    }

                    override fun onCancel() {
                        // App code
                    }

                    override fun onError(exception: FacebookException) {
                        // App code
                    }
                }
        )
    }
}
