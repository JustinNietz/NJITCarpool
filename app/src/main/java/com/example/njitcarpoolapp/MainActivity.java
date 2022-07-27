package com.example.njitcarpoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nDriver, nCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        nDriver = (Button) findViewById(R.id.driver);
        nCustomer = (Button) findViewById(R.id.customer);

        nDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
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