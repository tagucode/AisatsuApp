package jp.techacademy.satoshi.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.helloButton -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view, hour, minute ->

                //ログチェック。2桁でゼロパディング
                //Log.d("UI-PARTS", "%02d".format(hour) + ":" + "%02d".format(minute))
                //var nowTime = "%02d".format(hour) + ":" + "%02d".format(minute)

                if ((hour >= 2) && (hour <= 9)) {
                    //時刻あり
                    //helloView.text = "${nowTime}だよ。おはよう"
                    helloView.text = "おはよう"

                } else if ((hour >= 10) && (hour <= 17)) {
                    //時刻あり
                    //helloView.text = "${nowTime}だよ。おはよう"
                    helloView.text = "こんにちは"

                } else {
                    //時刻あり
                    //helloView.text = "${nowTime}だよ。おはよう"
                    helloView.text = "こんばんわ"
                }
            },
            13,0,true)
        timePickerDialog.show()
    }

}
