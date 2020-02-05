package evan.chen.tutorial.ui.beziercurvesample

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var bitmap: Bitmap? = null
    private var bitmap2: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        this.bitmap2 = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        imageView.setBackgroundColor(Color.LTGRAY)
        imageView2.setBackgroundColor(Color.LTGRAY)

        drawBezierCurve()
        drawBezierCurve2()
    }

    private fun drawBezierCurve() {
        val p = Paint()
        p.strokeWidth = 5f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap!!)

        //二階
        val path = Path()
        path.moveTo(0f, 0f)
        path.quadTo(250f, 250f, 500f, 0f)

        canvas.drawPath(path, p)

        imageView.setImageBitmap(bitmap)
    }

    private fun drawBezierCurve2() {
        val p = Paint()
        p.strokeWidth = 5f
        p.color = Color.RED
        p.style = Paint.Style.STROKE

        val canvas = Canvas(bitmap2!!)

        //三階
        val path = Path()
        path.moveTo(0f, 0f)
        path.cubicTo(125f, 250f, 375f, 0f, 500f, 250f)

        canvas.drawPath(path, p)

        imageView2.setImageBitmap(bitmap2)
    }
}
