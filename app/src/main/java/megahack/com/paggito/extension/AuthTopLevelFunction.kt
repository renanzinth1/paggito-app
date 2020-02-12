package megahack.com.paggito.extension

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import megahack.com.paggito.MainActivity

fun validate(cpf: String, senha: String): Boolean {

    if(cpf.isEmpty() || cpf != "17673919788") {
        return false
    }

    if(senha.isEmpty() || senha != "123456") {
        return false
    }

    return true
}

fun AppCompatActivity.acaoBotaoLogin() {

    btn_login.setOnClickListener {

        val cpfDigitado = et_cpf.text.toString()
        val senhaDigitada = et_senha.text.toString()

        if (validate(cpfDigitado, senhaDigitada)) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        else
            Toast.makeText(this, "Usuário ou senha inválida!", Toast.LENGTH_LONG)
                .show()
    }

}