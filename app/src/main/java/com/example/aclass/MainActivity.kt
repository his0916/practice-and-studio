package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1. 생성자가 없는 클래스 호출
        kotlin()

        //2.클래스의 생성자 사용
        KotlinTwo("안녕")

        //3.클래스의 프로퍼치와 메서드 사용하기
        var Kotlin = KotlinThree()
        //메서드를 먼저 출력합니다.
        Kotlin.printOne()
        //프로터치에 값을 넣고 출력합니다.
        Kotlin.one = "Hello"
        Kotlin.printOne()

        //컴페니언 오브젝트 사용하기 : 자세히 보면 첫 글자가 대문자 입니다.
        KotlinFour.printOne()
        KotlinFour.one = "Hello"


        //5.데이터 클래스 사용하기
        var dataUser = DataUser("Michael" , 21)
        var newUser = dataUser.copy()
        newUser.name = "Jane"
        Log.d("class","원본 dataUser는 ${dataUser.toString()}")
        Log.d("class", " 복사된 newUser는 ${newUser.toString()}")
    }
}
    //파라메터가 없는 클래스
    class kotlin() {
        init{
            Log.d("class", "kotlin 클래스 생성됨")
        }
    }
    //파라메터가 있는 세컨더리 생성자
    class KotlinTwo{
        constructor(value:String){
            Log.d("KotlinTwo", "파라미터 값은 ${value}입니다")
        }
    }
    //properties and method
    class KotlinThree{
        var one: String = "None"
        fun printOne(){
            Log.d("class", "one에 입력된 값은 ${one} 입니다.")
        }
    }

//스테틱 맴버를 갖는 클래스
    class KotlinFour{
        companion object {
        var one: String = "None"
        fun printOne(){
            Log.d("class", "one 에 입력된 값은 ${one}입니다.")
        }
    }
}
//데이터 클래스
    data class DataUser(var name:String, var age:Int)








