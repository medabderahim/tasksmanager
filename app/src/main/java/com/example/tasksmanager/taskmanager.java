package com.example.tasksmanager;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class taskmanager extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_taskmanager);
    final Button task1 = findViewById(R.id.task1);
    final Button task2 = findViewById(R.id.task2);
    final Button task3 = findViewById(R.id.task3);
    final Button task4 = findViewById(R.id.task4);
    final Button task5 = findViewById(R.id.task5);
    final Button task6 = findViewById(R.id.task6);
    final Button task7 = findViewById(R.id.task7);



    task1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task1, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
    task2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task2, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
    task3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task3, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
    task4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task4, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
    task5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task5, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
    task6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task6, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
    task7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(taskmanager.this);
            View dialogView = getLayoutInflater().inflate(R.layout.task7, null);
            builder.setView(dialogView);
            AlertDialog dialog = builder.create();


            dialog.show();
        }
    });
}


}
