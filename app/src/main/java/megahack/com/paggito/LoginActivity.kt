package megahack.com.paggito

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import megahack.com.paggito.extension.acaoBotaoLogin

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        acaoBotaoLogin()

    }
}
