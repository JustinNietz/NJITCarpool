package com.example.njitcarpoolapp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.firebase.ui.auth.AuthMethodPickerLayout;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

public class DriverAuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driverauth_activity);
    }











    // All Possibly wrong
//    private final static int LOGIN_REQUEST_CODE = 1234;
//    private List<AuthUI.IdpConfig> providers;
//    private FirebaseAuth firebaseAuth;
//    private FirebaseAuth.AuthStateListener listener;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        init();
//
//    }
//
//    private void init() {
//        providers = Arrays.asList(
//                new AuthUI.IdpConfig.PhoneBuilder().build(),
//                new AuthUI.IdpConfig.GoogleBuilder().build());
//
//        firebaseAuth = FirebaseAuth.getInstance();
//        listener = myFirebaseAuth -> {
//            FirebaseUser user = myFirebaseAuth.getCurrentUser();
//            if(user != null)
//                new SplashScreenActivity();
//            else
//                showLoginLayout();
//        };
//    }
//
//    private void showLoginLayout() {
//        AuthMethodPickerLayout authMethodPickerLayout = new AuthMethodPickerLayout
//                .Builder(R.layout.driverauth_activity)
//                .setPhoneButtonId(R.id.btn_phone_sign_in)
//                .setGoogleButtonId(R.id.btn_google_sign_in)
//                .build();
//
//        startActivityForResult(AuthUI.getInstance()
//                .createSignInIntentBuilder()
//                .setAuthMethodPickerLayout(authMethodPickerLayout)
//                .setIsSmartLockEnabled(false)
//                .setAvailableProviders(providers)
//                .build(), LOGIN_REQUEST_CODE);
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == LOGIN_REQUEST_CODE)
//        {
//            IdpResponse response = IdpResponse.fromResultIntent(data);
//            if(resultCode == RESULT_OK)
//            {
//                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//            }
//            else
//            {
//                Toast.makeText(this, "[ERROR]:  " +response.getError().getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
}