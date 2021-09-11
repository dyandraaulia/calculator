package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val judul : TextView = findViewById(R.id.judul)
        val angka_1 : EditText = findViewById(R.id.angka1)
        val btntambah : Button = findViewById(R.id.btn_tambah)
        val btnkurang : Button = findViewById(R.id.btn_kurang)
        val btnkali : Button = findViewById(R.id.btn_kali)
        val btnbagi : Button = findViewById(R.id.btn_bagi)
        val btnmodulus : Button = findViewById(R.id.btn_modulo)
        val btnpangkat : Button = findViewById(R.id.btn_pangkat)
        val angka_2 : EditText = findViewById(R.id.angka2)
        val hitung : Button = findViewById(R.id.btn_hitung)
        val clear : Button = findViewById(R.id.clear_text)
        val hasil : TextView = findViewById(R.id.hasil1)

        btntambah.setOnClickListener{
            btntambah.isEnabled = false
            btnkurang.isEnabled = true
            btnkali.isEnabled = true
            btnbagi.isEnabled = true
            btnmodulus.isEnabled = true
            btnpangkat.isEnabled = true
            hitung.setOnClickListener{
                val angka1: Double = angka_1.getText().toString().toDouble()
                val angka2: Double = angka_2.getText().toString().toDouble()
                val result = angka1 + angka2
                hasil.text = result.toString()
                btntambah.isEnabled = true
            }
            clear.setOnClickListener{
                btntambah.isEnabled = true
                angka_1.setText(" ")
                angka_2.setText(" ")
                hasil.setText(" ")
            }
        }

        btnkurang.setOnClickListener{
            btnkurang.isEnabled = false
            btnkali.isEnabled = true
            btnbagi.isEnabled = true
            btnmodulus.isEnabled = true
            btnpangkat.isEnabled = true
            btntambah.isEnabled = true
            hitung.setOnClickListener{
                val angka1: Double = angka_1.getText().toString().toDouble()
                val angka2: Double = angka_2.getText().toString().toDouble()
                val result = angka1 - angka2
                hasil.text = result.toString()
                btnkurang.isEnabled = true
            }
            clear.setOnClickListener{
                btnkurang.isEnabled = true
                angka_1.setText(" ")
                angka_2.setText(" ")
                hasil.setText(" ")
            }
        }

        btnkali.setOnClickListener{
            btnkali.isEnabled = false
            btnbagi.isEnabled = true
            btnmodulus.isEnabled = true
            btnpangkat.isEnabled = true
            btntambah.isEnabled = true
            btnkurang.isEnabled = true
            hitung.setOnClickListener{
                val angka1: Double = angka_1.getText().toString().toDouble()
                val angka2: Double = angka_2.getText().toString().toDouble()
                val result = angka1 * angka2
                hasil.text = result.toString()
                btnkali.isEnabled = true
            }
            clear.setOnClickListener{
                btnkali.isEnabled = true
                angka_1.setText(" ")
                angka_2.setText(" ")
                hasil.setText(" ")
            }
        }

        btnbagi.setOnClickListener{
            btnbagi.isEnabled = false
            btnmodulus.isEnabled = true
            btnpangkat.isEnabled = true
            btntambah.isEnabled = true
            btnkurang.isEnabled = true
            btnkali.isEnabled = true
            hitung.setOnClickListener{
                val angka1: Double = angka_1.getText().toString().toDouble()
                val angka2: Double = angka_2.getText().toString().toDouble()
                val result = angka1 / angka2
                hasil.text = result.toString()
                btnbagi.isEnabled = true
            }
            clear.setOnClickListener{
                btnbagi.isEnabled = true
                angka_1.setText(" ")
                angka_2.setText(" ")
                hasil.setText(" ")
            }
        }

        btnmodulus.setOnClickListener{
            btnmodulus.isEnabled = false
            btnpangkat.isEnabled = true
            btntambah.isEnabled = true
            btnkurang.isEnabled = true
            btnkali.isEnabled = true
            btnbagi.isEnabled = true
            hitung.setOnClickListener{
                val angka1: Double = angka_1.getText().toString().toDouble()
                val angka2: Double = angka_2.getText().toString().toDouble()
                val result = angka1 % angka2
                hasil.text = result.toString()
                btnmodulus.isEnabled = true
            }
            clear.setOnClickListener{
                btnmodulus.isEnabled = true
                angka_1.setText(" ")
                angka_2.setText(" ")
                hasil.setText(" ")
            }
        }

        btnpangkat.setOnClickListener {
            btnpangkat.isEnabled = false
            btntambah.isEnabled = true
            btnkurang.isEnabled = true
            btnkali.isEnabled = true
            btnbagi.isEnabled = true
            btnmodulus.isEnabled = true
            fun pangkat(): Double {
                var angka1: Double = angka_1.getText().toString().toDouble()
                val angka2: Int = angka_2.getText().toString().toInt()
                var n: Double = 1.0
                for (i in 1..angka2) {
                    n *= angka1
                }
                return n
            }
            hitung.setOnClickListener{
                hasil.text = pangkat().toString()
                btnpangkat.isEnabled = true
            }
            clear.setOnClickListener{
                btnpangkat.isEnabled = true
                angka_1.setText(" ")
                angka_2.setText(" ")
                hasil.setText(" ")
            }
        }
    }
}