package com.example.thursdayproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var mAnswer : TextView
    lateinit var mFnum : EditText
    lateinit var mSnum : EditText
    lateinit var mAdd : Button
    lateinit var mSubtract : Button
    lateinit var mMultiply : Button
    lateinit var mDivide : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEditFnum)
        mSnum = findViewById(R.id.mEditSnum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSubtract = findViewById(R.id.mBtnSub)
        mMultiply = findViewById(R.id.mBtnMul)
        mDivide = findViewById(R.id.mBtnDiv)


        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if(firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                //Proceed to compute the number
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mSubtract.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if(firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                //Proceed to compute the number
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mMultiply.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if(firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                //Proceed to compute the number
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mDivide.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if(firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                //Proceed to compute the number
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }

        }

    }
}