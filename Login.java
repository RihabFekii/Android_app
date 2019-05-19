package com.example.asus.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class Login extends AppCompatActivity {

    // ralated to the backend
    private String base_url="https://tiqtoqserver.000webhostapp.com"; // should be changed by the ip address of your computer.
    private String login_url=base_url+"/presenterLogin.php";

    ///LES id ta3 el login.xml

    private EditText EditTextPresentaion, EditTextMail, EditTextPassword ;
    private Button SumbitLoginPres , BtnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //torbet bin el java w xml

        EditTextPassword = (EditText) findViewById(R.id.editTextPassword);
        SumbitLoginPres = (Button) findViewById(R.id.btnLogin);
        EditTextPresentaion = (EditText) findViewById(R.id.editTextPresentaion);
        EditTextMail = (EditText) findViewById(R.id.editTextMail);
       /* BtnSignup = (Button) findViewById(R.id.btnSignup);



        BtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), Signup.class);
                startActivity(k);
            }
        });*/



        SumbitLoginPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editTextEmail = EditTextMail.getText().toString().trim();
                String editTextPresentation = EditTextPresentaion.getText().toString().trim();
                String editTextPassword = EditTextPassword.getText().toString().trim();



                if (TextUtils.isEmpty(editTextEmail)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(editTextPresentation)) {
                    Toast.makeText(getApplicationContext(), "Enter you presentation title!", Toast.LENGTH_SHORT).show();
                    return;
                }


                if (TextUtils.isEmpty(editTextPassword)) {
                    Toast.makeText(getApplicationContext(), "Enter the password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // if all the data is entered thene send the request to the back-end

                /* Instantiate the RequestQueue.
                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                String url =login_url+"?email="+editTextEmail+"&password="+editTextEmail+"&pres_name="+editTextPresentation;
                // Request a string response from the provided URL.
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Parse the answer
                                try {
                                    JSONObject responseJson = new JSONObject(response);
                                    String status= responseJson.getString("status");
                                    if(status.equals("error")){
                                        String message = responseJson.getString("message");
                                        Toast.makeText(getApplicationContext(), status +" : "+message, Toast.LENGTH_LONG).show();
                                    }
                                    if(status.equals("success")){
                                        String voucher = responseJson.getString("voucher");
                                        Toast.makeText(getApplicationContext(), status +" \n voucher : "+voucher, Toast.LENGTH_LONG).show();
                                        // todo : redirect to another activity :  The activity that shows the presenter all the questions and feedback
                                        SumbitLoginPres.setOnClickListener( new View.OnClickListener() {
                                            public void onClick(View v) {
                                                Intent k = new Intent(Login.this, OptionQuestionVoteActivity.class);
                                                startActivity(k);
                                            }
                                        });
                                    }

                                } catch (JSONException e) {
                                    e.printStackTrace();
                                    Toast.makeText(getApplicationContext(),"nope", Toast.LENGTH_LONG).show();

                                }
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "The request does not work !", Toast.LENGTH_LONG).show();
                    }
                });

                // Add the request to the RequestQueue.
                queue.add(stringRequest); */

                SumbitLoginPres.setOnClickListener( new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent k = new Intent(Login.this, getvoucher.class);
                        startActivity(k);
                        Toast.makeText(getApplicationContext(), "Login is successful!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }


}

