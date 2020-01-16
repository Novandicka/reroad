package com.reroad.reroad.fp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.reroad.reroad.fp.api.ClientService;
import com.reroad.reroad.fp.api.RetrofitClient;
import com.reroad.reroad.fp.api.Session;

import org.json.JSONObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    EditText edtEmail;
    EditText edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        btnLogin.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Retrofit retrofit = RetrofitClient.connect();
        ClientService service = retrofit.create(ClientService.class);
        final Call<ResponseBody> request = service.login(
                edtEmail.getText().toString(),
                edtPassword.getText().toString()
        );
        request.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try{
                    String json = response.body().string();
                    Log.e("Response", json);
                    JSONObject obj = new JSONObject(json);
                    int status = obj.getInt("status");
                    if (status == 200) {
                        Toast.makeText(LoginActivity.this,"Login Berhasil", Toast.LENGTH_SHORT).show();
                        JSONObject user = obj.getJSONObject("user");
                        Session.init(LoginActivity.this)
                                .set("id_user", user.getString("id_user"))
                                .set("nama", user.getString("nama"))
                                .set("no_tlp", user.getString("no_tlp"))
                                .set("foto", user.getString("foto"));
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    } else {
                        onFailure(null, null);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (t != null) {
                    t.printStackTrace();
                }
                Toast.makeText(LoginActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onLongClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        return true;
    }
}
