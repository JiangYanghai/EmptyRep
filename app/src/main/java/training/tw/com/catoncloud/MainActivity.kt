package training.tw.com.catoncloud

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var mBtnLogin: Button
    private lateinit var mEditUsername: EditText
    private lateinit var mEditPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mEditUsername = findViewById(R.id.user_name) as EditText
        mEditPassword = findViewById(R.id.pwd) as EditText
        mBtnLogin = findViewById(R.id.button_login) as Button

        mBtnLogin.setOnClickListener {
            var usernmae = mEditUsername.editableText.toString()
            var password = mEditPassword.editableText.toString()
            Log.i("cat", usernmae + " : " + password)
        }
    }
}
