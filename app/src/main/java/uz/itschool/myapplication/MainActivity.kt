package uz.itschool.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var imgArray: MutableList<Int> = mutableListOf()
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgArray.add(R.drawable.img1)
        imgArray.add(R.drawable.img2)
        imgArray.add(R.drawable.img3)
        imgArray.add(R.drawable.img4)
        imgArray.add(R.drawable.img5)
        imgArray.add(R.drawable.img6)

        img1.setOnClickListener{
            img10.visibility = View.VISIBLE
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }

        img2.setOnClickListener{
            img20.visibility = View.VISIBLE
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }
        img3.setOnClickListener{
            img30.visibility = View.VISIBLE
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }
        img4.setOnClickListener{
            img40.visibility = View.VISIBLE
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }
        img5.setOnClickListener{
            img50.visibility = View.VISIBLE
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }
        img6.setOnClickListener{
            img60.visibility = View.VISIBLE
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }


        btn1.setOnClickListener{
            if (index > 0){
                index--
                img10.setImageResource(imgArray[index])
            } else{
                index = imgArray.size - 1
                img10.setImageResource(imgArray[index])
                index--
            }
        }


        btn2.setOnClickListener{
            if (index < imgArray.size){
                img10.setImageResource(imgArray[index++])
            } else{
                index = 0
                img10.setImageResource(imgArray[index++])
            }
        }







//        tv1.setOnClickListener{
//            if (index > 0){
//                index--
//                img1.setImageResource(imgArray[index])
//            } else{
//                index = imgArray.size - 1
//                img1.setImageResource(imgArray[index])
//                index--
//            }
//        }
//
//
//        tv2.setOnClickListener{
//            if (index < imgArray.size){
//                img1.setImageResource(imgArray[index++])
//            } else{
//                index = 0
//                img1.setImageResource(imgArray[index++])
//            }
//        }


//        button1.setOnClickListener{
//            img1.visibility = View.VISIBLE
//        }
//
//        button2.setOnClickListener{
//            img1.visibility = View.INVISIBLE
//        }
//
//        button3.setOnClickListener{
//            img1.visibility = View.GONE
//        }

    }
}