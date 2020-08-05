package kr.co.tjoeun.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        xml에 그려둔 clickMe 버튼이 눌렸다는것을 감지하고 싶다.

        clickMeBtn.setOnClickListener {
//        이 중괄호 내부의 코드 => clickMeBtn이 눌리면 실행될 코드
            Log.d("버튼클릭","ClickMe버튼 눌림!")
            Toast.makeText(this, "Click Me 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

        secondBtn.setOnClickListener {
            Log.d("버튼눌림", "두번째 버튼 눌림!!")

//            두번째 버튼도 눌리면 "두번째 버튼눌림!" 문구 짧게 (토스트로) 출력.
            Toast.makeText(this, "두번째 버튼눌림!", Toast.LENGTH_SHORT).show()
        }
    }
}