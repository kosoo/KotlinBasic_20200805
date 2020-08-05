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
            Log.d("버튼클릭", "ClickMe버튼 눌림!")
            Toast.makeText(this, "Click Me 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

        secondBtn.setOnClickListener {
            Log.d("버튼눌림", "두번째 버튼 눌림!!")

//            두번째 버튼도 눌리면 "두번째 버튼눌림!" 문구 짧게 (토스트로) 출력.
            Toast.makeText(this, "두번째 버튼눌림!", Toast.LENGTH_SHORT).show()
        }

//        복사하기 버튼이 눌리면 할일
        copyBtn.setOnClickListener {
//            Edt 에 입력된 내용을 받아와서 (임시 저장)
            val inputMessage = messageEdt.text.toString()
            /*val inputMessage2 = messageEdt.toString().toInt()*/

//            입력한 내용이 5글자가 안된다면, 토스트로 5자이상 입력하라고 안내.
//            5자는 넘지만, 10글자가 안되면 => Log로 10글자 안된다고 출력
//            그외의 상황에서는, 문구로 반영
            if (inputMessage.length < 5) {
                Toast.makeText(this, "5글자 이상으로 입력해주세요", Toast.LENGTH_SHORT).show()
            } else if (inputMessage.length < 10) {
//                5글자는 넘지만 10글자가 안되는 경우
                Log.d("입력글자수", "5글자 이상 10글자 미만")
            } else {
//            Txt에 문구로 반영
                copyResultTxt.text = inputMessage
            }


        }
    }
}