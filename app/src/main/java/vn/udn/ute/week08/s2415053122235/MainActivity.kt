package vn.udn.ute.week08.s2415053122235
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity: AppCompatActivity(){
    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.etName)
        val etQT = findViewById<EditText>(R.id.etQT)
        val etCK = findViewById<EditText>(R.id.etCK)
        val tvErrName = findViewById<TextView>(R.id.tvErrName)
        val tvErrQT = findViewById<TextView>(R.id.tvErrQT)
        val tvErrCk = findViewById<TextView>(R.id.tvErrCK)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnCheck = findViewById<Button>(R.id.btnCheck)
        val btnClear = findViewById<Button>(R.id.btnClear)
        fun validate(): Triple<String, Double, Double>?{
            tvErrName.visibility= View.GONE
            tvErrQT.visibility= View.GONE
            tvErrCk.visibility= View.GONE
            tvResult.text=""
            val name= etName.Binding.
        }
    }
}
