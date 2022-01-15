package com.example.triangularsquareornot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public boolean isTriangular(int n){
        int sum = 0;
        for(int i = 0; sum <= n; i++){
            sum += i;
            if(sum == n)
                return true;
        }
        return false;
    }
    public boolean isSquare(int n){
        double root = Math.sqrt(n);
        if(root%1 == 0.0){
            return true;
        }
        return false;
    }
    public void check(View view){
        EditText num = (EditText)findViewById(R.id.editTextTextPersonName);
        int n = Integer.parseInt(num.getText().toString());
        String ans = "";
        boolean tri = isTriangular(n);
        boolean sq = isSquare(n);
        if(tri && sq){
            ans += "The number is both triangular and square";
        }else if(tri || sq){
            if(tri){
                ans+="The number is triangular";
            }
            if(sq){
                ans+="The number is perfect square";
            }
        }else{
                ans += "The number is neither one of them";
        }
        TextView res = (TextView)findViewById(R.id.textView4);
        res.setText(ans);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}