package kr.co.tjoeun.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        xml에 그려둔 clickMe 버튼이 눌렸다는것을 감지하고 싶다.

        clickMeBtn.setOnClickListener {

//        이 중괄호 내부의 코드 => clickMeBtn이 눌리면 실행될 코드
            Log.d("버튼클릭","ClickMe버튼 눌림!")
        }
    }
}