package com.example.maytinhbotuitest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat
import java.util.regex.Pattern

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var tvNhap: TextView? = null
    private var tvKetQua: TextView? = null

    private var btnDeleteAll: Button? = null
    private var btnDelete: Button? = null
    private var btnNumber0: Button? = null
    private var btnNumber1: Button? = null
    private var btnNumber2: Button? = null
    private var btnNumber3: Button? = null
    private var btnNumber4: Button? = null
    private var btnNumber5: Button? = null
    private var btnNumber6: Button? = null
    private var btnNumber7: Button? = null
    private var btnNumber8: Button? = null
    private var btnNumber9: Button? = null

    private var btnCong: Button? = null
    private var btnTru: Button? = null
    private var btnNhan: Button? = null
    private var btnChia: Button? = null
    private var btnThapPhan: Button? = null

    private var btnKetQua: Button? = null

    private var arrOperation: ArrayList<String>? = null
    private var arrNumber: ArrayList<Double>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButton()
        initButtonClick()
    }

    fun initButton() {
        tvNhap = findViewById(R.id.tvNhap)
        tvKetQua = findViewById(R.id.tvKetQua)

        btnDeleteAll = findViewById(R.id.btnDeleteAll)
        btnDelete = findViewById(R.id.btnDelete)

        btnNumber0 = findViewById(R.id.btn0)
        btnNumber1 = findViewById(R.id.btn1)
        btnNumber2 = findViewById(R.id.btn2)
        btnNumber3 = findViewById(R.id.btn3)
        btnNumber4 = findViewById(R.id.btn4)
        btnNumber5 = findViewById(R.id.btn5)
        btnNumber6 = findViewById(R.id.btn6)
        btnNumber7 = findViewById(R.id.btn7)
        btnNumber8 = findViewById(R.id.btn8)
        btnNumber9 = findViewById(R.id.btn9)

        btnCong = findViewById(R.id.btnCong)
        btnTru = findViewById(R.id.btnTru)
        btnNhan = findViewById(R.id.btnNhan)
        btnChia = findViewById(R.id.btnChia)
        btnThapPhan = findViewById(R.id.btnThapPhan)

        btnKetQua = findViewById(R.id.btnKetQua)

    }

    private fun initButtonClick() {
        btnNumber0!!.setOnClickListener(this)
        btnNumber1!!.setOnClickListener(this)
        btnNumber2!!.setOnClickListener(this)
        btnNumber3!!.setOnClickListener(this)
        btnNumber4!!.setOnClickListener(this)
        btnNumber5!!.setOnClickListener(this)
        btnNumber6!!.setOnClickListener(this)
        btnNumber7!!.setOnClickListener(this)
        btnNumber8!!.setOnClickListener(this)
        btnNumber9!!.setOnClickListener(this)
        btnCong!!.setOnClickListener(this)
        btnTru!!.setOnClickListener(this)
        btnNhan!!.setOnClickListener(this)
        btnChia!!.setOnClickListener(this)
        btnThapPhan!!.setOnClickListener(this)
        btnDelete!!.setOnClickListener(this)
        btnDeleteAll!!.setOnClickListener(this)
        btnKetQua!!.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.btn0 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "0")
            }
            R.id.btn1 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "1")
            }
            R.id.btn2 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "2")
            }
            R.id.btn3 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "3")
            }
            R.id.btn4 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "4")
            }
            R.id.btn5 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "5")
            }
            R.id.btn6 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "6")
            }
            R.id.btn7 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "7")
            }
            R.id.btn8 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "8")
            }
            R.id.btn9 -> {
                tvNhap!!.setText(tvNhap!!.getText().toString() + "9")
            }


            R.id.btnTru -> {
                if (tvKetQua!!.getText() !== "0" && tvNhap!!.getText() === "") {
                    tvNhap!!.setText(tvKetQua!!.getText().toString() + "-")
                }
                if (tvNhap!!.getText().length == 0) tvNhap!!.setText(
                    tvNhap!!.getText().toString() + "-"
                ) else if (Character.isDigit(
                        tvNhap!!.getText().get(tvNhap!!.getText().length - 1)
                    ) || tvNhap!!.getText()
                        .get(tvNhap!!.getText().length - 1) == '/' || tvNhap!!.getText()
                        .get(tvNhap!!.getText().length - 1) == 'x'
                ) tvNhap!!.setText(tvNhap!!.getText().toString() + "-")
            }
            R.id.btnCong -> {
                if (tvNhap!!.getText().length > 0) if (Character.isDigit(
                        tvNhap!!.getText().get(tvNhap!!.getText().length - 1)
                    )
                ) tvNhap!!.setText(tvNhap!!.getText().toString() + "+")
                if (tvKetQua!!.getText() !== "0" && tvNhap!!.getText() === "") {
                    tvNhap!!.setText(tvKetQua!!.getText().toString() + "+")
                }
            }

            R.id.btnNhan -> {
                if (tvNhap!!.getText().length > 0) if (Character.isDigit(
                        tvNhap!!.getText().get(tvNhap!!.getText().length - 1)
                    )
                ) tvNhap!!.setText(tvNhap!!.getText().toString() + "x")
                if (tvKetQua!!.getText() !== "0" && tvNhap!!.getText() === "") {
                    tvNhap!!.setText(tvKetQua!!.getText().toString() + "x")
                }
            }

            R.id.btnChia -> {
                if (tvNhap!!.getText().length > 0) if (Character.isDigit(
                        tvNhap!!.getText().get(tvNhap!!.getText().length - 1)
                    )
                ) tvNhap!!.setText(tvNhap!!.getText().toString() + "/")
                if (tvKetQua!!.getText() !== "0" && tvNhap!!.getText() === "") {
                    tvNhap!!.setText(tvKetQua!!.getText().toString() + "/")
                }
            }

            R.id.btnDelete -> {
                val str: StringBuffer = StringBuffer(tvNhap!!.getText())
                if (str.length > 0) {
                    str.deleteCharAt(str.length - 1)
                    tvNhap!!.setText(str)
                    if (str.length > 0)
                        Result()
                    else tvKetQua!!.setText("0")
                }
            }

            R.id.btnDeleteAll -> {
                tvNhap!!.setText("")
                tvKetQua!!.setText("0")
            }

            R.id.btnKetQua -> {
                if (tvNhap!!.getText().length > 1)
                    Result()
                tvNhap!!.setText("")
            }
            R.id.btnThapPhan -> {
                if (tvNhap!!.getText().length > 0) if (Character.isDigit(
                        tvNhap!!.getText().get(tvNhap!!.getText().length - 1)
                    )
                ) tvNhap!!.setText(tvNhap!!.getText().toString() + ".")

            }
        }
    }

    fun addOperation(input: String): Int {
        arrOperation = ArrayList<String>()
        addNumber(input)
        if (input[0] == '-') arrNumber!!.set(0, -arrNumber!!.get(0))
        val cArray = input.toCharArray()
        var i = 1
        while (i < cArray.size) {
            when (cArray[i]) {
                '+' -> arrOperation!!.add(cArray[i].toString() + "")
                '-' -> arrOperation!!.add(cArray[i].toString() + "")
                'x' -> {
                    arrOperation!!.add(cArray[i].toString() + "")
                    if (i < cArray.size - 1) if (cArray[i + 1] == '-' && i + 1 < cArray.size - 1) {
                        arrNumber!!.set(arrOperation!!.size, -arrNumber!!.get(arrOperation!!.size))
                        i++
                    }
                }
                '/' -> {
                    arrOperation!!.add(cArray[i].toString() + "")
                    if (i < cArray.size - 1) if (cArray[i + 1] == '-' && i + 1 < cArray.size - 1) {
                        arrNumber!!.set(arrOperation!!.size, -arrNumber!!.get(arrOperation!!.size))
                        i++
                    }
                }
                else -> {}
            }
            i++
        }
        return 0
    }

    fun addNumber(stringInput: String?) {
        arrNumber = ArrayList<Double>()
        val regex = Pattern.compile("(\\d+(?:\\.\\d+)?)")
        val matcher = regex.matcher(stringInput)
        while (matcher.find()) {
            arrNumber!!.add(java.lang.Double.valueOf(matcher.group(1)))
        }
    }

    fun Result() {
        val df = DecimalFormat("###.#######")
        var result = 0.0
        addOperation(tvNhap!!.getText().toString())
        if (arrNumber!!.size == 1) result = arrNumber!!.get(0)
        if (arrOperation!!.size > arrNumber!!.size || arrOperation!!.size < 0) {
            tvKetQua!!.setText("Input error!!")
        } else {
            run {
                var i = 0
                while (i < arrNumber!!.size - 1) {
                    when (arrOperation!!.get(i)) {
                        "x" -> {
                            arrNumber!!.set(i, arrNumber!!.get(i) * arrNumber!!.get(i + 1))
                            arrNumber!!.removeAt(i + 1)
                            arrOperation!!.removeAt(i)
                            i--
                        }
                        "/" -> {
                            arrNumber!!.set(i, arrNumber!!.get(i) / arrNumber!!.get(i + 1))
                            arrNumber!!.removeAt(i + 1)
                            arrOperation!!.removeAt(i)
                            i--
                        }
                        else -> {}
                    }
                    i++
                }
            }
            result = arrNumber!!.get(0)
            for (i in 0 until arrNumber!!.size - 1) {
                when (arrOperation!!.get(i)) {
                    "+" -> result = result + arrNumber!!.get(i + 1)
                    "-" -> result = result - arrNumber!!.get(i + 1)
                    else -> {}
                }
            }
            tvKetQua!!.setText(df.format(result) + "")
        }
    }
}