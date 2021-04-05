package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.testapp.dto.LoginResultDto;
import com.example.testapp.network.AccountService;
import com.example.testapp.utils.CommonUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        AccountService.getInstance()
//                .getJSONApi()
//                .login(loginDto)
//                .enqueue(new Callback<LoginResultDto>() {
//                    @Override
//                    public void onResponse(Call<LoginResultDto> call, Response<LoginResultDto> response) {
////                        Log.d("super","Ok result good");
//                        CommonUtils.hideLoading();
//                        if(response.isSuccessful())
//                        {
////                            Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
////                            startActivity(intent);
//                        }
//                        else
//                        {
//                            try {
//                                String json = response.errorBody().string();
//                                Log.e("BadRequest", json);
//                            } catch (Exception ex) {
//
//                            }
//
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<LoginResultDto> call, Throwable t) {
//                        Log.e("problem","problem API"+ t.getMessage());
//                        CommonUtils.hideLoading();
//                    }
//                });
    }
}